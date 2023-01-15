package mvc.servlet.web.frontcontroller.v2.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.servlet.domain.member.Member;
import mvc.servlet.domain.member.MemberRepository;
import mvc.servlet.web.frontcontroller.MyView;
import mvc.servlet.web.frontcontroller.v2.ControllerV2;

public class MemberListControllerV2 implements ControllerV2 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 회원 목록 조회
        List<Member> members = memberRepository.findAll();

        // 모델에 데이터 저장
        request.setAttribute("members", members);

        return new MyView("/WEB-INF/views/members.jsp");
    }
}
