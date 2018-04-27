package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class selected_event_screen extends AppCompatActivity {

    Button b_view_available_staff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_event_screen);

        b_view_available_staff = findViewById(R.id.b_view_available_staff);

    }

    private void openViewAvailableStaffScreen(){
        Intent intent = new Intent(this, ViewAvailableStaff.class);
        startActivity(intent);
    };
}
