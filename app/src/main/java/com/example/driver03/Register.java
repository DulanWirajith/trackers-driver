package com.example.driver03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.driver03.model.RegisterRequest;
import com.example.driver03.model.RegisterResponse;
import com.example.driver03.remote_connection.API;
import com.example.driver03.remote_connection.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Register extends AppCompatActivity {

    private Button btnSignup;
    private EditText fistName;
    private EditText lastName;
    private EditText email;
    private EditText licence_no;
    private EditText contact_no;
    private EditText birthday;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnSignup = findViewById(R.id.driverRegisterBtn);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register_driver();
            }
        });

    }

    private void register_driver() {

        //        create API object
        API service = RetrofitClient.createService(API.class);

//        create RegisterRequest object
        RegisterRequest registerRequest = new RegisterRequest();
        fistName = findViewById(R.id.driverFirstName);
        lastName = findViewById(R.id.driverLastName);
        email = findViewById(R.id.driverEmail);
        licence_no = findViewById(R.id.licenceNo);
        contact_no=findViewById(R.id.driverContactNumber);
        birthday = findViewById(R.id.birthday);
        password = findViewById(R.id.driverPassword);

        registerRequest.setFirst_name(fistName.getText().toString());
        registerRequest.setLast_name(lastName.getText().toString());
        registerRequest.setDriver_mail(email.getText().toString());
        registerRequest.setLicence_number(licence_no.getText().toString());
        registerRequest.setContact_no(contact_no.getText().toString());
        registerRequest.setBirthday(birthday.getText().toString());
        registerRequest.setPassword(password.getText().toString());

        //        request and get response
        final Call<RegisterResponse> isRegisterSuccessful = service.registerUser(registerRequest);

        isRegisterSuccessful.enqueue(new Callback<RegisterResponse>() {
            @Override
            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(Register.this, response.body().getMessage(), Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(Register.this, response.body().getMessage(), Toast.LENGTH_LONG).show();

                }

                if (response.code() == 401) {
                    Toast.makeText(Register.this, response.body().getMessage(), Toast.LENGTH_LONG).show();

                }
            }

            @Override
            public void onFailure(Call<RegisterResponse> call, Throwable t) {
                Context context = getApplicationContext();
                CharSequence text = "Failed to connect with the server...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });





    }

    public void register(View view){
        TextView textView=(TextView)findViewById(R.id.logpage);
//        textView.setText("lak");
//        textView.setTextColor(Color.GREEN);
        Intent intent= new Intent(this,login.class);
        startActivity(intent);

    }
}
