package com.thefuturestic.digitalservices.HomeScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.GridView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thefuturestic.digitalservices.GraphicCategory.GraphicCategoryActivity
import com.thefuturestic.digitalservices.HomeScreen.adapter.HomeAdapter
import com.thefuturestic.digitalservices.HomeScreen.model.Item
import com.thefuturestic.digitalservices.R
import java.util.ArrayList

class Home : AppCompatActivity(), HomeAdapter.ItemListener {

//    internal lateinit var gridView: GridView
//    internal var lettersIcon = intArrayOf(R.drawable.graphics,R.drawable.frontend, R.drawable.video)
private var recyclerView: RecyclerView? = null
    private var arrayList: ArrayList<Item>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home)

        recyclerView = findViewById(R.id.recyclerView) as RecyclerView?
        arrayList = ArrayList<Item>()
        arrayList!!.add(Item("Graphic", R.drawable.graphic, "#6D4FBF","Get ready your graphic design on single tap"))
        arrayList!!.add(Item("Frontend", R.drawable.web, "#EB937F","Our experts are available to build your site"))
        arrayList!!.add(Item("Video",R.drawable.video, "#79C3FF","Professional edited video,using high tech tools"))
        arrayList!!.add(Item("About",R.drawable.ic_about_icon, "#363636","Click to view about Digital services"))
//        gridView = findViewById(R.id.gridview_home) as GridView
//
//        val adapter = GridAdapter(
//            this!!,
//            lettersIcon
//        )
//        gridView.adapter = adapter
//
//        gridView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
//            when (position) {
//                0 -> {
//                    val intent = Intent(this@Home,GraphicCategoryActivity::class.java)
//                    startActivity(intent)
//                }
//                1 -> {
//
//                }
//                2 -> {
//
//                }
//            }//end of switch
//        })//end of grid
        val adapter = HomeAdapter(this, arrayList,this)
        recyclerView!!.setAdapter(adapter)

        val manager =
            GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        recyclerView!!.setLayoutManager(manager)


    }

    //handle on item click
    override fun onItemClick(item: Item?) {

    }
}