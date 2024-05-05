package com.example.libralib;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edUseremail, edPassword;
    Button btn;
    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edUseremail = findViewById(R.id.editTextRegEmail);
        edPassword = findViewById(R.id.editTextRegPassword);
        btn = findViewById(R.id.btnRegister);
        tv = findViewById(R.id.textViewExistingUser);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String useremail = edUseremail.getText().toString();
                String password = edPassword.getText().toString();
                if(useremail.length() == 0 || password.length() == 0)
                    Toast.makeText(getApplicationContext(), "Please fill all the fields", Toast.LENGTH_SHORT).show();
                else{
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                redirect to the new activity
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }
}