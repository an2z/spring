package core.basic.discount;

import core.basic.annotation.MainDiscountPolicy;
import core.basic.member.Grade;
import core.basic.member.Member;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {
    private int discountAmount = 10; // 10% 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountAmount / 100;
        }
        return 0;
    }
}
