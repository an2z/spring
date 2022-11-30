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

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void minusMoney(Long money) {
        this.money -= money;
    }

    public void plusMoney(Long money) {
        this.money += money;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
