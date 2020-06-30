package com.thefuturestic.digitalservices.HomeScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import com.thefuturestic.digitalservices.GraphicCategory.GraphicCategoryActivity
import com.thefuturestic.digitalservices.R

class Home : AppCompatActivity() {

    internal lateinit var gridView: GridView
    internal var lettersIcon = intArrayOf(R.drawable.graphics,R.drawable.frontend, R.drawable.video)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        gridView = findViewById(R.id.gridview_home) as GridView

        val adapter = GridAdapter(
            this!!,
            lettersIcon
        )
        gridView.adapter = adapter

        gridView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    val intent = Intent(this@Home,GraphicCategoryActivity::class.java)
                    startActivity(intent)
                }
                1 -> {

                }
                2 -> {

                }
            }//end of switch
        })//end of grid

    }
}
