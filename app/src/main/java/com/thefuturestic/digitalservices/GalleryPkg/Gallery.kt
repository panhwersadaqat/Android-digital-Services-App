package com.thefuturestic.digitalservices.GalleryPkg

import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.thefuturestic.digitalservices.R
import com.thefuturestic.stags.Fragment.Gallery.ModelGallery
import com.thefuturestic.stags.Fragment.Gallery.ViewHolderGallery


class Gallery : AppCompatActivity() {
    private var back: ImageView? = null
    private var progressBar: ProgressBar? = null
    var mRecyclerView: RecyclerView? = null
    var mDatabaseReference: DatabaseReference? = null
    var uploadList: MutableList<ModelGallery?>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_gallery)

        val rootValue = intent.getStringExtra("value")

        //progress bar
        progressBar = findViewById(R.id.progress_bar_gallery)
        mRecyclerView = findViewById(R.id.recyclerView_gallery)
        mRecyclerView!!.setHasFixedSize(true)
        mRecyclerView!!.layoutManager = LinearLayoutManager(this)
        mRecyclerView!!.layoutManager = LinearLayoutManager(this)

        mDatabaseReference = FirebaseDatabase.getInstance().getReference("GraphicGallery").child(""+rootValue)
       // mDatabaseReference!!.keepSynced(true)

    }
    override fun onStart() {
        progressBar!!.setVisibility(View.VISIBLE)
        super.onStart()
        val firebaseRecyclerAdapter = object : FirebaseRecyclerAdapter<ModelGallery, ViewHolderGallery>(
            ModelGallery::class.java,
            R.layout.gallery_list_item,
            ViewHolderGallery::class.java,
            mDatabaseReference
        ) {
            override fun populateViewHolder(viewHolder: ViewHolderGallery, model: ModelGallery, position: Int) {
                // viewHolder.setDetails(context!!, model.img)
                model.url?.let {
                    viewHolder.setDetails(this@Gallery,
                        it
                    )
                }
                progressBar!!.setVisibility(View.GONE)

            }

        }
        mRecyclerView!!.adapter = firebaseRecyclerAdapter
    }


}
