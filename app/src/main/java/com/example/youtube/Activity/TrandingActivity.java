package com.example.youtube.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.youtube.Adapter.TrendingItemAdapter;
import com.example.youtube.Modal.TrendModal;
import com.example.youtube.R;

import java.util.ArrayList;

public class TrandingActivity extends AppCompatActivity {

    private String[] title;
    private String[] nama;
    private TypedArray poster;
    private TypedArray foto;
    private LinearLayout ll_home;
    private LinearLayout ll_trend;
    private LinearLayout ll_subs;
    private LinearLayout ll_mail;
    private LinearLayout ll_profil;

    private TextView tv_music;
    private TextView tv_gamig;
    private TextView tv_news;
    private TextView tv_movies;
    private TextView tv_fashion;

    RecyclerView rv_trend;

    ArrayList<TrendModal> trendModals;
    private TrendingItemAdapter trendingItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tranding);

        tv_fashion = findViewById(R.id.tv_fashion);
        tv_music = findViewById(R.id.tv_music);
        tv_gamig = findViewById(R.id.tv_gamig);
        tv_news = findViewById(R.id.tv_news);
        tv_movies = findViewById(R.id.tv_movies);


        trendModals = tambahItem();

        rv_trend = findViewById(R.id.rv_trend);
        trendingItemAdapter = new TrendingItemAdapter(this, trendModals);
        rv_trend.setLayoutManager(new LinearLayoutManager(this));
        rv_trend.setAdapter(trendingItemAdapter);


        ll_home = findViewById(R.id.ll_home);
        ll_trend = findViewById(R.id.ll_trend);
        ll_subs = findViewById(R.id.ll_subs);
        ll_mail = findViewById(R.id.ll_mail);
        ll_profil = findViewById(R.id.ll_profil);

        ll_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrandingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

//        ll_trend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(TrandingActivity.this, TrandingActivity.class);
//                startActivity(intent);
//            }
//        });

        ll_subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrandingActivity.this, SubscriptionsActivity.class);
                startActivity(intent);
            }
        });

        ll_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrandingActivity.this, MailActivity.class);
                startActivity(intent);
            }
        });

        ll_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrandingActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });



        final Resources resources = this.getResources();
        tv_movies.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                nyala();
                Drawable transitionSbg = resources.getDrawable(R.drawable.bg_sub_tren);
                tv_movies.setBackground(transitionSbg);

                int transitionSwarna = resources.getColor(R.color.merah);
                tv_movies.setTextColor(transitionSwarna);
            }
        });

        tv_fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyala();
                Drawable transitionSbg = resources.getDrawable(R.drawable.bg_sub_tren);
                tv_fashion.setBackground(transitionSbg);

                int transitionSwarna = resources.getColor(R.color.merah);
                tv_fashion.setTextColor(transitionSwarna);
            }
        });

        tv_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyala();
                Drawable transitionSbg = resources.getDrawable(R.drawable.bg_sub_tren);
                tv_news.setBackground(transitionSbg);

                int transitionSwarna = resources.getColor(R.color.merah);
                tv_news.setTextColor(transitionSwarna);
            }
        });

        tv_gamig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyala();
                Drawable transitionSbg = resources.getDrawable(R.drawable.bg_sub_tren);
                tv_gamig.setBackground(transitionSbg);

                int transitionSwarna = resources.getColor(R.color.merah);
                tv_gamig.setTextColor(transitionSwarna);
            }
        });


        tv_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyala();
                Drawable transitionSbg = resources.getDrawable(R.drawable.bg_sub_tren);
                tv_music.setBackground(transitionSbg);

                int transitionSwarna = resources.getColor(R.color.merah);
                tv_music.setTextColor(transitionSwarna);
            }
        });


    }

    private ArrayList<TrendModal> tambahItem(){

        title = getResources().getStringArray(R.array.title);
        nama = getResources().getStringArray(R.array.nama);
        poster = getResources().obtainTypedArray(R.array.poster);
        foto = getResources().obtainTypedArray(R.array.foto);

        ArrayList<TrendModal> listnya = new ArrayList<>();

        for(int a = 0; a < title.length; a++){
            TrendModal trendmodal = new TrendModal();
            trendmodal.setTitle(title[a]);
            trendmodal.setNama(nama[a]);
            trendmodal.setPoster(poster.getResourceId(a, -1));
            trendmodal.setFoto(foto.getResourceId(a, -1));
            listnya.add(trendmodal);
        }
        return listnya;
    }


    @SuppressLint("ResourceAsColor")
    private void nyala(){

        final Resources resources = this.getResources();


        //backgroun
        tv_music.setBackgroundResource(R.color.transparan);
        tv_gamig.setBackgroundResource(R.color.transparan);
        tv_news.setBackgroundResource(R.color.transparan);
        tv_movies.setBackgroundResource(R.color.transparan);
        tv_fashion.setBackgroundResource(R.color.transparan);

        //text

        int transitionS1 = resources.getColor(R.color.hitam);
        tv_music.setTextColor(transitionS1);

        int transitionS2 = resources.getColor(R.color.hitam);
        tv_gamig.setTextColor(transitionS2);

        int transitionS3 = resources.getColor(R.color.hitam);
        tv_news.setTextColor(transitionS3);

        int transition4 = resources.getColor(R.color.hitam);
        tv_movies.setTextColor(transition4);

        int transition5 = resources.getColor(R.color.hitam);
        tv_fashion.setTextColor(transition5);


    }
}
