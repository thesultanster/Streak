package streak.is.awesome.pipeline;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sultankhan on 10/15/15.
 */
public class PipelinePagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<String> names = new ArrayList<>();
    Map< Integer, ArrayList<String> > allBoxes = new HashMap<>();

    public PipelinePagerAdapter(FragmentManager fm, ArrayList<String> names, Map<Integer,ArrayList<String> > boxes) {
        super(fm);
        this.names = names;
        this.allBoxes = boxes;
    }

    @Override
    public Fragment getItem(int position) {
        android.util.Log.d("GET ITEM POSITION", String.valueOf(this.allBoxes.size()));
        PipelineFragment pipelineFragment = PipelineFragment.getInstance(position, this.names.get(position), this.allBoxes.get(position));
        return pipelineFragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return names.get(position);

    }

    @Override
    public int getCount() {
        if (names == null)
            return 0;
        return names.size();
    }

}
