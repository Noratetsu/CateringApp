package group6.cateringapp;

/**
 * Created by ssaze on 4/27/2018.
 */

public class SignUpDetails {
    String first_name, last_name, user_name, password, user_type, email, phone, address, city;
    int id;
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }
    public String getFirst_name (){
        return this.first_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }
    public String getLast_name (){
        return this.last_name;
    }

    public void setUser_name(String user_name){
        this.user_name = user_name;
    }
    public String getUser_name (){
        return this.user_name;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword (){
        return this.password;
    }

    public void setUser_type(String user_type){
        this.user_type = user_type;
    }
    public String getUser_type (){
        return this.user_type;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail (){
        return this.email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone (){
        return this.phone;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress (){
        return this.address;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getCity (){
        return this.city;
    }

}
