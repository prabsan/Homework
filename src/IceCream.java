public class IceCream extends Desert {
    private String containerType;
    private int numOfScoops = 0;

    public IceCream (String type, String flavor, int scoops, int units) {
        super(units, flavor);
        containerType = type;
        numOfScoops = scoops;
    }

    public double Price() {
        double containerCost;

        if (containerType.equalsIgnoreCase("cup"))
            containerCost = .25;
        else
            containerCost = 1;

        double flavorCost;
        if (super.flavor.equalsIgnoreCase("vanilla"))
            flavorCost = 2;
        else
            flavorCost = 2.5;

        return super.units * (containerCost + (flavorCost * numOfScoops));
    }
}