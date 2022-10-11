package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;

    private String city;

    private String street;

    private String zipCode;

    private DeliveryStatus status;

}
