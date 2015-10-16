package streak.is.awesome.pipeline;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by sultankhan on 10/15/15.
 */
public class PipelinePagerAdapter extends FragmentStatePagerAdapter {
    private Context context;
    ArrayList<String> names = new ArrayList<String>();

    public PipelinePagerAdapter(FragmentManager fm, Context context, ArrayList<String> names) {
        super(fm);
        this.context = context;
        this.names = names;
    }

    @Override
    public Fragment getItem(int position) {
        //android.util.Log.d("GET ITEM POSITION", String.valueOf(position));
        PipelineFragment pipelineFragment = PipelineFragment.getInstance(position, this.names.get(position));
        return pipelineFragment;
        //return new MachineProgressFragment();
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
