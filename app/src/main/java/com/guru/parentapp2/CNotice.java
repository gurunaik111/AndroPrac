package com.guru.parentapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class CNotice extends android.app.Fragment {


    public CNotice() {
        // Required empty public constructor likha nai thaa.. apne aap nhi samajta usko package ka??
        // do package tha ek default n ek project ka ... me project ka utha raha tha wo default le raha tha.. mene b woi socha tha
        //acha.. dot net me samajta usko
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_cnotice, container, false);
        String[] classnotice_menu={"notice one","Notice two","NOtice item three"};
        ListView listView=(ListView) view.findViewById(R.id.classnoticelist);
        ArrayAdapter<String> listViewAdapter= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,classnotice_menu);
        listView.setAdapter(listViewAdapter);

        return view;
    }
}
//sun ab ye sab activities banaya hai usme sab me d.
// kisme
//