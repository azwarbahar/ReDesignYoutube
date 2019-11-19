package com.example.youtube.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.youtube.Adapter.MailAdapter;
import com.example.youtube.Modal.MailModal;
import com.example.youtube.Modal.SubscriptionsModal;
import com.example.youtube.R;

import java.util.ArrayList;

public class MailActivity extends AppCompatActivity {

    private String[] title;
    private TypedArray poster;
    private TypedArray foto;

    private RecyclerView rv_mail;
    ArrayList<MailModal> mailModals;
    MailAdapter mailAdapter;

    private LinearLayout ll_home;
    private LinearLayout ll_trend;
    private LinearLayout ll_subs;
    private LinearLayout ll_mail;
    private LinearLayout ll_profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);


        ll_home = findViewById(R.id.ll_home);
        ll_trend = findViewById(R.id.ll_trend);
        ll_subs = findViewById(R.id.ll_subs);
        ll_mail = findViewById(R.id.ll_mail);
        ll_profil = findViewById(R.id.ll_profil);


        ll_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ll_trend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MailActivity.this, TrandingActivity.class);
                startActivity(intent);
            }
        });

        ll_subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MailActivity.this, SubscriptionsActivity.class);
                startActivity(intent);
            }
        });

//        ll_mail.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MailActivity.this, MailActivity.class);
//                startActivity(intent);
//            }
//        });

        ll_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MailActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        mailModals = tambahItem();

        rv_mail = findViewById(R.id.rv_mail);
        mailAdapter = new MailAdapter(this, mailModals);
        rv_mail.setLayoutManager(new LinearLayoutManager(this));
        rv_mail.setAdapter(mailAdapter);
    }
    private ArrayList<MailModal> tambahItem(){

        title = getResources().getStringArray(R.array.title_mail);
        poster = getResources().obtainTypedArray(R.array.poster);
        foto = getResources().obtainTypedArray(R.array.foto);

        ArrayList<MailModal> listnya = new ArrayList<>();

        for(int a = 0; a < title.length; a++){
            MailModal mailmodal = new MailModal();
            mailmodal.setPesan(title[a]);
            mailmodal.setPoste(poster.getResourceId(a, -1));
            mailmodal.setFoto(foto.getResourceId(a, -1));
            listnya.add(mailmodal);
        }
        return listnya;
    }
}
