package objects.moviereservation.v1;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
