package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registration_screen extends AppCompatActivity {
    Button b_caterer_registration, b_user_registration, b_staff_registration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);
        getSupportActionBar().setTitle("Registration");

        b_caterer_registration = (Button)findViewById(R.id.b_caterer_registration);
        b_staff_registration = (Button)findViewById(R.id.b_staff_registration);
        b_user_registration = (Button)findViewById(R.id.b_user_registration);

        b_caterer_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegistrationForm();
            }
        });
        b_staff_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegistrationForm();
            }
        });
        b_user_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegistrationForm();
            }
        });

    }
    private void openRegistrationForm(){
        Intent intent = new Intent(this, registration_form.class);
        startActivity(intent);
    }
}
