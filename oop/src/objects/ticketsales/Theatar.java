package objects.ticketsales;

/**
 * 소극장
 */
public class Theatar {
    private TicketSeller ticketSeller;

    public Theatar(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 관람객 입장
     */
    public void enter(Audience audience) {
        ticketSeller.sell(audience);
    }
}
