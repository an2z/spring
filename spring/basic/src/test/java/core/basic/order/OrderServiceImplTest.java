package core.basic.order;

import static org.assertj.core.api.Assertions.assertThat;

import core.basic.discount.FixDiscountPolicy;
import core.basic.member.Grade;
import core.basic.member.Member;
import core.basic.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

class OrderServiceImplTest {
    @Test
    void createOrder() {
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberRepository.save(member);

        Order order = orderService.createOrder(1L, "itemA", 1000);

        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
