package com.example.youtube.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtube.Modal.HotModal;
import com.example.youtube.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class HotAdapter extends RecyclerView.Adapter<HotAdapter.MyViewHolder> {

    private Context mContext;
    private List<HotModal> hotModals;

    public HotAdapter(Context mContext, ArrayList<HotModal> hotModals) {
        this.mContext = mContext;
        this.hotModals = hotModals;
    }

    public HotAdapter(){

    }

    @NonNull
    @Override
    public HotAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        view = LayoutInflater.from(mContext).inflate(R.layout.item_slide_hot, parent, false);

        HotAdapter.MyViewHolder viewHolder = new HotAdapter.MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HotAdapter.MyViewHolder holder, int position) {

        holder.title.setText(hotModals.get(position).getTitle());
        holder.nama.setText(hotModals.get(position).getNama());
        holder.poster.setImageResource(hotModals.get(position).getPoster());
        holder.foto.setImageResource(hotModals.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return hotModals.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView nama;
        private ImageView poster;
        private CircleImageView foto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title_item_top);
            nama = itemView.findViewById(R.id.nama);
            poster = itemView.findViewById(R.id.img_poster_item_top);
            foto = itemView.findViewById(R.id.profile_image);

        }
    }
}
