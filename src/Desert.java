public class Desert {
    int units;
    String flavor;

    public String toString(){
        return "s u g a r";
    }

    public Desert(int units, String flavor) {
        this.units = units;
        this.flavor = flavor;
    }

    public double Price()
    {
        double flavorCost;
        if (flavor.equalsIgnoreCase("vanilla"))
            flavorCost = .5;
        else
            flavorCost = 1;

        return units * flavorCost;
    }
}
