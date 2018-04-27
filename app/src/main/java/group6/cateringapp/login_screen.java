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
    //dbmgr helper = new dbmgr(this);
    //dbmgr helper = new dbmgr(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        dbmgr db = new dbmgr(this);
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
               dbmgr handler = new dbmgr(login_screen.this);
                String password = handler.searchPass(name);

                if(pass.equals(password)){

                   openCatererScreen();
                   finish();
                }
               else{
                    Toast.makeText(login_screen.this, "Wrong Password!!",Toast.LENGTH_SHORT).show();
                }
               /* SignUpDetails user = handler.retrieveUser(name,pass);

                if (user != null) {
                    openCatererScreen();
                    finish();
                } else {
                    Toast.makeText(login_screen.this, "WRONG EMAIL ID OR PASSWORD", Toast.LENGTH_LONG).show();
                }
                /* String password = helper.searchPass(name);//searching password associated with uname in the database
                if(pass.equals(password)){

                    openCatererScreen();

                }
                else{
                    Toast.makeText(getApplicationContext(), "Wrong Password!!",Toast.LENGTH_SHORT).show();
                }

                */
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

        private void openRegistrationScreen(){
          Intent intent = new Intent(this, registration_form.class);
          startActivity(intent);
        }


}
