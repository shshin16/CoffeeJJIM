package com.coffjjim.coffeejjim.coffeejjim.Display;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coffjjim.coffeejjim.coffeejjim.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeEventPagerFragment extends Fragment {


    public HomeEventPagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fr_home_event_pager, container, false);
    }

}
