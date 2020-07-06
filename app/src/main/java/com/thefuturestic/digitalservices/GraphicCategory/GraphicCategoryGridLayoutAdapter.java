package com.thefuturestic.digitalservices.GraphicCategory;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.thefuturestic.digitalservices.R;

class GraphicCategoryGridLayoutAdapter extends RecyclerView.Adapter<GraphicCategoryGridHolder> {
    Bitmap[] bitmaps;

    public GraphicCategoryGridLayoutAdapter(Bitmap[] bitmaps) {
        this.bitmaps = bitmaps;
    }

    @Override
    public GraphicCategoryGridHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_graphic_cat, parent, false);
        return new GraphicCategoryGridHolder(view);
    }

    @Override
    public void onBindViewHolder(GraphicCategoryGridHolder holder, int position) {
        holder.imageView.requestLayout();
        holder.imageView.setImageBitmap(bitmaps[position]);
    }

    @Override
    public int getItemCount() {
        return bitmaps.length;
    }
}
