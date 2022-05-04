package hello.login.web;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;

//    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/")
    public String homeLogin(@CookieValue(name = "memberId", required = false) Long memberId, Model model) {
        // 로그인 쿠키가 없는 경우
        if (memberId == null) {
            return "home";
        }

        // 로그인 쿠키가 있는 경우
        Member loginMember = memberRepository.findById(memberId);
        if (loginMember == null) { // 쿠키가 있어도 회원이 없는 경우
            return "home";
        }

        model.addAttribute("member", loginMember);
        return "loginHome"; // 로그인 사용자 전용 홈 화면으로 이동
    }

}