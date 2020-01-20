package com.example.driver03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }

    public void register(View view){
        TextView textView=(TextView)findViewById(R.id.logpage);
//        textView.setText("lak");
//        textView.setTextColor(Color.GREEN);
        Intent intent= new Intent(this,login.class);
        startActivity(intent);

    }
}
