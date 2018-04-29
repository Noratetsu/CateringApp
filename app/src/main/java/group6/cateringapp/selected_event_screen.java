package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class selected_event_screen extends AppCompatActivity {

    Button b_view_available_staff, b_logout,b_add_resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_event_screen);
        getSupportActionBar().setTitle("Selected Event Screen");

        b_view_available_staff = (Button)findViewById(R.id.b_view_available_staff);
        b_logout = (Button)findViewById(R.id.b_logout);
        b_add_resources = (Button)findViewById(R.id.b_add_resources);
       b_view_available_staff.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openViewAvailableStaffScreen();
           };
       });
       b_logout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openLoginPage();
           };
       });
       b_add_resources.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openAddResourcePage();
           }
       });

    }

    private void openViewAvailableStaffScreen(){
        Intent intent = new Intent(this, ViewAvailableStaff.class);
        startActivity(intent);
    };
    private void openLoginPage(){
        Intent intent = new Intent(this, login_screen.class);
        startActivity(intent);
    };
    private void openAddResourcePage(){
        Intent intent = new Intent(this, add_resources.class);
        startActivity(intent);
    };
}
