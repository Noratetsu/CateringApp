package group6.cateringapp;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Vector;

import g6.Core.Event;
import g6.Database.dbmgr;

public class request_event_1 extends AppCompatActivity {
    dbmgr helper = dbmgr.getInstance(this);
    Vector <String> event = new Vector();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_event_1);
        getSupportActionBar().setTitle("Request Event");

         Button b_cancel;

        b_cancel = (Button)findViewById(R.id.b_cancel);



        b_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserHome();
            };
        });
    }

    public void onRequestClick(View v){

        if(v.getId()==R.id.b_request)
        {
            EditText date = (EditText)findViewById(R.id.e_date);
            EditText time = (EditText)findViewById(R.id.e_time);
            EditText occasion = (EditText)findViewById(R.id.e_occasion);
            EditText party_size = (EditText)findViewById(R.id.e_party_size);
            EditText duration = (EditText)findViewById(R.id.e_duration);


            String date_str = date.getText().toString();
            String time_str = time.getText().toString();
            String occasion_str = occasion.getText().toString();
            String party_size_str = party_size.getText().toString();
            String duration_str = duration.getText().toString();


            event.add(date_str);
            event.add(time_str);
            event.add(occasion_str);
            event.add(party_size_str);
            event.add(duration_str);



            Toast.makeText(getApplicationContext(), "Request Submitted!! Status: Pending",Toast.LENGTH_SHORT).show();
            //insert details in database
             RequestDetails c = new RequestDetails();
            c.setDate(date_str);
            c.setTime(time_str);
            c.setOccasion(occasion_str);
           // c.setParty_size(party_size_str);
            c.setDuration(duration_str);
            c.setParty_size(party_size_str);


            helper.InsertRequestDetails(c);
            openUserHome();
        }
    }

    private void openUserHome(){
        Intent intent = new Intent(this, user_homepage.class);
        startActivity(intent);
    };
}
