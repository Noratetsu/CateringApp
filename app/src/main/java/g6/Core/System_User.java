package g6.Core;

/**
 * Created by Brandon Keen on 4/27/2018.
 */

public class System_User {
    private String userName;
    private String password;
    private String lastName;
    private String firstName;
    private Role role;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;
    private String state;
    private String zip;

    public System_User()
    {
        this("","","","",null,"","","","","","");
    }
    System_User(String uname,String pw, String lName, String fName, Role r, String pn, String e, String address,String city, String state, String zip)
    {
        userName = uname;
        password = pw;
        lastName = lName;
        firstName = fName;
        role = r;
        phoneNumber = pn;
        email = e;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }



}



