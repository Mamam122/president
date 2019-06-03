package com.example.president;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailActivity extends RecyclerView.Adapter<DetailActivity.CategoryViewHolder> {

    public DetailActivity(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<President> getListPresident() {
        return listPresident;
    }


    public void setListPresident(ArrayList<President> listPresident) {
        this.listPresident = listPresident;
    }

    private ArrayList<President> listPresident;


    @NonNull
    @Override
    public DetailActivity.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new DetailActivity.CategoryViewHolder(itemRow);
    }


    @Override
    public void onBindViewHolder(@NonNull DetailActivity.CategoryViewHolder categoryViewHolder, int i) {
        categoryViewHolder.tvName.setText(getListPresident().get(i).getNama());
        categoryViewHolder.tvRemarks.setText(getListPresident().get(i).getJabatan());
        categoryViewHolder.tvDetail.setText(getListPresident().get(i).getDetail());
        Glide.with(context)
                .load(getListPresident().get(i).getGambar())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        TextView tvDetail;
        ImageView imgPhoto;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.president_detail);
            tvRemarks = itemView.findViewById(R.id.jabatan_detail);
            tvDetail = itemView.findViewById(R.id.deskripsi);
            imgPhoto = itemView.findViewById(R.id.gambar);
        }
    }
}
