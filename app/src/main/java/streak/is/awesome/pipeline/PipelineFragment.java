package streak.is.awesome.pipeline;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import streak.is.awesome.R;
import streak.is.awesome.mail.MailRecyclerInfo;


public class PipelineFragment extends Fragment {

    private RecyclerView recyclerView;
    private PipelineRecyclerAdapter adapter;
    int position;
    String pipelineTabName;
    View myLayout;

    ArrayList<String> boxes = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_pipeline, container, false);
        Bundle bundle = getArguments();
        if (bundle != null) {
            // Set values
            boxes = (ArrayList<String>) bundle.getSerializable("box");
            position = bundle.getInt("position");
            pipelineTabName = bundle.getString("pipelineTabName");
        }



        recyclerView = (RecyclerView) layout.findViewById(R.id.recyclerView);
        adapter = new PipelineRecyclerAdapter(getActivity(), new ArrayList<PipelineRecyclerInfo>());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        for (String box : boxes){
            adapter.addRow(new PipelineRecyclerInfo(box,"Assigned To:","Notes: "));
        }

        myLayout = layout;
        return layout;
    }


    public static PipelineFragment getInstance(int position, String pipelineTabName, ArrayList<String> boxes) {

        PipelineFragment PipelineFragment = new PipelineFragment();

        Bundle args = new Bundle();
        args.putSerializable("box", boxes);
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

