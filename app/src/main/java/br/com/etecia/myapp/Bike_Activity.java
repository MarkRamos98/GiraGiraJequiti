package br.com.etecia.myapp;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class Bike_Activity extends AppCompatActivity {

    TabLayout idTabLayoutBikes;
    ViewPager2 ViewPagerBikes;
    AdapterViewPagerBikes adapterViewPagerBikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.bike_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        idTabLayoutBikes = findViewById(R.id.idTabLayoutBikes);
        ViewPagerBikes = findViewById(R.id.ViewPagerBikes);

        adapterViewPagerBikes = new AdapterViewPagerBikes(this);

        ViewPagerBikes.setAdapter(adapterViewPagerBikes);

        idTabLayoutBikes.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {



            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {



            }
        });

        ViewPagerBikes.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);

                idTabLayoutBikes.getTabAt(position);

            }
        });



    }

}