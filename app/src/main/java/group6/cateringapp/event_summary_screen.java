package group6.cateringapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class event_summary_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_summary_screen);
        getSupportActionBar().setTitle("Event Summary");

    }
}
