package com.example.exp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    Integer weights [] = {60, 62, 64, 66, 68,
            70, 72, 74, 76, 78,
            80, 82, 84, 86, 88,
            90, 92, 94, 96, 98,
            100, 102, 104, 106, 108,
            110, 112, 114, 116, 118, 120};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Spinner spinner = findViewById(R.id.dynamicSpinner);

        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(secondActivity.this, android.R.layout.simple_spinner_dropdown_item, weights);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                Toast.makeText(secondActivity.this, "you're weight is: " +parent.getItemAtPosition(position),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        EditText editText = findViewById(R.id.height);
        


    }
}