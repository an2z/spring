package hellojpa;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Parent {
    @Id
    @GeneratedValue
    @Column(name = "parent_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "parent")
    private List<Child> childList = new ArrayList<>();

    /**
     * 연관관계 편의 메소드
     */
    public void addChild(Child child) {
        childList.add(child);
        child.setParent(this);
    }
}
