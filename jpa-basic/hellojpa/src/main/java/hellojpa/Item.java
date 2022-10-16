package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
//@DiscriminatorColumn // 생략 가능
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 상속관계 매핑 (단일 테이블 전략)
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int price;
}
