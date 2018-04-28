package group6.cateringapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class caterer_home extends AppCompatActivity {
    Button b_logout, b_view_cat_event_request, b_view_user_request, b_update_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caterer_home);

        b_view_cat_event_request = (Button) findViewById(R.id.b_view_cat_event_summary);
        b_view_user_request = (Button) findViewById(R.id.b_view_user_request);
        b_update_profile = (Button) findViewById(R.id.b_update_profile);
        b_logout = (Button) findViewById(R.id.b_logout);
        b_view_cat_event_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectedEventScreen();

            }
        });
        b_view_user_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserRequestScreen();
            }
        });
        b_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openLoginScreen();

            }
        });
    }

    private void openSelectedEventScreen(){
            Intent intent = new Intent(this,selected_event_screen.class);
            startActivity(intent);


    };
    private void openUserRequestScreen(){
        Intent intent = new Intent(this, user_request_summary.class);
        startActivity(intent);
    };

    private void openLoginScreen(){
        Intent intent = new Intent(this, login_screen.class);
        startActivity(intent);
    };


}


