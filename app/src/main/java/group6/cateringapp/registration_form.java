package group6.cateringapp;
//import g6.enums.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registration_form extends AppCompatActivity {
    EditText f_name, l_name, u_name, password, uta_id, phone_num, st_address, city, state, zip;
    Button b_register, b_cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
        f_name = (EditText)findViewById(R.id.f_name);
        l_name = (EditText)findViewById(R.id.l_name);
        u_name = (EditText)findViewById(R.id.u_name);
        password = (EditText)findViewById(R.id.password);
        uta_id = (EditText)findViewById(R.id.uta_id);
        phone_num = (EditText)findViewById(R.id.phone_num);
        st_address = (EditText)findViewById(R.id.st_address);
        city = (EditText)findViewById(R.id.city);
        state = (EditText) findViewById(R.id.state);


    };
}
