package group6.cateringapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import g6.Core.System_User;

import g6.Database.dbmgr;
import g6.Database.UserTable;

public class update_user_profile extends AppCompatActivity {
    Button b_update;
    dbmgr helper = dbmgr.getInstance(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_user_profile);
        getSupportActionBar().setTitle("Update Profile");

    }

    public void onUpdateClick(View v) {
        if (v.getId() == R.id.b_update) {
            EditText first_name = (EditText) findViewById(R.id.f_name);
            EditText last_name = (EditText) findViewById(R.id.l_name);
            EditText ID = (EditText) findViewById(R.id.uta_id);
            EditText user_name = (EditText) findViewById(R.id.u_name);
            EditText password = (EditText) findViewById(R.id.password);
            EditText user_type = (EditText) findViewById(R.id.user_type);
            EditText email = (EditText) findViewById(R.id.email);
            EditText phone = (EditText) findViewById(R.id.phone_num);
            EditText address = (EditText) findViewById(R.id.st_address);
            EditText city = (EditText) findViewById(R.id.city);


            String first_name_str = first_name.getText().toString();
            String last_name_str = last_name.getText().toString();
            String ID_str = ID.getText().toString();
            String user_name_str = user_name.getText().toString();
            String password_str = password.getText().toString();
            String user_type_str = user_type.getText().toString();
            String email_str = email.getText().toString();
            String phone_str = phone.getText().toString();
            String address_str = address.getText().toString();
            String city_str = city.getText().toString();

            SignUpDetails c = new SignUpDetails();
            c.setFirst_name(first_name_str);
            c.setLast_name(last_name_str);
            c.setId(ID_str);
            c.setUser_name(user_name_str);
            c.setPassword(password_str);
            c.setUser_type(user_type_str);
            c.setEmail(email_str);
            c.setPhone(phone_str);
            c.setAddress(address_str);
            c.setCity(city_str);

            helper.InsertDetails(c);

            if (user_type_str.equals("caterer") || user_type_str.equals("Caterer")) {
                openCatererScreen();
                finish();
            } else if (user_type_str.equals("user") || user_type_str.equals("User")) {
                openUserScreen();
            } else if (user_type_str.equals("staff") || user_type_str.equals("Staff")) {
                openStaffScreen();
            } else {
                Toast.makeText(update_user_profile.this, "Invalid Usertype!!", Toast.LENGTH_SHORT).show();
            }


        }

    }


private void openCatererScreen(){

        Intent intent = new Intent(this,caterer_home.class);
        startActivity(intent);
}

private void openUserScreen(){

        Intent intent = new Intent(this,user_homepage.class);
        startActivity(intent);

    }

private void openStaffScreen(){

        Intent intent = new Intent(this,staff_home.class);
        startActivity(intent);

    }


}
