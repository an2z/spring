package objects.tiketsales;

/**
 * 관람객이 소지품을 보관할 가방
 */
public class Bag {
    private Long money;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long money) {
        this.money = money;
    }

    public Bag(Long money, Invitation invitation) {
        this.money = money;
        this.invitation = invitation;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusMoney(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    private void minusMoney(Long money) {
        this.money -= money;
    }

    public void plusMoney(Long money) {
        this.money += money;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
