package com.wakwak.setprimaryitemexample.java;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.wakwak.setprimaryitemexample.R;

public class JavaMainActivity extends AppCompatActivity {
    private static final Handler sHandler = new Handler(Looper.getMainLooper());

    public static void start(AppCompatActivity activity) {
        activity.startActivity(new Intent(activity, JavaMainActivity.class));
    }

    private JavaPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_main);
        initPagerAdapter();

        sHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mAdapter.setItemCount(5);
            }
        }, 500);

        ViewPager pager = findViewById(R.id.pager);
        TabLayout tab = findViewById(R.id.tab);

        pager.setAdapter(mAdapter);
        tab.setupWithViewPager(pager);
    }

    private void initPagerAdapter() {
        mAdapter = new JavaPagerAdapter(getSupportFragmentManager());
    }
}
