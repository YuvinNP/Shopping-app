package com.example.the_fashion_zone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginScreen extends AppCompatActivity {

    Button skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }

    public void skipToNext(View v){

        skip = findViewById(R.id.skipbtn);
        Intent int1 = new Intent(LoginScreen.this, LoginActivity.class);

        startActivity(int1);
    }
}
