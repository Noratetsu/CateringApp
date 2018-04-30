package g6.Database;

/**
 * Created by Brandon Keen on 4/30/2018.
 */

public final class ResourceTable {
    public static class TableInfo {
        public static final String TABLE_NAME = "Resources";
        public static final String COLUMN_ID = "EID";
        public static final String COLUMN_DRINKTYPE = "DrinkType";
        public static final String COLUMN_HALL = "Hall";
        public static final String COLUMN_MEAL = "Meal";
        public static final String COLUMN_MEALFORMALITY = "MealFormality";
        public static final String COLUMN_MEALTYPE = "MealType";


    }

    public static final String CreateSQLTable = "CREATE TABLE " + TableInfo.TABLE_NAME + "(" +
            TableInfo.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + TableInfo.COLUMN_DRINKTYPE + " TEXT," +
            TableInfo.COLUMN_HALL + " TEXT," + TableInfo.COLUMN_MEAL + " TEXT," + TableInfo.COLUMN_MEALTYPE + " TEXT," +
            TableInfo.COLUMN_MEALFORMALITY + " TEXT);";
}