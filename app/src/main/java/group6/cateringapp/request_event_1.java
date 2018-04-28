package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class request_event_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_event_1);
        getSupportActionBar().setTitle("Request Event");
        Button b_request, b_cancel;
        b_request = (Button)findViewById(R.id.b_request);
        b_cancel = (Button)findViewById(R.id.b_cancel);
        b_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(request_event_1.this, "Request Pending", Toast.LENGTH_LONG).show();
                openUserHome();
            };
        });
        b_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserHome();
            };
        });
    }
    private void openUserHome(){
        Intent intent = new Intent(this, user_homepage.class);
        startActivity(intent);
    };
}
