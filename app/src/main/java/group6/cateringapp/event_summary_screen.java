package group6.cateringapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import g6.Core.CatererEventSummary;
import g6.Core.Event;
import g6.Core.EventSummary;

public class event_summary_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_summary_screen);
        getSupportActionBar().setTitle("Event Summary");
        TextView t_event_summary;
        EditText e_eid = (EditText)findViewById(R.id.e_eid);
        String eid = "";
        e_eid.setText(eid);
        System.out.print(eid);
        t_event_summary = (TextView)findViewById(R.id.t_event_summary);
        Event event = new Event();
        String eventSummary = "Event id 1\n Event name"+event.getEventName()+"\nDate"+event.getDate()+"\n Duration"+event.getDuration()+"HRS\n";
        //Functionality to pull Event status
        //
        //
        t_event_summary.setText(eventSummary);
        Button b_eid_send;
        b_eid_send = (Button)findViewById(R.id.b_eid_send);
        b_eid_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectedEventScreen();
            }
        });

    }
    private void openSelectedEventScreen(){
        Intent intent = new Intent(this, selected_event_screen.class);
        startActivity(intent);
    }
}
