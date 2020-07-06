package com.thefuturestic.digitalservices.GraphicCategory;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.thefuturestic.digitalservices.R;

 class GraphicCategoryGridHolder extends RecyclerView.ViewHolder  {

    ImageView imageView;

    public GraphicCategoryGridHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ivImage);
    }

}
