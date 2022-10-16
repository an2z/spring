package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED) // 상속관계 매핑 (조인 전략)
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int price;
}
