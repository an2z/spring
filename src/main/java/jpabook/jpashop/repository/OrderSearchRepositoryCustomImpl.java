package jpabook.jpashop.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import java.util.List;

import static jpabook.jpashop.domain.QOrder.order;

@RequiredArgsConstructor
public class OrderRepositoryCustomImpl implements OrderRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Page<Order> search(OrderSearch orderSearch, Pageable pageable) {

        return null;
    }

    private List<Order> searchResult(OrderSearch orderSearch, Pageable pageable) {
        return jpaQueryFactory
                .select(order)
                .from(order)
                .where(
                        memberNameEq(orderSearch.getMemberName()),
                        orderStatusEq(orderSearch.getOrderStatus())
                )
                .fetch();
    }

    private BooleanExpression memberNameEq(String memberName) {
        return StringUtils.hasText(memberName) ? order.member.name.eq(memberName) : null;
    }

    private BooleanExpression orderStatusEq(OrderStatus orderStatus) {
        return orderStatus != null ? order.status.eq(orderStatus) : null;
    }

}
