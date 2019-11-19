package com.example.youtube.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.youtube.R;

public class ProfileActivity extends AppCompatActivity {

    private LinearLayout ll_home;
    private LinearLayout ll_trend;
    private LinearLayout ll_subs;
    private LinearLayout ll_mail;
    private LinearLayout ll_profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        ll_home = findViewById(R.id.ll_home);
        ll_trend = findViewById(R.id.ll_trend);
        ll_subs = findViewById(R.id.ll_subs);
        ll_mail = findViewById(R.id.ll_mail);
        ll_profil = findViewById(R.id.ll_profil);


        ll_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ll_trend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, TrandingActivity.class);
                startActivity(intent);
            }
        });

        ll_subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, SubscriptionsActivity.class);
                startActivity(intent);
            }
        });

        ll_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MailActivity.class);
                startActivity(intent);
            }
        });

//        ll_profil.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ProfileActivity.this, ProfileActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
