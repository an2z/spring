package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderRepositoryCustom {

    Page<Order> search(OrderSearch orderSearch, Pageable pageable);

}
