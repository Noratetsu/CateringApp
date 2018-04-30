package g6.Database;

import android.provider.BaseColumns;

import g6.Core.User;

/**
 * Created by Brandon Keen on 4/29/2018.
 */

public final class UserTable {

    private UserTable(){}

    public static class TableInfo implements BaseColumns
    {
        public static final String TABLE_NAME = "Users";
        public static final String COLUMN_ID = "ID";
        public static final String COLUMN_FIRST_NAME = "FirstName";
        public static final String COLUMN_LAST_NAME = "LastName";
        public static final String COLUMN_USERNAME = "Username";
        public static final String COLUMN_PASSWORD = "Password";
        public static final String COLUMN_USER_TYPE = "UserType";
        public static final String COLUMN_EMAIL = "Email";
        public static final String COLUMN_PHONE = "Phone";
        public static final String COLUMN_ADDRESS = "Address";
        public static final String COLUMN_CITY = "City";

    }

    public static final String CreateSQLTable = "CREATE TABLE " + TableInfo.TABLE_NAME + "("+
            TableInfo.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + TableInfo.COLUMN_FIRST_NAME + " TEXT," +
            TableInfo.COLUMN_LAST_NAME + " TEXT," + TableInfo.COLUMN_USERNAME + " TEXT," + TableInfo.COLUMN_PASSWORD + " TEXT," +
            TableInfo.COLUMN_USER_TYPE + " TEXT," + TableInfo.COLUMN_EMAIL + " TEXT," + TableInfo.COLUMN_PHONE + " TEXT," +
            TableInfo.COLUMN_ADDRESS + " TEXT," + TableInfo.COLUMN_CITY + " TEXT);";

}
