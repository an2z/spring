package core.basic.member;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        Member member = new Member(1L, "member1", Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.findMember(member.getId());

        assertThat(member).isEqualTo(findMember);
    }
}
