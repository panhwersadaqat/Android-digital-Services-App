package com.thefuturestic.digitalservices.DemoHere;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.thefuturestic.digitalservices.R;

 class GridHolder extends RecyclerView.ViewHolder  {

    ImageView imageView;

    public GridHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ivImage);
    }

}
