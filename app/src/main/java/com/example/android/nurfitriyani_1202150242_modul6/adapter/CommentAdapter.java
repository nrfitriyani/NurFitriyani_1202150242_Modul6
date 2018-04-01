package com.example.android.nurfitriyani_1202150242_modul6.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.android.nurfitriyani_1202150242_modul6.R;
import com.example.android.nurfitriyani_1202150242_modul6.model.Comment;

import java.util.ArrayList;

//sebagai adapter
public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {
    Context context;
    ArrayList<Comment> comments;

    public CommentAdapter(Context context, ArrayList<Comment> comments) {
        this.context = context;
        this.comments = comments;
    }
//untuk menampilkan data
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_comment, parent, false);
        return new ViewHolder(view);
    }
//mengambil data user
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Comment comment = comments.get(position);

        //username yang berkomentar
        holder.mUsername.setText(comment.getUsername());
        //komentar yang akan diisi
        holder.mComment.setText(comment.getComment());
        //ambil avatar/foto
        holder.ava.setImageResource(R.drawable.ic_account_circle_24dp);
    }

    @Override
    public int getItemCount() {
        return comments.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        //variabel
        TextView mUsername;
        TextView mComment;
        ImageView ava;

        public ViewHolder(View itemView) {
            super(itemView);
            //bind data
            mUsername = itemView.findViewById(R.id.tv_username);
            mComment = itemView.findViewById(R.id.tv_comment);
            ava = itemView.findViewById(R.id.img_ava);
        }
    }
}
