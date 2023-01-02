package core.basic;

import core.basic.discount.DiscountPolicy;
import core.basic.discount.RateDiscountPolicy;
import core.basic.member.MemberRepository;
import core.basic.member.MemberService;
import core.basic.member.MemberServiceImpl;
import core.basic.member.MemoryMemberRepository;
import core.basic.order.OrderService;
import core.basic.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
