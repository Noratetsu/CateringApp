package g6.enums;

/**
 * Created by Noreatetsu on 4/25/2018.
 */

public enum Meal {
    Breakfast("Breakfast"),Lunch("Lunch"),Dinner("Dinner");

    private final String meal;

    Meal(final String m)
    {
        meal = m;
    }

    @Override
    public String toString()
    {
        return meal;
    }


}
