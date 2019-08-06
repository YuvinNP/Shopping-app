package com.example.the_fashion_zone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Thank extends AppCompatActivity {

    private Button thankBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank);

       thankBtn = (Button) findViewById(R.id.thank_btn);


        thankBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDresses1();
            }

            private void openDresses1() {

                Intent intent1 = new Intent(Thank.this, Home_Screen.class);
                startActivity(intent1);
            }
        });
    }
}
