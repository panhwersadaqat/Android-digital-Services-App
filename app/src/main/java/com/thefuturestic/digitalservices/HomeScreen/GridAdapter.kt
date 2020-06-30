package com.thefuturestic.digitalservices.HomeScreen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.thefuturestic.digitalservices.R

/**
 * Created by Sadaqat on 12/23/2017.
 */

class GridAdapter(private val context: Context, private val icons: IntArray) : BaseAdapter() {

    private var inflater: LayoutInflater? = null


    override fun getCount(): Int {
        return icons.size

    }

    override fun getItem(position: Int): Any {
        return icons[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var gridView = convertView
        if (convertView == null) {
            inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            gridView = inflater!!.inflate(R.layout.item_home_view, null)
        }
        val icon = gridView!!.findViewById<View>(R.id.image_icon) as ImageView
        icon.setImageResource(icons[position])
        return gridView
    }
}
