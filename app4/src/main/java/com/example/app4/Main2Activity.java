package com.example.app4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    Spinner spinner;
    Spinner spinner2;
    Button button;
    String sel;
    String sel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        sel = spinner.getSelectedItem().toString();
        sel2 = spinner2.getSelectedItem().toString();
        Intent intent = new Intent();
        intent.putExtra("color", sel);
        intent.putExtra("position", sel2);
        setResult(RESULT_OK, intent);
        finish();
    }


}
