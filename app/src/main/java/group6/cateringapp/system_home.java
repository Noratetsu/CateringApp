package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class system_home extends AppCompatActivity {
    Button b_login, b_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_home);

        b_login = (Button) findViewById(R.id.b_login);
        b_register = (Button) findViewById(R.id.b_register);

        b_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // what happens after user clicks on Login goes here
                openLoginScreen();
                //
                //

            };
        });

        b_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //what happens after user clicks on register goes here
                openRegistrationScreen();
                //
                //

            };
        });
    }
    private void openLoginScreen(){
        Intent intent = new Intent(this,login_screen.class);
        startActivity(intent);

    };

    private void openRegistrationScreen(){
        Intent intent = new Intent(this,registration_screen.class);
        startActivity(intent);

    };
}
