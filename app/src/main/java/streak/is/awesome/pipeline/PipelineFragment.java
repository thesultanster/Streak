package streak.is.awesome.pipeline;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import streak.is.awesome.R;


public class PipelineFragment extends Fragment {

    private RecyclerView recyclerView;
    //private SetRecyclerAdapter adapter;
    int position;
    String pipelineTabName;

    TextView sidewaysCurrentRep;
    TextView sidewaysCurrentSet;
    View myLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_pipeline, container, false);
        Bundle bundle = getArguments();
        if (bundle != null) {
            // Set values
            position = bundle.getInt("position");
            pipelineTabName = bundle.getString("pipelineTabName");
        }



        //recyclerView = (RecyclerView) layout.findViewById(R.id.setRecyclerView);
        //adapter = new SetRecyclerAdapter(getActivity(), getData(sets, position));
        //recyclerView.setAdapter(adapter);
        //recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        myLayout = layout;
        return layout;
    }


    public static PipelineFragment getInstance(int position, String pipelineTabName) {
        PipelineFragment PipelineFragment = new PipelineFragment();

        //Log.d("GET INSTANCE POSITION", String.valueOf(position));

        Bundle args = new Bundle();
        args.putInt("position", position);
        args.putString("pipelineTabName", pipelineTabName);
        PipelineFragment.setArguments(args);

        return PipelineFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}

