package hellojpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

import static lombok.AccessLevel.PROTECTED;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
public class Period {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
