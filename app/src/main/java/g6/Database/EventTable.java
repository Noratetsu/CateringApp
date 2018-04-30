package g6.Database;

/**
 * Created by Brandon Keen on 4/29/2018.
 */

public final class EventTable {
    private EventTable(){}

    public static class TableInfo
    {
        public static final String TABLE_NAME = "Events";
        public static final String COLUMN_ID = "EID";
        public static final String COLUMN_DATE = "Date";
        public static final String COLUMN_DURATION = "Duration";
        public static final String COLUMN_TIME = "Time";
        public static final String COLUMN_ATTENDANCE = "Attendance";
        public static final String COLUMN_EVENT_NAME = "EventName";
        public static final String COLUMN_STATUS = "Status";
        public static final String COLUMN_OCCASION = "Occasion";

    }

    public static final String CreateSQLTable = "CREATE TABLE " + TableInfo.TABLE_NAME + "("+
            TableInfo.COLUMN_ID + " INTEGER PRIMARY KEY,"+ TableInfo.COLUMN_DATE + " DATE," + TableInfo.COLUMN_DURATION + " INTEGER," +
            TableInfo.COLUMN_TIME + " DATETIME," + TableInfo.COLUMN_ATTENDANCE + " INTEGER," +
            TableInfo.COLUMN_EVENT_NAME + " TEXT," + TableInfo.COLUMN_STATUS + " INTEGER," +
            TableInfo.COLUMN_OCCASION + "TEXT);";

}
