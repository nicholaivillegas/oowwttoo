package com.villegapps.owto.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.villegapps.owto.R;

/**
 * Created by john.villegas on 06/11/2017.
 */

public class ScheduledTripsFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scheduled_trips, container, false);
        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
