package g6.enums;

/**
 * Created by Brandon Keen on 4/25/2018.
 */

public enum DrinkType {
    Standard("Standard", 0), Alcoholic("Alcoholic", 15);

    private final String dt;
    private final int cost;

    DrinkType(final String d, final int co)
    {
        dt = d;
        cost = co;
    }

    @Override
    public String toString()
    {
        return dt;
    }

    public int getCost() {
        return cost;
    }

}
