package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login_screen extends AppCompatActivity {
    Button b_login;
    EditText u_name, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        b_login = (Button) findViewById(R.id.b_login);
        u_name = (EditText) findViewById(R.id.u_name);
        password = (EditText) findViewById(R.id.password);

        b_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = u_name.getText().toString();
                String pass = password.getText().toString();
                if (name.equals("admin") && pass.equals("password")) {
                    openCatererScreen();
                }

            }

            ;
        });
    }
        private void openCatererScreen(){
            Intent intent = new Intent(this,caterer_home.class);
            startActivity(intent);

    };


}
