public class StudentAdvanceTicket extends AdvanceTicket{

    public StudentAdvanceTicket (int number, int days) {
        super(number, days);
    }
    public double getPrice() {
        return super.getPrice()/2;
    }
    public String toString() {
        return super.toString() + " (ID required)";
    }
}

