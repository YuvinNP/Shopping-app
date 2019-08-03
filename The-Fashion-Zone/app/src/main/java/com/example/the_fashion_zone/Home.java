package com.example.the_fashion_zone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Home extends AppCompatActivity {

    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        int images[] = {R.drawable.background, R.drawable.user};

        v_flipper = findViewById(R.id.v_flipper);

        for(int image: images){
            flipperImages(image);
        }

    }

    public void flipperImages(int image){

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setInAnimation(this, android.R.anim.slide_out_right);


    }
}
