package hellojpa;

import javax.persistence.*;

@Entity
public class MemberProduct {
    @Id
    @GeneratedValue
    private Long id;
}
