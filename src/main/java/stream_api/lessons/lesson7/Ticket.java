package stream_api.lessons.lesson7;

public class Ticket implements Comparable<Ticket> {
    private String ticketClass;
    private int price;

    public Ticket(String ticketClass, int price) {
        this.ticketClass = ticketClass;
        this.price = price;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public int compareTo(Ticket ticket) {
        if (this.price > ticket.getPrice()) return 1;
        else if (this.price < ticket.getPrice()) return -1;
        else return 0;
    }
}

