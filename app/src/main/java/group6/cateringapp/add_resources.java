package group6.cateringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class add_resources extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_resources);
        getSupportActionBar().setTitle("Add Resources");
        Spinner s_meal_formality = (Spinner)findViewById(R.id.s_meal_formality);
        Spinner s_drink_type = (Spinner)findViewById(R.id.s_drink_type);
        Spinner s_food_type = (Spinner)findViewById(R.id.s_food_type);
        Spinner s_meal_type = (Spinner)findViewById(R.id.s_meal_type);
        Button b_add_res, b_cancel;

        b_add_res = (Button)findViewById(R.id.b_add_res);
        b_cancel = (Button)findViewById(R.id.b_cancel);
        //setup of dropdown menu from list of string-array in strings.xml
        ArrayAdapter<CharSequence> adapter_meal_formality = ArrayAdapter.createFromResource(this, R.array.res_meal_formality, android.R.layout.simple_spinner_dropdown_item);
        adapter_meal_formality.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s_meal_formality.setAdapter(adapter_meal_formality);

        ArrayAdapter<CharSequence> adapter_drink_type = ArrayAdapter.createFromResource(this, R.array.res_drink_type, android.R.layout.simple_spinner_dropdown_item);
        adapter_drink_type.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s_drink_type.setAdapter(adapter_drink_type);

        ArrayAdapter<CharSequence> adapter_food_type = ArrayAdapter.createFromResource(this, R.array.res_food_type, android.R.layout.simple_spinner_dropdown_item);
        adapter_food_type.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s_food_type.setAdapter(adapter_food_type);

        ArrayAdapter<CharSequence> adapter_meal_type = ArrayAdapter.createFromResource(this, R.array.res_meal_type, android.R.layout.simple_spinner_dropdown_item);
        adapter_meal_type.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s_meal_type.setAdapter(adapter_meal_type);

        b_add_res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //updating resources in database goes here
                //
                //

                Toast.makeText(add_resources.this, "Resource added!!",Toast.LENGTH_SHORT).show();
                openSelectedEventScreen();
            };
        });
        b_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSelectedEventScreen();
            };
        });

    }
    public void openSelectedEventScreen(){
        Intent intent = new Intent(this, selected_event_screen.class);
        startActivity(intent);

    };

}
