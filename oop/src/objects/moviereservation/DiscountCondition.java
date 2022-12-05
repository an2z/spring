package objects.moviereservation;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
