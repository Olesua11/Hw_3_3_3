package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LictctViewHolder extends RecyclerView.ViewHolder {
    private TextView tvContactName;
    public LictctViewHolder(@NonNull View itemView) {
        super(itemView);

        initView();
    }

    private void initView() {
        tvContactName = itemView.findViewById(R.id.List);

    }

    public void onBind(String contactName){
        tvContactName.setText(contactName);

    }
}