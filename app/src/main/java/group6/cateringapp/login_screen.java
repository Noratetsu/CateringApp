package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_screen extends AppCompatActivity {
    Button b_login, b_signup;
    EditText u_name, password;
  //  dbmgr helper = dbmgr.getInstance(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        dbmgr db = dbmgr.getInstance(this);
        b_login = (Button) findViewById(R.id.b_login);
        b_signup = (Button) findViewById(R.id.b_signup);
        u_name = (EditText) findViewById(R.id.u_name);
        password = (EditText) findViewById(R.id.password);

        b_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //openCatererScreen();
                String name = u_name.getText().toString();
                String pass = password.getText().toString();
                //openCatererScreen();
                dbmgr handler = dbmgr.getInstance(login_screen.this);
                String password = handler.searchPass(name);
                String usertype = handler.searchUserType(name);
                if(pass.equals(password)){
                    if (usertype.equals("caterer") || usertype.equals("Caterer")){
                   openCatererScreen();
                   finish();}
                    else if (usertype.equals("user") || usertype.equals("User")){
                        openUserScreen();
                    }
                    else if (usertype.equals("staff") || usertype.equals("Staff")){
                        openStaffScreen();
                    }
                   else{
                        Toast.makeText(login_screen.this, "Invalid Usertype!!",Toast.LENGTH_SHORT).show();
                    }
                }
               else{
                    Toast.makeText(login_screen.this, "Wrong Password!!",Toast.LENGTH_SHORT).show();
                }

            }


        });

        b_signup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                openRegistrationScreen();
            }
        });
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
        Intent intent = new Intent(this,staff_homepage.class);
        startActivity(intent);

    }

    private void openRegistrationScreen(){
          Intent intent = new Intent(this, registration_form.class);
          startActivity(intent);
        }


}
