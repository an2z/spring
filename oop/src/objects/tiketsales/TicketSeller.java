package objects.tiketsales;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sell(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        ticketOffice.plusMoney(audience.buy(ticket));
    }
}

