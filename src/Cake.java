public class Cake extends Desert {
    boolean topping;

    public Cake (int units, String flavor, boolean topping) {
        super(units, flavor);
        this.topping = topping;
    }

    public double Price() {
        double toppingCost = 0;

        if(topping) {
            toppingCost = .50;
        }
        double flavorCost;
        if (super.flavor.equalsIgnoreCase("vanilla"))
            flavorCost = 2.5;
        else
            flavorCost = 3.5;

        return units * (toppingCost + flavorCost);
    }
}
