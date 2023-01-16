package mvc.servlet.web.frontcontroller.v5.adapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.servlet.web.frontcontroller.ModelView;
import mvc.servlet.web.frontcontroller.MyView;
import mvc.servlet.web.frontcontroller.v3.controller.MemberFormControllerV3;
import mvc.servlet.web.frontcontroller.v3.controller.MemberListControllerV3;
import mvc.servlet.web.frontcontroller.v3.controller.MemberSaveControllerV3;
import mvc.servlet.web.frontcontroller.v5.MyHandlerAdapter;

@WebServlet(name = "frontControllerServletV5", urlPatterns = "/front-controller/v5/*")
public class FrontControllerServletV5 extends HttpServlet {

    private final Map<String, Object> handlerMappingMap = new HashMap<>(); // 매핑 정보가 담긴 맵(여러 컨트롤러 호환을 위해 Object 사용)
    private final List<MyHandlerAdapter> handlerAdapters = new ArrayList<>(); // 어댑터가 담긴 리스트

    public FrontControllerServletV5() {
        initHandlerMappingMap();
        initHandlerAdapters();
    }

    private void initHandlerMappingMap() {
        handlerMappingMap.put("/front-controller/v5/v3/members/new-form", new MemberFormControllerV3());
        handlerMappingMap.put("/front-controller/v5/v3/members/save", new MemberSaveControllerV3());
        handlerMappingMap.put("/front-controller/v5/v3/members", new MemberListControllerV3());
    }

    private void initHandlerAdapters() {
        handlerAdapters.add(new ControllerV3HandlerAdapter());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Object handler = getHandler(request); // 요청 정보를 가지고 핸들러를 찾음

        // 매핑되는 핸들러가 없으면
        if (handler == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND); // 404 오류
            return;
        }

        // 매핑되는 핸들러가 있으면
        MyHandlerAdapter adapter = getHandlerAdapter(handler); // 해당 핸들러를 지원하는 어댑터를 찾음

        ModelView mv = adapter.handle(request, response, handler); // 어댑터를 통해 핸들러를 호출

        String viewName = mv.getViewName(); // 뷰 논리이름을 꺼냄
        MyView view = viewResolver(viewName); // 뷰 리졸버 호출

        view.render(mv.getModel(), request, response); // 모델 정보를 넘기며 render 호출
    }

    private MyHandlerAdapter getHandlerAdapter(Object handler) {
        for (MyHandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(handler)) { // 어댑터가 해당 핸들러를 지원하면
                return adapter; // 어댑터 선택
            }
        }
        // 지원하는 어댑터가 없으면 예외 발생
        throw new IllegalArgumentException("handler adapter를 찾을 수 없습니다. handler=" + handler);
    }

    private Object getHandler(HttpServletRequest request) {
        String requestURI = request.getRequestURI(); // 클라이언트가 요청한 URI를 그대로 받음
        return handlerMappingMap.get(requestURI); // 요청 URI에 매핑되는 핸들러를 찾아서 반환
    }

    private MyView viewResolver(String viewName) {
        return new MyView("/WEB-INF/views/" + viewName + ".jsp"); // 뷰 논리이름을 가지고 실제 물리 이름을 만들어 MyView 객체를 반환
    }
}
