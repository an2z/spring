package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.*;

import static javax.persistence.EnumType.*;

@Getter
@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;

    private String city;

    private String street;

    private String zipCode;

    @Enumerated(STRING)
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;

}
