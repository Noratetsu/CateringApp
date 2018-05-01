package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Vector;

public class user_request_summary extends AppCompatActivity {
    request_event_1 requestEvent = new request_event_1();
    Vector<String> events = requestEvent.event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_request_summary);

        TextView t_event_summary;
        EditText e_eid = (EditText)findViewById(R.id.e_eid);
        String eid = "";
        e_eid.setText(eid);
        System.out.print(eid);
        t_event_summary = (TextView)findViewById(R.id.t_event_summary);

        String eventSummary = " Event Summary \n";

            for(int j=0;j<requestEvent.event.size();j++){
                eventSummary = eventSummary + requestEvent.event.elementAt(j)+"\n";
            }


        t_event_summary.setText(eventSummary);
        Button b_approve,b_decline;
        b_approve = (Button)findViewById(R.id.b_approve);
        b_decline = (Button)findViewById(R.id.b_decline);
        b_approve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //approve the event
                Toast.makeText(user_request_summary.this, "Event Approved!!",Toast.LENGTH_LONG).show();
                openCatererHome();
            }
        });
        b_decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(user_request_summary.this, "Event Declined!!",Toast.LENGTH_LONG).show();
                openCatererHome();
            }
        });
    };
    private void openCatererHome(){
        Intent intent= new Intent(this, caterer_home.class);
        startActivity(intent);
    }
}
