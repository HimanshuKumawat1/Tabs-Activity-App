package com.example.andtabact;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView camera, chat, status, varfun ;
    ViewPager viewPager ;
    PagerViewAdapter pagerViewAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camera = (TextView)findViewById(R.id.cameraid);
        chat = (TextView)findViewById(R.id.chatid);
        status = (TextView)findViewById(R.id.statusid);
        varfun = (TextView)findViewById(R.id.varfunid);

        viewPager = (ViewPager)findViewById(R.id.fragment_container);

        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerViewAdapter);


        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });


        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });


        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });


        varfun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(3);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onPageSelected(int position) {

                onChangeTab(position);

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    @RequiresApi( api = Build.VERSION_CODES.M)
    private void onChangeTab(int position) {

        if (position== 0)
        {
            camera.setTextSize(25);
            camera.setTextColor(getColor(R.color.bright_color));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.light_color));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.light_color));

            varfun.setTextSize(20);
            varfun.setTextColor(getColor(R.color.light_color));

        }

        if (position== 1)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.light_color));

            chat.setTextSize(25);
            chat.setTextColor(getColor(R.color.bright_color));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.light_color));

            varfun.setTextSize(20);
            varfun.setTextColor(getColor(R.color.light_color));

        }


        if (position== 2)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.light_color));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.light_color));

            status.setTextSize(25);
            status.setTextColor(getColor(R.color.bright_color));

            varfun.setTextSize(20);
            varfun.setTextColor(getColor(R.color.light_color));

        }


        if (position== 3)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.light_color));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.light_color));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.light_color));

            varfun.setTextSize(25);
            varfun.setTextColor(getColor(R.color.bright_color));

        }

    }

}
