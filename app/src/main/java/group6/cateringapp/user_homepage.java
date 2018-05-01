package group6.cateringapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ssaze on 4/27/2018.
 */

public class user_homepage extends AppCompatActivity {
    Button b_viewSummary, b_request, b_logout, b_request_summary, b_update;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_homepage);
        b_logout = (Button) findViewById(R.id.b_logout);
        b_request = (Button) findViewById(R.id.b_request_event);
        b_request_summary = (Button) findViewById(R.id.b_uevent_sum);
        b_update = (Button) findViewById(R.id.b_update);
        b_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRequestPage();
            }
        });
        b_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginScreen();
            }
        });
        b_request_summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserRequestSummaryPage();
            }
        });
        b_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpdateProfile();
            }
        });
    }


    private void openLoginScreen(){
        Intent intent = new Intent(this, login_screen.class);
        startActivity(intent);
    }

    private void openRequestPage(){
        Intent intent = new Intent(this, request_event_1.class);
        startActivity(intent);
    }
    private void openUserRequestSummaryPage(){
        Intent intent = new Intent(this, user_request_summary.class);
        startActivity(intent);
    }
    private void openUpdateProfile(){
        Intent intent = new Intent(this, update_user_profile.class);
        startActivity(intent);
    }
}
