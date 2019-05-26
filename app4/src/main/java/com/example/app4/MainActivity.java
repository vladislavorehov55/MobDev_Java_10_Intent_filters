package com.example.app4;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(this);
        textView = (TextView) findViewById(R.id.textView_1);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivityForResult(intent, 1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) {return;}
        String color = data.getStringExtra("color");
        String position= data.getStringExtra("position");
        if(color.equals("holo_purple")){
            textView.setTextColor(getResources().getColor(R.color.holo_purple));
        }
        else{
            textView.setTextColor(getResources().getColor(R.color.holo_red_dark));
        }
        if (position.equals("слева")){
            textView.setGravity(Gravity.LEFT);
        }
        else if(position.equals("по центру")){
            textView.setGravity(Gravity.CENTER);
        }
        else{
            textView.setGravity(Gravity.RIGHT);
        }

    }
}
