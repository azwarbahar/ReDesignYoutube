package com.example.youtube.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.youtube.Modal.TopFragModal;
import com.example.youtube.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SlideTopAdapter extends PagerAdapter {
    private Context mContext;
    private List<TopFragModal> models;

    private TextView title_item_top;
    private TextView nama_item_top;
    private ImageView img_poster_item_top;
    private CircleImageView profile_image;

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.item_slide_top,container, false);


        title_item_top = view.findViewById(R.id.title_item_top);
        nama_item_top = view.findViewById(R.id.nama_item_top);
        img_poster_item_top = view.findViewById(R.id.img_poster_item_top);
        profile_image = view.findViewById(R.id.profile_image);

        title_item_top.setText(models.get(position).getTitle());
        nama_item_top.setText(models.get(position).getNama());
        img_poster_item_top.setImageResource(models.get(position).getPoster());
        profile_image.setImageResource(models.get(position).getFoto());

        container.addView(view, 0);

        return view;
    }

    public SlideTopAdapter(Context mContext, List<TopFragModal> models) {
        this.mContext = mContext;
        this.models = models;
    }

    private LayoutInflater layoutInflater;

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }



    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
