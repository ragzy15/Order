package com.example.order;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nikhil on 5/9/17.
 */

public class AllStudentListAdapter extends RecyclerView.Adapter<AllStudentListAdapter.MyViewHolder> {
    Context context;
    ArrayList<ListDataRef> mStudentDetailsList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        ListDataRef currentRef = mStudentDetailsList.get(position);
        holder.itemName.setText( currentRef.getName());
        holder.price.setText( currentRef.getPrice());
        holder.quantity.setText("0");
        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int qn = Integer.parseInt(holder.quantity.getText().toString().trim());
                qn++;
                holder.quantity.setText(String.valueOf(qn));
            }
        });
        holder.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int qn = Integer.parseInt(holder.quantity.getText().toString().trim());
                if(qn > 0){
                    qn--;
                    holder.quantity.setText(String.valueOf(qn));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mStudentDetailsList.size();
    }

    public AllStudentListAdapter(Activity context, ArrayList<ListDataRef> mStudentDetailsList) {
        this.context = context;
        this.mStudentDetailsList = mStudentDetailsList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView itemName;
        public TextView price;
        public TextView quantity;
        Button minus;
        Button add;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemName = (TextView) itemView.findViewById(R.id.itemName);
            price = (TextView) itemView.findViewById(R.id.price);
            quantity = (TextView) itemView.findViewById(R.id.quantity);
            minus = (Button) itemView.findViewById(R.id.minusBtn);
            add = (Button) itemView.findViewById(R.id.addBtn);
        }
    }

}
