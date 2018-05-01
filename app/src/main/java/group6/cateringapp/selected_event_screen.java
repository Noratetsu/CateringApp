package group6.cateringapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class selected_event_screen extends AppCompatActivity {

    Button b_view_available_staff, b_logout, b_add_resources, b_cancel_event, b_view_available_halls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_event_screen);
        getSupportActionBar().setTitle("Selected Event Screen");

        b_view_available_staff = (Button) findViewById(R.id.b_view_available_staff);
        b_logout = (Button) findViewById(R.id.b_logout);
        b_add_resources = (Button) findViewById(R.id.b_add_resources);
        b_view_available_halls = (Button)findViewById(R.id.b_view_available_halls);
        b_cancel_event = (Button) findViewById(R.id.b_cancel_event);
        b_view_available_staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewAvailableStaffScreen();
            }

            ;
        });
        b_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginPage();
            }

            ;
        });
        b_add_resources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddResourcePage();
            }
        });
        b_cancel_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCancelScreen();
            };


        });
        b_view_available_halls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewAvailableHalls();
            }
        });

    }

    private void openViewAvailableStaffScreen() {
        Intent intent = new Intent(this, ViewAvailableStaff.class);
        startActivity(intent);
    }

    ;

    private void openLoginPage() {
        Intent intent = new Intent(this, login_screen.class);
        startActivity(intent);
    }

    ;

    private void openAddResourcePage() {
        Intent intent = new Intent(this, add_resources.class);
        startActivity(intent);
    }

    ;

    public void openCancelScreen(){
        AlertDialog.Builder a_builder = new AlertDialog.Builder(selected_event_screen.this);
        a_builder.setMessage("Are you sure you want to cancel this event?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        //what attributes change after cancelling the event?
                        //event status change in event summary
                        //
                        openEventSummaryScreen();
                        Toast.makeText(selected_event_screen.this, "Event Cancelled!!",Toast.LENGTH_LONG).show();
                        openEventSummaryScreen();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alert = a_builder.create();
        alert.setTitle("Cancel Event");
        alert.show();

    }
    private void openEventSummaryScreen(){
        Intent intent = new Intent(this,event_summary_screen.class);
        startActivity(intent);
    }
    private void openViewAvailableHalls(){
        Intent intent = new Intent(this, ViewAvailableHalls.class);
        startActivity(intent);
    }


}



