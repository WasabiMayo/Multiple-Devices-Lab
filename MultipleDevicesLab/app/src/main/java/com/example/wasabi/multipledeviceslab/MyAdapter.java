package com.example.wasabi.multipledeviceslab;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Wasabi on 2/17/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<Integer> mDataset;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        public TextView textView;

        public ViewHolder (View v){
            super(v);
            cardView = (CardView) v.findViewById(R.id.grid_cardview);
            textView = (TextView) v.findViewById(R.id.grid_textview);
        }
    }

    public MyAdapter(ArrayList<Integer> mDataset) {
        this.mDataset = mDataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_items, parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        int number = mDataset.get(position);
        holder.textView.setText(String.valueOf(number));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
