package group6.cateringapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class registration_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);
        getSupportActionBar().setTitle("Registration");
    }
}