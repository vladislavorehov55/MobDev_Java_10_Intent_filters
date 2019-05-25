package com.example.app3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn2;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = (Button) findViewById(R.id.button2);
        editText2 = (EditText) findViewById(R.id.edittext2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String geo = "geo:0,0?q=" + editText2.getText().toString();
        Uri geoUri = Uri.parse(geo);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoUri);
        startActivity(mapIntent);
    }
}
