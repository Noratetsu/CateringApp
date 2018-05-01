package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class staff_home extends AppCompatActivity {
    Button b_logout, b_summary, b_update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_home);
        b_logout = (Button) findViewById(R.id.b_logout);
        b_summary = (Button) findViewById(R.id.b_staff_event_summary);
        b_update = (Button) findViewById(R.id.b_update_profile);
        b_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginScreen();
            }
        });
        b_summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStaffRequestSummaryPage();
            }
        });
        b_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUdatePage();
            }
        });

    }
    private void openLoginScreen(){
        Intent intent = new Intent(this, login_screen.class);
        startActivity(intent);
    }
    private void openStaffRequestSummaryPage(){
        Intent intent = new Intent(this, staff_event_summary.class);
        startActivity(intent);
    }
    private void openUdatePage(){
        Intent intent = new Intent(this, update_user_profile.class);
        startActivity(intent);
    }
}
