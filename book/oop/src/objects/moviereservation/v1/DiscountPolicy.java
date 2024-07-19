package objects.moviereservation.v1;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
