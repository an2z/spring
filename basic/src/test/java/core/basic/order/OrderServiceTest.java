package core.basic.order;

import static org.assertj.core.api.Assertions.assertThat;

import core.basic.member.Grade;
import core.basic.member.Member;
import core.basic.member.MemberService;
import core.basic.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "member1", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "item1", 10000);

        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
