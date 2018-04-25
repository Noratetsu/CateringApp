package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__event);
        getSupportActionBar().setTitle("Caterer Events");

        Button b_logout, b_event1, b_event2, b_event3, b_event4, b_event5;
        b_logout = (Button)findViewById(R.id.b_logout);
        b_event1 = (Button)findViewById(R.id.b_event1);
        b_event2 = (Button)findViewById(R.id.b_event2);
        b_event3 = (Button)findViewById(R.id.b_event3);
        b_event4 = (Button)findViewById(R.id.b_event4);
        b_event5 = (Button)findViewById(R.id.b_event5);
        b_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginScreen();
            }
        });
        b_event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEventOptions();
            }
        });

        b_event2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEventOptions();
            }
        });

        b_event3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEventOptions();
            }
        });

        b_event4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEventOptions();
            }
        });

        b_event5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEventOptions();
            }
        });
    }
    private void openLoginScreen(){
        Intent intent = new Intent(this, system_home.class);
        startActivity(intent);

    };
    private void openEventOptions(){
        Intent intent = new Intent(this, selected_event_screen.class);
        startActivity(intent);

    };
}
