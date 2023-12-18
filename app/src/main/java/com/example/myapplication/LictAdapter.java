package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LictAdapter extends RecyclerView.Adapter<LictctViewHolder> {

    private ArrayList<String> contactList;

    public LictAdapter(ArrayList<String> contactList) {
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public LictctViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LictctViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lict, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LictctViewHolder holder, int position) {
        holder.onBind(contactList.get(position));
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}