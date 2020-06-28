package com.thefuturestic.digitalservices.HomeScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.mdaftabalam.imageslider.SlidingAdapter
import com.mdaftabalam.imageslider.SlidingModel
import com.thefuturestic.aaqib.Fragments.catScreen.ModelHome
import com.thefuturestic.digitalservices.R
import com.thefuturistic.rysdopd.SearchDoctor.SearchDoctors.ViewHolderHome
import java.util.*
import kotlin.collections.ArrayList

class Home : AppCompatActivity() {
    private var progressBar: ProgressBar? = null

    private var imageModelArrayList: ArrayList<SlidingModel>? = null
    private val myImageList = intArrayOf(R.drawable.banner1, R.drawable.banner2, R.drawable.banner3)
    internal lateinit var mRecyclerView: RecyclerView
    internal lateinit var mRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
//        imageModelArrayList = ArrayList()
//        imageModelArrayList = populateList()
//        init()

        mRecyclerView = findViewById(R.id.recyclerView_home)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRef = FirebaseDatabase.getInstance().getReference("Home")
        mRef!!.keepSynced(true)

        //progress bar
        progressBar = findViewById(R.id.progress_bar_home)
        progressBar!!.setVisibility(View.VISIBLE)
    }

//    private fun populateList(): ArrayList<SlidingModel> {
//        val list = ArrayList<SlidingModel>()
//        for (i in 0..2) {
//            val imageModel = SlidingModel()
//            imageModel.image_drawable = myImageList[i]
//            list.add(imageModel)
//        }
//        return list
//    }
//
//    private fun init() {
//        mPager = findViewById(R.id.pager)
//        //disalble auto slide
////        val touchView = findViewById<View>(R.id.pager)
////        touchView.setOnTouchListener { v, event -> true }
//        mPager!!.setAdapter(SlidingAdapter(this@Home, imageModelArrayList!!))
//        NUM_PAGES = imageModelArrayList!!.size
//
//
//        // Auto start of viewpager
//        val handler = Handler()
//        val Update = Runnable {
//            if (currentPage == NUM_PAGES) {
//                currentPage = 0
//            }
//            mPager!!.setCurrentItem(currentPage++, false)
//        }
//        val swipeTimer = Timer()
//        swipeTimer.schedule(object : TimerTask() {
//            override fun run() {
//                handler.post(Update)
//            }
//        }, 4000, 4000)
//    }
//
//    companion object {
//        private var mPager: ViewPager? = null
//        private var currentPage = 0
//        private var NUM_PAGES = 0
//    }

    override fun onStart() {
        progressBar!!.setVisibility(View.VISIBLE)
        super.onStart()
        val firebaseRecyclerAdapter = object : FirebaseRecyclerAdapter<ModelHome, ViewHolderHome>(
            ModelHome::class.java,
            R.layout.item_home_view,
            ViewHolderHome::class.java,
            mRef
        ) {
            override fun populateViewHolder(viewHolder: ViewHolderHome, model: ModelHome, position: Int) {
                // viewHolder.setDetails(context!!, model.img)
                model.img?.let {
                    viewHolder.setDetails(this@Home, model.name,
                        it
                    )
                }

                progressBar!!.setVisibility(View.GONE)
            }

        }
        mRecyclerView!!.adapter = firebaseRecyclerAdapter
    }
}
