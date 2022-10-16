package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Setter
@Getter
@DiscriminatorValue("M") // DTYPE 이름 지정 (지정하지 않으면 클래스명 사용)
public class Movie extends Item {
    private String director;

    private String actor;
}
