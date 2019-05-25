package com.example.app2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edittext);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://"
                + editText.getText().toString()));
        startActivity(intent);
    }
}
