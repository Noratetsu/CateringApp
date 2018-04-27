package g6.Resources;

/**
 * Created by Brandon Keen on 4/25/2018.
 */

public enum MealFormality {
    Informal("Informal"),Formal("Formal");
    private final String formality;
    MealFormality(final String mf)
    {
        formality = mf;
    }

    @Override
    public String toString()
    {
        return formality;
    }

}
