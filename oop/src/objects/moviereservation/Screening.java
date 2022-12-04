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
