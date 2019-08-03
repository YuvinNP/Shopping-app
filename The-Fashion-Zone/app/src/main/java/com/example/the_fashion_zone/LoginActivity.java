package com.example.the_fashion_zone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        getSupportActionBar().setTitle("Login");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }


    public void LoginTo(View v){

        loginBtn = findViewById(R.id.loginbtn);
        Intent intent = new Intent(LoginActivity.this, Home.class);

        startActivity(intent);
    }
}
