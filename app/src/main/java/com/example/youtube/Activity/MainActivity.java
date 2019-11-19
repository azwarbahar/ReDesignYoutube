package com.example.youtube.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.youtube.Adapter.HotAdapter;
import com.example.youtube.Adapter.SlideTopAdapter;
import com.example.youtube.Modal.HotModal;
import com.example.youtube.Modal.TopFragModal;
import com.example.youtube.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] title;
    private String[] nama;
    private TypedArray poster;
    private TypedArray foto;
    private EditText search;

    private TextView[] mDots;

    private ViewPager viewPagertop;
    private SlideTopAdapter slideTopAdapter;
    private RecyclerView rv_hot;
    private HotAdapter hotAdapter;
    List<TopFragModal> topFragModals;
    ArrayList<HotModal> hotModals;

    private LinearLayout ll_home;
    private LinearLayout ll_trend;
    private LinearLayout ll_subs;
    private LinearLayout ll_mail;
    private LinearLayout ll_profil;

    private LinearLayout ll_dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search = findViewById(R.id.search);
        ll_dots = findViewById(R.id.ll_dots);


        top();

        hotModals = tambahItem();
        hot();

        ll_home = findViewById(R.id.ll_home);
        ll_trend = findViewById(R.id.ll_trend);
        ll_subs = findViewById(R.id.ll_subs);
        ll_mail = findViewById(R.id.ll_mail);
        ll_profil = findViewById(R.id.ll_profil);


//        ll_home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });

        ll_trend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrandingActivity.class);
                startActivity(intent);
            }
        });

        ll_subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubscriptionsActivity.class);
                startActivity(intent);
            }
        });

        ll_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MailActivity.class);
                startActivity(intent);
            }
        });

        ll_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }

    public void tambahdotsIndicator(int position) {
        mDots = new TextView[5];
        ll_dots.removeAllViews();
        for (int i = 0; i < mDots.length; i++) {
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.dotsnon));

            ll_dots.addView(mDots[i]);
        }

        if (mDots.length > 0) {
            mDots[position].setTextColor(getResources().getColor(R.color.colordots));
        }

    }

    private void top() {

        topFragModals = new ArrayList<>();
        topFragModals.add(new TopFragModal("One Punch Man | Seasson 10", "Muhammad Azwar Bahar", R.drawable.opm, R.drawable.azz));
        topFragModals.add(new TopFragModal("One Piece | Episode 1280", "Fadly Jaya", R.drawable.onepeace, R.drawable.fadli));
        topFragModals.add(new TopFragModal("Naruto Vs Sasuke", "Rahmat Ilyas", R.drawable.naruto, R.drawable.rahmat));
        topFragModals.add(new TopFragModal("Avatar, The Lagend of Aang", "Andi Abdillah", R.drawable.avatar, R.drawable.abdillah));
        topFragModals.add(new TopFragModal("One Piece | Episode 1-780", "Mahfud Hidayat", R.drawable.onepeace, R.drawable.map2));

        slideTopAdapter = new SlideTopAdapter(this, topFragModals);

        viewPagertop = findViewById(R.id.vp_top);
        viewPagertop.setAdapter(slideTopAdapter);
        viewPagertop.addOnPageChangeListener(viewlistener);
        tambahdotsIndicator(0);

    }

    private void hot() {

        rv_hot = findViewById(R.id.rv_hot);

        hotAdapter = new HotAdapter(this, hotModals);
        rv_hot.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv_hot.setAdapter(hotAdapter);


    }


    private ArrayList<HotModal> tambahItem() {

        title = getResources().getStringArray(R.array.title);
        nama = getResources().getStringArray(R.array.nama);
        poster = getResources().obtainTypedArray(R.array.poster);
        foto = getResources().obtainTypedArray(R.array.foto);

        ArrayList<HotModal> listnya = new ArrayList<>();

        for (int a = 0; a < title.length; a++) {
            HotModal hotModal = new HotModal();
            hotModal.setTitle(title[a]);
            hotModal.setNama(nama[a]);
            hotModal.setPoster(poster.getResourceId(a, -1));
            hotModal.setFoto(foto.getResourceId(a, -1));
            listnya.add(hotModal);
        }
        return listnya;
    }

    ViewPager.OnPageChangeListener viewlistener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            tambahdotsIndicator(position);

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

}
