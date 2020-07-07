package com.thefuturestic.digitalservices.GraphicCategory;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.thefuturestic.digitalservices.GalleryPkg.Gallery;
import com.thefuturestic.digitalservices.R;

class GraphicCategoryGridHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView imageView;
   // String value = "";

    public GraphicCategoryGridHolder(final View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ivImage);
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //go through each item if you have few items within recycler view
        if (getLayoutPosition() == 0) {

            Intent intent = new Intent(view.getContext(), Gallery.class);
            intent.putExtra("value", "FlayerGallery");
            view.getContext().startActivity(intent);

        } else if (getLayoutPosition() == 1) {

            Intent intent = new Intent(view.getContext(), Gallery.class);
            intent.putExtra("value", "Logo");
            view.getContext().startActivity(intent);
        } else if (getLayoutPosition() == 2) {

            Intent intent = new Intent(view.getContext(), Gallery.class);
            intent.putExtra("value", "Certificates");
            view.getContext().startActivity(intent);
        } else if (getLayoutPosition() == 3) {

            Intent intent = new Intent(view.getContext(), Gallery.class);
            intent.putExtra("value", "SocialMedia");
            view.getContext().startActivity(intent);

        } else if (getLayoutPosition() == 4) {

            Intent intent = new Intent(view.getContext(), Gallery.class);
            intent.putExtra("value", "Resume");
            view.getContext().startActivity(intent);

        } else if (getLayoutPosition() == 5) {

            Intent intent = new Intent(view.getContext(), Gallery.class);
            intent.putExtra("value", "Banner");
            view.getContext().startActivity(intent);

        } else if (getLayoutPosition() == 6) {

            Intent intent = new Intent(view.getContext(), Gallery.class);
            intent.putExtra("value", "Poster");
            view.getContext().startActivity(intent);

        } else if (getLayoutPosition() == 7) {

            Intent intent = new Intent(view.getContext(), Gallery.class);
            intent.putExtra("value", "BuisnessCard");
            view.getContext().startActivity(intent);

        }

    }
}