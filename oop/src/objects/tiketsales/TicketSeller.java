package objects.tiketsales;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sell(Audience audience) {
        ticketOffice.sellTicket(audience);
    }
}

