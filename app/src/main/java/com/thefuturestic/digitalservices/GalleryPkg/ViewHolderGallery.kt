package com.thefuturestic.stags.Fragment.Gallery

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.thefuturestic.digitalservices.R

class ViewHolderGallery(var mView: View) :
    RecyclerView.ViewHolder(mView) {
    fun setDetails(ctx: Context?, url: String?) {
        val mNameView2 = mView.findViewById<ImageView>(R.id.gallery_image)

        Glide.with(mNameView2.context)
            .load(url)
            .apply(
                RequestOptions()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_broken_image))
            .into(mNameView2)
    }

    private var mClickListener: ClickListener? = null

    interface ClickListener {
        fun onIteamClick(view: View?, position: Int)
        fun onItemLongClick(view: View?, position: Int)
    }

    fun setOnClickListener(clickListener: ClickListener?) {
        mClickListener = clickListener
    }

    init {
        mView.setOnClickListener { v -> mClickListener!!.onIteamClick(v, adapterPosition) }
        mView.setOnLongClickListener { v ->
            mClickListener!!.onItemLongClick(v, adapterPosition)
            true
        }
    }
}