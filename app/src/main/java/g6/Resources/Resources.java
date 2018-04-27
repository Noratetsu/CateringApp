package g6.Resources;

/**
 * Created by Noratetsu on 4/25/2018.
 */

public class Resources {

    private final static double HALLCOST = 2;
    private DrinkType drinks = null;
    private EntertainmentItems entertain = null;
    private Meal meal = null;
    private MealType mealType = null;
    private MealFormality mealFormality = null;
    private Hall hall = null;


    private double totalCost;

    public Resources()
    {
        totalCost = 0;
    }

    public Resources(DrinkType drinks, Meal meal, MealType mealType, MealFormality mealFormality, Hall hall) {
        this();
        this.drinks = drinks;
        this.meal = meal;
        this.mealType = mealType;
        this.mealFormality = mealFormality;
        this.hall = hall;
    }

    public DrinkType getDrinks() {
        return drinks;
    }

    public void setDrinks(DrinkType drinks) {
        this.drinks = drinks;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public MealFormality getMealFormality() {
        return mealFormality;
    }

    public void setMealFormality(MealFormality mealFormality) {
        this.mealFormality = mealFormality;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public double getTotalCost() {
        return totalCost;
    }

    /**
     * function will calcuate the cost of the event based on resources.
     * @param time amount of time the hall is reserved
     * @param attendees amount of people attending event.
     * @return total cost of event based on resources used.
     */
    public double calculateCost(int time, int attendees)
    {
        double totalCost = 0;
        double tempCost = 0;
        totalCost += hall.getCapacity()*time*HALLCOST;
        tempCost = attendees*meal.getCost();
        totalCost += tempCost;
        if(mealFormality.equals(MealFormality.Formal))
        {
            tempCost = tempCost*1.5;
            totalCost += tempCost;
        }
        if(drinks.equals(DrinkType.Alcoholic))
        {
            totalCost += drinks.getCost()*attendees;
        }
        this.totalCost = totalCost;
        return totalCost;
    }
}
