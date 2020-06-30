package com.thefuturestic.digitalservices.GraphicCategory

import android.os.Bundle
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DatabaseReference
import com.thefuturestic.digitalservices.R


class GraphicCategoryActivity : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    internal lateinit var mRecyclerView: RecyclerView
    internal lateinit var mRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

//
//        val inn = Intent()
//        val categoryTitle = inn.extras!!.getString("categoryTitle")
//        if(categoryTitle.isNullOrEmpty()){
//            val i = Intent(this, Home::class.java)
//           startActivity(i)
//            finish()
//        }else{
//            mRecyclerView = findViewById(R.id.recyclerView_home)
//            mRecyclerView.setHasFixedSize(true)
//            mRecyclerView.layoutManager = LinearLayoutManager(this)
//            mRecyclerView.layoutManager = LinearLayoutManager(this)
//
//            mRef = FirebaseDatabase.getInstance().getReference(""+categoryTitle)
//            mRef!!.keepSynced(true)
//
//            //progress bar
//            progressBar = findViewById(R.id.progress_bar_home)
//            progressBar!!.setVisibility(View.VISIBLE)
//        }

    }

//    override fun onStart() {
//        progressBar!!.setVisibility(View.VISIBLE)
//        super.onStart()
//        val firebaseRecyclerAdapter = object : FirebaseRecyclerAdapter<ModelCategory, ViewHolderCategory>(
//            ModelCategory::class.java,
//            R.layout.item_home_view,
//            ViewHolderCategory::class.java,
//
//            mRef
//        ) {
//            override fun populateViewHolder(viewHolder: ViewHolderCategory, model: ModelCategory, position: Int) {
//                // viewHolder.setDetails(context!!, model.img)
//                model.img?.let {
//                    viewHolder.setDetails(this@CategoryActivity, model.name,model.categoryTitle,
//                        it
//                    )
//                }
//
//                progressBar!!.setVisibility(View.GONE)
//            }
//
//        }
//        mRecyclerView!!.adapter = firebaseRecyclerAdapter
//    }
}
