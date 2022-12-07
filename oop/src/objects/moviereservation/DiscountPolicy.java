package objects.moviereservation;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
