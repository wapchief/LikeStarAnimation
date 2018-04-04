package com.wapchief.likestaranimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.wapchief.likestarlibrary.like.TCHeartLayout;

/**
 * @author wapchief
 */
public class MainActivity extends AppCompatActivity {

    private TCHeartLayout mHeartLayout;
    private ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mHeartLayout = findViewById(R.id.heart_layout);
        mImageView = findViewById(R.id.btn_like);
        //自定义资源
//        mHeartLayout.setAnimalLength(400);
//        mHeartLayout.setImgColor(Color.parseColor("#000000"));
        mHeartLayout.setDrawableIds(new int[]{R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round});
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHeartLayout.addFavor();
            }
        });
    }
}
