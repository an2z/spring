package mvc.servlet.web.frontcontroller.v2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.servlet.domain.member.Member;
import mvc.servlet.domain.member.MemberRepository;
import mvc.servlet.web.frontcontroller.MyView;
import mvc.servlet.web.frontcontroller.v2.ControllerV2;

public class MemberSaveControllerV2 implements ControllerV2 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // HTTP 요청 데이터 받기
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        // 회원 생성 및 저장
        Member member = new Member(username, age);
        memberRepository.save(member);

        // 모델에 데이터 보관
        request.setAttribute("member", member);
  
        return new MyView("/WEB-INF/views/save-result.jsp");
    }
}
