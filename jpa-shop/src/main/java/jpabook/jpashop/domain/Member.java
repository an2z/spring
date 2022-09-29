package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded // 내장 타입을 포함
    private Address address;

    @OneToMany(mappedBy = "member") // mappedBy -> 읽기 전용, 매핑된 거울임을 명시
    private List<Order> orders = new ArrayList<>();

}
