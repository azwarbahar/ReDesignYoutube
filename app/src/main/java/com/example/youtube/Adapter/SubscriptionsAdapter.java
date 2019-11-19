package com.example.youtube.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtube.Modal.SubscriptionsModal;
import com.example.youtube.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SubscriptionsAdapter extends RecyclerView.Adapter<SubscriptionsAdapter.MyHolderSubs> {

    private Context mContext;
    private List<SubscriptionsModal> subsModal;

    public SubscriptionsAdapter(Context mContext, List<SubscriptionsModal> subsModal) {
        this.mContext = mContext;
        this.subsModal = subsModal;
    }

    @NonNull
    @Override
    public SubscriptionsAdapter.MyHolderSubs onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_subscriptions, parent, false);

        SubscriptionsAdapter.MyHolderSubs myHolderSubs = new MyHolderSubs(view);
        return myHolderSubs;
    }

    @Override
    public void onBindViewHolder(@NonNull SubscriptionsAdapter.MyHolderSubs holder, int position) {

        holder.title.setText(subsModal.get(position).getTitleSubs());
        holder.video.setText(subsModal.get(position).getVideoSubs());
        holder.profile_image.setImageResource(subsModal.get(position).getFotoSubs());

    }

    @Override
    public int getItemCount() {
        return subsModal.size();
    }

    public class MyHolderSubs extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView video;
        private CircleImageView profile_image;

        public MyHolderSubs(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            video = itemView.findViewById(R.id.video);
            profile_image = itemView.findViewById(R.id.profile_image);
        }
    }
}
