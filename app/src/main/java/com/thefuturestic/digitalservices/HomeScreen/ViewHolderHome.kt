package com.thefuturistic.rysdopd.SearchDoctor.SearchDoctors

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.thefuturestic.digitalservices.R


class ViewHolderHome(internal var mView: View) : RecyclerView.ViewHolder(mView) {

    fun setDetails(ctx: Context, name: String, img: String) {
        val mTitleView1 = mView.findViewById<ImageView>(R.id.home_item_icon)
        val mTitleView2 = mView.findViewById<TextView>(R.id.home_item_text)
        mTitleView2.text = name
        Glide.with(mTitleView1.context)
            .load(img)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.loading_animation)
                    .error(R.drawable.ic_broken_image))
            .into(mTitleView1)

    }

}
