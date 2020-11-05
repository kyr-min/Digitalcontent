package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.telecom.TelecomManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),TutorialActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

        tv = findViewById(R.id.tv);

        Animation ani = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        tv.startAnimation(ani);
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }



}