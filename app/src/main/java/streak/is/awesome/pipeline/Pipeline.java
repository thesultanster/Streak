package streak.is.awesome.pipeline;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import streak.is.awesome.R;
import streak.is.awesome.util.NavigationDrawerFramework;
import streak.is.awesome.util.SlidingTabLayout;

public class Pipeline extends NavigationDrawerFramework {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private ViewPager mViewPager;
    private SlidingTabLayout mTab;
    ArrayList<String> stages;
    ArrayList<Integer> colors;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pipeline);


        mTab = (SlidingTabLayout) findViewById(R.id.tab);

        // Custom data ====================================================
        stages = new ArrayList<>();
        stages.add("Lead");
        stages.add("Contacted");
        stages.add("Pitched");
        stages.add("Demo");
        stages.add("Negotiating");
        stages.add("Closed - Lost");
        stages.add("Closed - Won");

        Map< Integer, ArrayList<String> > allBoxes = new HashMap<>();
        ArrayList<String> boxes = new ArrayList<String>() {{
            add("Anytime Fitness");
            add("LA Fitness");
            add("24 Hour Fitness");
        }};

        allBoxes.put(0, boxes);

        boxes = new ArrayList<String>() {{
            add("Canyon Crest Recreation");
            add("Fitness for 10");
        }};

        allBoxes.put(1,boxes);

        boxes = new ArrayList<String>() {{
            add("UC Rec Center");
        }};

        allBoxes.put(2,boxes);
        boxes = new ArrayList<String>() {{
            add("Riverside Crossfit");
        }};
        allBoxes.put(3,boxes);
        boxes = new ArrayList<String>() {{
            add("Kings Gym");
        }};
        allBoxes.put(4,boxes);
        boxes = new ArrayList<String>() {{
            add("Get Swoll Gym");
        }};
        allBoxes.put(5,boxes);
        boxes = new ArrayList<String>() {{
            add("Shredded");
        }};
        allBoxes.put(6,boxes);

        colors = new ArrayList<>();
        colors.add(Color.parseColor("#F44336"));
        colors.add(Color.parseColor("#FF9800"));
        colors.add(Color.parseColor("#8BC34A"));
        colors.add(Color.parseColor("#388E3C"));
        colors.add(Color.parseColor("#03A9F4"));
        colors.add(Color.parseColor("#1976D2"));
        colors.add(Color.parseColor("#4CAF50"));


        // =================================================================


        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(new PipelinePagerAdapter(getSupportFragmentManager(), stages, allBoxes));
        mTab.setViewPager(mViewPager);

        //setting indicator and divider color
        mTab.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {

            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.colorAccent);    //define any color in xml resources and set it here, I have used white
            }


        });

        mTab.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mTab.setBackgroundColor(colors.get(position));

            }

            @Override
            public void onPageScrollStateChanged(int state) {


            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }



}
