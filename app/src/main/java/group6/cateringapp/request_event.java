package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class request_event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_event);
        getSupportActionBar().setTitle("Request Event");
        Button b_next;
        b_next = (Button) findViewById(R.id.b_next);
        b_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextPage();
            };
        });
    }
    private void openNextPage(){
        Intent intent = new Intent(this, request_event_1.class);
        startActivity(intent);
    };
}
