package com.example.youtube.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtube.Modal.MailModal;
import com.example.youtube.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MailAdapter extends RecyclerView.Adapter<MailAdapter.MyHolderMail> {

    private Context mContext;
    List<MailModal> mailModals;

    public MailAdapter(Context mContext, List<MailModal> mailModals) {
        this.mContext = mContext;
        this.mailModals = mailModals;
    }

    @NonNull
    @Override
    public MailAdapter.MyHolderMail onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_mail, parent, false);
        MailAdapter.MyHolderMail myHolder = new MailAdapter.MyHolderMail(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MailAdapter.MyHolderMail holder, int position) {

        holder.title.setText(mailModals.get(position).getPesan());
        holder.img_poster.setImageResource(mailModals.get(position).getPoste());
        holder.profile_image.setImageResource(mailModals.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return mailModals.size();
    }

    public class MyHolderMail extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView img_poster;
        private CircleImageView profile_image;

        public MyHolderMail(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            img_poster = itemView.findViewById(R.id.img_poster);
            profile_image = itemView.findViewById(R.id.profile_image);
        }
    }
}
