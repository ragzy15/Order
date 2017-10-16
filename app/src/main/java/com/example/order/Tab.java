package com.example.order;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class Tab extends Fragment {
    String mParam1;
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           mParam1 = getArguments().getString("params");
        }

    }
    Intent i;
    View v;
    TextView t;
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         v = inflater.inflate(R.layout.list_fragment, container, false);
        ArrayList<ListDataRef> list=new ArrayList<ListDataRef>();
        if(mParam1 == "1"){
            list.clear();
            list.add(new ListDataRef("Mango Juice","₹50"));
            list.add(new ListDataRef("Apple Juice","₹40"));
            list.add(new ListDataRef("Oreo Shake","₹70"));
        }
        if(mParam1 == "2"){
            list.clear();
            list.add(new ListDataRef("Paneer Tikka","₹100"));
            list.add(new ListDataRef("Chicken Wings","₹150"));
            list.add(new ListDataRef("Mushroom","₹90"));
        }
        if(mParam1 == "3"){
            list.clear();
            list.add(new ListDataRef("Taco","₹200"));
            list.add(new ListDataRef("Pizza","₹250"));
            list.add(new ListDataRef("Pasta","₹200"));
        }
        if(mParam1 == "4"){
            list.clear();
            list.add(new ListDataRef("Red Velvet Cake","₹100"));
            list.add(new ListDataRef("Chocolate Brownie","₹90"));
            list.add(new ListDataRef("Ice Cream","₹70"));
        }

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(new AllStudentListAdapter(getActivity(),list));
        return v;
    }
}
