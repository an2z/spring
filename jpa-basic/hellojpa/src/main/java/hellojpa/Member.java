package hellojpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "user_name")
    private String username;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id")
    private Team team;

    @Embedded
    private Period period;

    @Embedded
    @AttributeOverride(name = "street", column = @Column(name = "home_street"))
    @AttributeOverride(name = "zipcode", column = @Column(name = "home_zipcode"))
    @AttributeOverride(name = "city", column = @Column(name = "home_city"))
    private Address homeAddress;

    @Embedded
    @AttributeOverride(name = "street", column = @Column(name = "work_street"))
    @AttributeOverride(name = "zipcode", column = @Column(name = "work_zipcode"))
    @AttributeOverride(name = "city", column = @Column(name = "work_city"))
    private Address workAddress;
}
