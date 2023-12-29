package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * @MappedSuperclass 공통적으로 사용 할 속성에 사용
 * 상속 받는 자식 클래스에 매핑 정보만 제공
 * 직접 생성해서 사용할 일이 없으므로 추상 클래스 권장
 */
@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {
    private String createdBy;
    private LocalDateTime createdDate;
    private String lastModifiedBy;
    private LocalDateTime lastModifiedDate;
}
