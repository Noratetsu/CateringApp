package g6.Database;

import android.provider.BaseColumns;

import g6.Core.User;

/**
 * Created by Brandon Keen on 4/29/2018.
 */

public final class UserTable {

    private UserTable(){}

    public static class UserTableInfo implements BaseColumns
    {
        public static final String TABLE_NAME = "Users";
        public static final String COLUMN_ID = "UTAID";
        public static final String COLUMN_FIRST_NAME = "FirstName";
        public static final String COLUMN_LAST_NAME = "LastName";
        public static final String COLUMN_USERNAME = "Username";
        public static final String COLUMN_USER_TYPE = "UserType";
        public static final String COLUMN_EMAIL = "Email";
        public static final String COLUMN_PHONE = "Phone";
        public static final String COLUMN_ADDRESS = "Address";
        public static final String COLUMN_CITY = "City";

    }

    public static final String CreateSQLTable = "CREATE TABLE " + UserTableInfo.TABLE_NAME + "("+
            UserTableInfo.COLUMN_ID + " INTEGER PRIMARY KEY," + UserTableInfo.COLUMN_FIRST_NAME + " TEXT," +
            UserTableInfo.COLUMN_LAST_NAME + " TEXT," + UserTableInfo.COLUMN_USERNAME + " TEXT," +
            UserTableInfo.COLUMN_USER_TYPE + " TEXT," + UserTableInfo.COLUMN_EMAIL + " Text," +
            UserTableInfo.COLUMN_PHONE + " TEXT," + UserTableInfo.COLUMN_ADDRESS + " TEXT," +
            UserTableInfo.COLUMN_CITY + "TEXT);";

}
