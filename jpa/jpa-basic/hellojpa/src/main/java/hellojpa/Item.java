package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // 상속관계 매핑 (구현 클래스마다 테이블 전략)
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int price;
}
