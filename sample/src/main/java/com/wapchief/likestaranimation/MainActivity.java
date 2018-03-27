package com.wapchief.likestaranimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHeartLayout.addFavor();
            }
        });
    }
}
