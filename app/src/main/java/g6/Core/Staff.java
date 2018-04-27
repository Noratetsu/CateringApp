package g6.Core;

/**
 * Created by Brandon Keen on 4/27/2018.
 */

public class Staff extends System_User {
    private int sID;

    public Staff() {
        sID = 0;
    }

    public Staff(String uname, String pw, String lName, String fName, Role r, String pn, String e, String address, String city, String state, String zip) {
        super(uname, pw, lName, fName, r, pn, e, address, city, state, zip);
        sID = 0;
    }
}
