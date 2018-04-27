package g6.Resources;

/**
 * Created by Brandon Keen on 4/25/2018.
 */

public enum Meal {
    Breakfast("Breakfast",8),Lunch("Lunch",12),Dinner("Dinner",18);

    private final String meal;
    private final int cost;

    Meal(final String m, int co)
    {
        meal = m;
        cost = co;
    }

    @Override
    public String toString()
    {
        return meal;
    }

    public int getCost() {
        return cost;
    }


}
