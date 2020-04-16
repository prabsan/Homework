public class AdvanceTicket extends Ticket {

    public AdvanceTicket (int number, int days) {
        super(number, days);
    }

    public double getPrice() {
        double ticketCost;
        if(days > 10){
           return ticketCost = 40;
        }
        else{
            return ticketCost = 30;
        }
    }
}
