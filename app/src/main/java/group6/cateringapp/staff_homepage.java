package group6.cateringapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ssaze on 4/27/2018.
 */

public class staff_homepage extends AppCompatActivity {
    Button b_logout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.staff_homepage);
        b_logout = (Button) findViewById(R.id.b_logout);
        b_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginScreen();
            }
        });
    }

    private void openLoginScreen(){
        Intent intent = new Intent(this, login_screen.class);
        startActivity(intent);
    };

}
