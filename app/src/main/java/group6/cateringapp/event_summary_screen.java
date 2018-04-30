package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class event_summary_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_summary_screen);
        getSupportActionBar().setTitle("Event Summary");
        Button b_event1,b_event2, b_event3, b_event4, b_event5, b_event6;
        TextView t_event1_sum, t_event2_sum,t_event3_sum, t_event4_sum, t_event5_sum,t_event6_sum;
        b_event1 = (Button)findViewById(R.id.b_event1);
        b_event2 = (Button)findViewById(R.id.b_event2);
        b_event3 = (Button)findViewById(R.id.b_event3);
        b_event4 = (Button)findViewById(R.id.b_event4);
        b_event5 = (Button)findViewById(R.id.b_event5);
        b_event6 = (Button)findViewById(R.id.b_event6);
        t_event1_sum = (TextView) findViewById(R.id.t_event1_sum);
        t_event2_sum = (TextView) findViewById(R.id.t_event2_sum);
        t_event3_sum = (TextView) findViewById(R.id.t_event3_sum);
        t_event4_sum = (TextView) findViewById(R.id.t_event4_sum);
        t_event5_sum = (TextView) findViewById(R.id.t_event5_sum);
        t_event6_sum = (TextView) findViewById(R.id.t_event6_sum);
        b_event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //function to set TextView with related event goes here
                //
                openSelectedEventScreen();
            };
        });
        b_event2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //function to set TextView with related event goes here
                //
                openSelectedEventScreen();
            };
        });
        b_event3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //function to set TextView with related event goes here
                //
                openSelectedEventScreen();
            };
        });
        b_event4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //function to set TextView with related event goes here
                //
                //
                openSelectedEventScreen();
            };
        });
        b_event5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //function to set TextView with related event goes here
                //
                //
                openSelectedEventScreen();
            };
        });
        b_event6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //function to set TextView with related event goes here
                //
                //
                openSelectedEventScreen();
            };
        });



    }
    private void openSelectedEventScreen(){
        Intent intent = new Intent(this, selected_event_screen.class);
        startActivity(intent);

    };
}
