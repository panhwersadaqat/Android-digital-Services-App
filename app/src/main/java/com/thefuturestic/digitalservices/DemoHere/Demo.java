package com.thefuturestic.digitalservices.DemoHere;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.thefuturestic.digitalservices.R;

public class Demo extends AppCompatActivity {
    RecyclerView recyclerView;
    private ImageView back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_demo);

        recyclerView = (RecyclerView) findViewById(R.id.rvMain);
        back = (ImageView)findViewById(R.id.back_btn);
        Bitmap[] bitmaps = setUpBitmaps();
        recyclerView.setAdapter(new GridLayoutAdapter(bitmaps));
        StaggeredGridLayoutManager mLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLayoutManager);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private Bitmap[] setUpBitmaps() {
        Bitmap[] bitmaps = new Bitmap[6];
//        bitmaps[0] = BitmapFactory.decodeResource(getResources(), R.drawable.banner1);
//        bitmaps[1] = BitmapFactory.decodeResource(getResources(), R.drawable.samplle_two);
//        bitmaps[2] = BitmapFactory.decodeResource(getResources(), R.drawable.samplle);
//        bitmaps[3] = BitmapFactory.decodeResource(getResources(), R.drawable.samplle_two);
//        bitmaps[4] = BitmapFactory.decodeResource(getResources(), R.drawable.samplle);
//        bitmaps[5] = BitmapFactory.decodeResource(getResources(), R.drawable.samplle_two);
//        bitmaps[6] = BitmapFactory.decodeResource(getResources(), R.drawable.samplle);
//        bitmaps[7] = BitmapFactory.decodeResource(getResources(), R.drawable.samplle_two);

        bitmaps[0] = BitmapFactory.decodeResource(getResources(), R.drawable.business2);
        bitmaps[1] = BitmapFactory.decodeResource(getResources(), R.drawable.banner1);
        bitmaps[2] = BitmapFactory.decodeResource(getResources(), R.drawable.poster2);
        bitmaps[3] = BitmapFactory.decodeResource(getResources(), R.drawable.certificate1);
        bitmaps[4] = BitmapFactory.decodeResource(getResources(), R.drawable.social_media_post_2);
        bitmaps[5] = BitmapFactory.decodeResource(getResources(), R.drawable.logo1);


        return bitmaps;
    }
}