package mvc.servlet.web.frontcontroller.v3;

import java.io.IOException;
import java.util.HashMap;
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

@WebServlet(name = "frontControllerServletV3", urlPatterns = "/front-controller/v3/*")
public class FrontControllerServletV3 extends HttpServlet {

    private final Map<String, ControllerV3> controllerMap = new HashMap<>();

    public FrontControllerServletV3() {
        // 매핑 정보를 담음 (해당 url이 오면 매핑 정보를 통해 각 컨트롤러를 호출)
        controllerMap.put("/front-controller/v3/members/new-form", new MemberFormControllerV3());
        controllerMap.put("/front-controller/v3/members/save", new MemberSaveControllerV3());
        controllerMap.put("/front-controller/v3/members", new MemberListControllerV3());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("FrontControllerServletV3.service"); // 정상 동작 확인

        String requestURI = request.getRequestURI(); // 클라 이언트가 요청한 URI를 그대로 받음

        ControllerV3 controller = controllerMap.get(requestURI); // 받은 URI 정보를 가지고 매핑되는 컨트롤러를 찾음

        // 매핑되는 컨트롤러가 없으면
        if (controller == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND); // 404 오류
            return;
        }

        // 매핑되는 컨트롤러가 있으면
        Map<String, String> paramMap = createParamMap(request); // paramMap 생성

        ModelView mv = controller.process(paramMap); // 컨트롤러 호출 -> 뷰 논리이름을 가진 모델 뷰가 반환됨

        String viewName = mv.getViewName(); // 뷰 논리이름을 꺼냄(new-form)
        MyView view = viewResolver(viewName); // 뷰 리졸버를 호출 -> MyView 객체가 반환됨

        view.render(mv.getModel(), request, response); // 모델 정보를 넘기며 render 호출
    }

    private MyView viewResolver(String viewName) {
        // 뷰 논리이름을 가지고 실제 물리 이름을 만들어 MyView 객체를 반환
        return new MyView("/WEB-INF/views/" + viewName + ".jsp");
    }

    private Map<String, String> createParamMap(HttpServletRequest request) {
        Map<String, String> paramMap = new HashMap<>();
        request.getParameterNames() // request의 모든 파라미터의 이름을 가져옴
                .asIterator() // 하나씩 꺼내와서
                .forEachRemaining(
                        paramName -> paramMap.put(paramName, request.getParameter(paramName))); // paramMap에 저장
        return paramMap;
    }
}
