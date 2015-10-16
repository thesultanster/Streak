package streak.is.awesome.mail;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import java.util.ArrayList;

import streak.is.awesome.ComposeMail;
import streak.is.awesome.R;
import streak.is.awesome.util.NavigationDrawerFramework;


public class Mail extends NavigationDrawerFramework {

    private RecyclerView recyclerView;
    private MailRecyclerAdapter adapter;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);

        fab = (FloatingActionButton) findViewById(R.id.fab);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new MailRecyclerAdapter(Mail.this, new ArrayList<MailRecyclerInfo>());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Mail.this));

        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));
        adapter.addRow(new MailRecyclerInfo("me, Streak", "Streak Android Position", "Show us how serious you are for this position"));


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ComposeMail.class);
                startActivity(intent);
            }
        });


    }
}
