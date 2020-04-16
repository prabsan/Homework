public class Ticket {
    int number;
    int days;

    public Ticket(int number, int days) {
        this.number = number;
        this.days = days;
    }

    public double getPrice() {
        return 50;
    }

    public String toString() {
        return "Number: " + this.number + ", Price: " + this.getPrice();
    }
}
