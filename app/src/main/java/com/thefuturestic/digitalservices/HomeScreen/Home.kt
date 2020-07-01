package com.thefuturestic.digitalservices.HomeScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thefuturestic.digitalservices.DemoHere.Demo
import com.thefuturestic.digitalservices.GraphicCategory.GraphicCategoryActivity
import com.thefuturestic.digitalservices.R
import com.thefuturestic.stags.Startup.ConnectionDetector
import java.util.ArrayList

class Home : AppCompatActivity(), HomeAdapter.ItemListener {

    var cd: ConnectionDetector? = null
    private var recyclerView: RecyclerView? = null
    private var arrayList: ArrayList<Item>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home)

        recyclerView = findViewById(R.id.recyclerView) as RecyclerView?
        arrayList = ArrayList<Item>()
        arrayList!!.add(
            Item(
                "Graphic",
                R.drawable.graphic,
                "#6D4FBF",
                "Get ready your graphic design on single tap"
            )
        )
        arrayList!!.add(
            Item(
                "Frontend",
                R.drawable.web,
                "#EB937F",
                "Our experts are available to build your site"
            )
        )
        arrayList!!.add(
            Item(
                "Video",
                R.drawable.video,
                "#79C3FF",
                "Professional video editing"
            )
        )
        arrayList!!.add(
            Item(
                "About",
                R.drawable.ic_about_icon,
                "#363636",
                "Click to view about Digital services"
            )
        )

        val adapter = HomeAdapter(
            this,
            arrayList,
            this
        )
        recyclerView!!.setAdapter(adapter)

        val manager =
            GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        recyclerView!!.setLayoutManager(manager)


    }

    //handle on item click
    override fun onItemClick(item: Item?) {
        if(item!!.getText().equals("Graphic")){
            val i = Intent(this, Demo::class.java)
                startActivity(i)
//            if (!cd!!.isConnectingToInternet) {
//                Toast.makeText(this,"No internet connection", Toast.LENGTH_SHORT).show()
//            } else {
//                val i = Intent(this, Demo::class.java)
//                startActivity(i)
//            }

        }else if (item!!.getText().equals("Frontend")) {
            if (!cd!!.isConnectingToInternet) {
                Toast.makeText(this, "No internet connection", Toast.LENGTH_SHORT).show()
            } else {
                //handle code here
            }
        }else if (item!!.getText().equals("Video")) {
            if (!cd!!.isConnectingToInternet) {
                Toast.makeText(this, "No internet connection", Toast.LENGTH_SHORT).show()
            } else {
                //handle code here
            }
        }else if (item!!.getText().equals("About")) {
                //handle code here

        }//end of else if
    }//end of clickc listerner
}