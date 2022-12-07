package objects.moviereservation;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * 기간 할인 조건
 */
public class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().atStartOfDay().toLocalTime()) <= 0 &&
                endTime.compareTo(screening.getStartTime().atStartOfDay().toLocalTime()) >= 0;
    }
}
