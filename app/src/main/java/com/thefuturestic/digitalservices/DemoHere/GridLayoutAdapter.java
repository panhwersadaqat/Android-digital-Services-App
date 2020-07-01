package com.thefuturestic.digitalservices.DemoHere;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.thefuturestic.digitalservices.R;

class GridLayoutAdapter extends RecyclerView.Adapter<GridHolder> {
    Bitmap[] bitmaps;

    public GridLayoutAdapter(Bitmap[] bitmaps) {
        this.bitmaps = bitmaps;
    }

    @Override
    public GridHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sample, parent, false);
        return new GridHolder(view);
    }

    @Override
    public void onBindViewHolder(GridHolder holder, int position) {
        holder.imageView.requestLayout();
        holder.imageView.setImageBitmap(bitmaps[position]);
    }

    @Override
    public int getItemCount() {
        return bitmaps.length;
    }
}
