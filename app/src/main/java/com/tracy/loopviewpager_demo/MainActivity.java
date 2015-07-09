package com.tracy.loopviewpager_demo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tracy.viewPager.LoopViewPager;


public class MainActivity extends Activity {


    String[] data = {"page 1" , "page 2" , "page 3" , "page 4" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoopViewPager pager = (LoopViewPager)findViewById(R.id.pager);
        
        
        pager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return data.length;
            }

            @Override
            public boolean isViewFromObject(View view, Object o) {
                return o == view;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                TextView tv = new TextView(getApplicationContext());
                tv.setText(data[position]);
                tv.setTextColor(Color.BLACK);
                container.addView(tv);
                return tv;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView((View)object);
            }
        });
    }
    
    


}
