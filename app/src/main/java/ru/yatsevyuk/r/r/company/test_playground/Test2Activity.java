package ru.yatsevyuk.r.r.company.test_playground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class Test2Activity extends FragmentActivity {

    private static final int NUM_pages =2;
    private ViewPager2 viewPager2;
    private FragmentStateAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        viewPager2=findViewById(R.id.pager);
        pagerAdapter=new ScreenSlidePageAdapter(this);
        viewPager2.setAdapter(pagerAdapter);
    }
    private class ScreenSlidePageAdapter extends FragmentStateAdapter {
        public ScreenSlidePageAdapter(Test2Activity test2Activity){
            super(test2Activity);
        }
        public Fragment createFragment(int position){
            switch(position) {
                case 0:
                    return new L21Fragment();
                case 1:
                    return new L22Fragment();
                default:
                    return null;
            }
            }
            public int getItemCount(){
            return NUM_pages;
            }
        }


    }
