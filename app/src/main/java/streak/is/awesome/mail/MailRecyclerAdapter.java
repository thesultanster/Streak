package streak.is.awesome.mail;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import streak.is.awesome.R;

/**
 * Created by sultankhan on 10/14/15.
 */

 public class MailRecyclerAdapter extends RecyclerView.Adapter<MailRecyclerAdapter.MyViewHolder> {

        // emptyList takes care of null pointer exception
        List<MailRecyclerInfo> data = Collections.emptyList();
        LayoutInflater inflator;
        Context context;

        public MailRecyclerAdapter(Context context, List<MailRecyclerInfo> data) {
            this.context = context;
            inflator = LayoutInflater.from(context);
            this.data = data;
        }

        public void addRow(MailRecyclerInfo row){
            data.add(row);
            notifyItemInserted(getItemCount() - 1);
        }

        public void deleteRow(int position) {
            data.remove(position);
            notifyItemRemoved(position);
        }

        // Called when the recycler view needs to create a new row
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            final View view = inflator.inflate(R.layout.row_mail_recycler_view, parent, false);
            MyViewHolder holder = new MyViewHolder(view, new MyViewHolder.MyViewHolderClicks() {
                public void RowClick(View caller, int position) {

                }

            });

            return holder;
        }

        // Setting up the data for each row
        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            // This gives us current information list object
            MailRecyclerInfo current = data.get(position);

            holder.sender.setText(current.getSender());
            holder.subject.setText(current.getSubject());
            holder.body.setText(current.getBody());

        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        // Created my custom view holder
        public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            TextView sender;
            TextView subject;
            TextView body;

            public MyViewHolderClicks mListener;

            // itemView will be my own custom layout View of the row
            public MyViewHolder(View itemView, MyViewHolderClicks listener) {
                super(itemView);

                mListener = listener;
                //Link the objects
                sender = (TextView) itemView.findViewById(R.id.sender);
                subject = (TextView) itemView.findViewById(R.id.subject);
                body = (TextView) itemView.findViewById(R.id.body);

                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    default:
                        mListener.RowClick(v, getAdapterPosition());
                        break;
                }
            }

            public  interface MyViewHolderClicks {
                 void RowClick(View caller, int position);
            }
        }
    }
