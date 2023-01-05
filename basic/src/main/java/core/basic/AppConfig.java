package core.basic;

import core.basic.discount.DiscountPolicy;
import core.basic.discount.RateDiscountPolicy;
import core.basic.member.MemberRepository;
import core.basic.member.MemberService;
import core.basic.member.MemberServiceImpl;
import core.basic.member.MemoryMemberRepository;
import core.basic.order.OrderService;
import core.basic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
