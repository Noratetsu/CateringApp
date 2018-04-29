package group6.cateringapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import g6.Database.dbmgr;

public class registration_form extends AppCompatActivity {
    dbmgr helper = dbmgr.getInstance(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
        Button b_cancel = (Button)findViewById(R.id.b_cancel);
        b_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            openLoginPage();
            };
        });
    }
    private void openLoginPage(){
        Intent intent = new Intent(this,login_screen.class);
        startActivity(intent);

    };

    public void onRegisterClick(View v){

        if(v.getId()==R.id.b_register)
        {
            EditText first_name = (EditText)findViewById(R.id.f_name);
            EditText last_name = (EditText)findViewById(R.id.l_name);
            EditText user_name = (EditText)findViewById(R.id.u_name);
            EditText password = (EditText)findViewById(R.id.password);
            EditText user_type = (EditText)findViewById(R.id.user_type);
            EditText email = (EditText)findViewById(R.id.email);
            EditText phone = (EditText)findViewById(R.id.phone_num);
            EditText address = (EditText)findViewById(R.id.st_address);
            EditText city = (EditText)findViewById(R.id.city);

            String first_name_str = first_name.getText().toString();
            String last_name_str = last_name.getText().toString();
            String user_name_str = user_name.getText().toString();
            String password_str = password.getText().toString();
            String user_type_str = user_type.getText().toString();
            String email_str = email.getText().toString();
            String phone_str = phone.getText().toString();
            String address_str = address.getText().toString();
            String city_str = city.getText().toString();

            Toast.makeText(getApplicationContext(), "Account Created!!",Toast.LENGTH_SHORT).show();
            //insert details in database
            SignUpDetails c = new SignUpDetails();
            c.setFirst_name(first_name_str);
            c.setLast_name(last_name_str);
            c.setUser_name(user_name_str);
            c.setPassword(password_str);
            c.setUser_type(user_type_str);
            c.setEmail(email_str);
            c.setPhone(phone_str);
            c.setAddress(address_str);
            c.setCity(city_str);

            helper.InsertDetails(c);
            Intent intent = new Intent(this, login_screen.class);
            startActivity(intent);//return back to login page.
        }
    }






}
