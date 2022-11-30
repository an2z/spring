package objects.tiketsales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 매표소
 */
public class TicketOffice {
    private Long money;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long money, Ticket... tickets) {
        this.money = money;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusMoney(Long money) {
        this.money -= money;
    }

    public void plusMoney(Long money) {
        this.money += money;
    }
}
