package objects.tiketsales;

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
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusMoney(ticket.getFee());
            ticketSeller.getTicketOffice().minusMoney(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
