package com.example.driver03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = (Button) findViewById(R.id.logbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }

    private void openNewActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void register(View view){
        TextView textView=(TextView)findViewById(R.id.signup);
//        textView.setText("lak");
//        textView.setTextColor(Color.GREEN);
        Intent intent= new Intent(this,Register.class);
        startActivity(intent);

    }


}
