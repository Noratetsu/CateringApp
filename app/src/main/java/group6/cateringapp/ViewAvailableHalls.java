package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ViewAvailableHalls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_available_halls);
        getSupportActionBar().setTitle("Available Halls");
        Button b_assign_hall = (Button)findViewById(R.id.b_assign_hall);
        TextView e_available_hals = (TextView)findViewById(R.id.e_available_halls);
        EditText e_hall_id = (EditText)findViewById(R.id.e_hall_id);
        b_assign_hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectedEvent();
            }
        });


    }
    private void openSelectedEvent(){
        Intent intent = new Intent(this,selected_event_screen.class);
        startActivity(intent);
    }
}
