package objects.moviereservation;

/**
 * 영화
 */
public class Movie {
    private Money fee;

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee;
    }
}
