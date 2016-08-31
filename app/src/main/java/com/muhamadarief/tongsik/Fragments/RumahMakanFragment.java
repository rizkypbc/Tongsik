package com.muhamadarief.tongsik.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muhamadarief.tongsik.R;
import com.muhamadarief.tongsik.Model.Tongkrongan;
import com.muhamadarief.tongsik.Adapter.TongkronganAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RumahMakanFragment extends Fragment {


    public RumahMakanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.recycler_view_item, container, false);

        ArrayList<Tongkrongan> rm = new ArrayList<>();

        rm.add(new Tongkrongan(R.drawable.rm,"Rumah Makan Serba Sari","Ini Alamatnya", "Ini Harganya"));
        rm.add(new Tongkrongan(R.drawable.rm2,"Rumah Makan Khas Sunda","Ini Alamatnya", "Ini Harganya"));
        rm.add(new Tongkrongan(R.drawable.rm,"Rumah Makan Serba Sari","Ini Alamatnya", "Ini Harganya"));


        RecyclerView recyclerView = (RecyclerView) rootview.findViewById(R.id.rvItem);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        TongkronganAdapter adapter = new TongkronganAdapter(getActivity(), rm);
        recyclerView.setAdapter(adapter);


        return rootview;
    }

}
