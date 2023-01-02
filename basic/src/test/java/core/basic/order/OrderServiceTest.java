package core.basic.order;

import static org.assertj.core.api.Assertions.assertThat;

import core.basic.AppConfig;
import core.basic.member.Grade;
import core.basic.member.Member;
import core.basic.member.MemberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderServiceTest {
    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    void setUp() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "member1", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "item1", 10000);

        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
