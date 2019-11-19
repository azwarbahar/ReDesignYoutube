package com.example.youtube.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.youtube.Adapter.SubscriptionsAdapter;
import com.example.youtube.Modal.SubscriptionsModal;
import com.example.youtube.R;

import java.util.ArrayList;

public class SubscriptionsActivity extends AppCompatActivity {

    private String[] title;
    private String[] video;
    private TypedArray foto;
    private RecyclerView rv_subs;
    ArrayList<SubscriptionsModal> subsmodal;
    SubscriptionsAdapter subscriptionsAdapter;

    private LinearLayout ll_home;
    private LinearLayout ll_trend;
    private LinearLayout ll_subs;
    private LinearLayout ll_mail;
    private LinearLayout ll_profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscriptions);

        ll_home = findViewById(R.id.ll_home);
        ll_trend = findViewById(R.id.ll_trend);
        ll_subs = findViewById(R.id.ll_subs);
        ll_mail = findViewById(R.id.ll_mail);
        ll_profil = findViewById(R.id.ll_profil);


        ll_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubscriptionsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ll_trend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubscriptionsActivity.this, TrandingActivity.class);
                startActivity(intent);
            }
        });

//        ll_subs.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SubscriptionsActivity.this, SubscriptionsActivity.class);
//                startActivity(intent);
//            }
//        });

        ll_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubscriptionsActivity.this, MailActivity.class);
                startActivity(intent);
            }
        });

        ll_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubscriptionsActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });




        subsmodal = tambahItem();

        rv_subs = findViewById(R.id.rv_subs);
        subscriptionsAdapter = new SubscriptionsAdapter(this, subsmodal);
        rv_subs.setLayoutManager(new LinearLayoutManager(this));
        rv_subs.setAdapter(subscriptionsAdapter);

    }

    private ArrayList<SubscriptionsModal> tambahItem(){

        title = getResources().getStringArray(R.array.title_subs);
        video = getResources().getStringArray(R.array.video);
        foto = getResources().obtainTypedArray(R.array.foto);

        ArrayList<SubscriptionsModal> listnya = new ArrayList<>();

        for(int a = 0; a < title.length; a++){
            SubscriptionsModal subsmodal = new SubscriptionsModal();
            subsmodal.setTitleSubs(title[a]);
            subsmodal.setVideoSubs(video[a]);
            subsmodal.setFotoSubs(foto.getResourceId(a, -1));
            listnya.add(subsmodal);
        }
        return listnya;
    }
}
