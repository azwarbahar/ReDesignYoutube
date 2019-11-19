package com.example.youtube.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtube.Modal.TopFragModal;
import com.example.youtube.Modal.TrendModal;
import com.example.youtube.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TrendingItemAdapter extends RecyclerView.Adapter<TrendingItemAdapter.MyHolderTrend> {

    private Context mContext;
    private List<TrendModal> trendModal;

    public TrendingItemAdapter(Context mContext, List<TrendModal> trendModal) {
        this.mContext = mContext;
        this.trendModal = trendModal;
    }

    @NonNull
    @Override
    public TrendingItemAdapter.MyHolderTrend onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view;
       view = LayoutInflater.from(mContext).inflate(R.layout.item_slide_trend, parent, false);
       TrendingItemAdapter.MyHolderTrend vHolder = new TrendingItemAdapter.MyHolderTrend(view);

       return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingItemAdapter.MyHolderTrend holder, int position) {

        holder.title.setText(trendModal.get(position).getTitle());
        holder.nama.setText(trendModal.get(position).getNama());
        holder.poster.setImageResource(trendModal.get(position).getPoster());
        holder.foto.setImageResource(trendModal.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return trendModal.size();
    }

    public static class MyHolderTrend extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView nama;
        private ImageView poster;
        private CircleImageView foto;
        public MyHolderTrend(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title_item_top);
            nama = itemView.findViewById(R.id.nama_item_top);
            poster = itemView.findViewById(R.id.img_poster_item_top);
            foto = itemView.findViewById(R.id.profile_image);
        }
    }
}
