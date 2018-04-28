package g6.Core;

/**
 * Created by Brandon Keen on 4/27/2018.
 */

public class User extends System_User {
    int utaID;

    public User(int utaID) {
       utaID = 0;
    }

    public User(String uname, String pw, String lName, String fName, Role r, String pn, String e, String address, String city, String state, String zip) {
        super(uname, pw, lName, fName, r, pn, e, address, city, state, zip);
        utaID = 0;
    }
}
