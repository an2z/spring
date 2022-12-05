package objects.moviereservation;

import java.time.LocalDate;

/**
 * 상영
 */
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDate whenScreened;

    public Screening(Movie movie, int sequence, LocalDate whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    /**
     * 영화를 예매하는 기능
     */
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public LocalDate getStartTime() {
        return whenScreened;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }
}
