package core.basic.order;

import core.basic.discount.DiscountPolicy;
import core.basic.discount.FixDiscountPolicy;
import core.basic.member.Member;
import core.basic.member.MemberRepository;
import core.basic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    MemberRepository memberRepository = new MemoryMemberRepository();
    DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
