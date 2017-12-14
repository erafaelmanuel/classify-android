package io.ermdev.classify.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import io.ermdev.classify.R;
import io.ermdev.classify.data.local.schedule.ScheduleDto;

/**
 * Created by erafaelmanuel on 12/11/2017.
 */

public class ScheduleFragment extends Fragment {

    private static final String TAG = ScheduleFragment.class.getSimpleName();
    private ArrayList<ScheduleDto> schedules = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private ScheduleTabAdapter scheduleAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.i(TAG,"onCreateView ");

        if(getArguments() != null)
            schedules = getArguments().getParcelableArrayList("schedules");
        else
            schedules = new ArrayList<>();

        View rootView = inflater.inflate(R.layout.fragment_main_schedule, container, false);
        scheduleAdapter = new ScheduleTabAdapter(getContext(), schedules);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView = rootView.findViewById(R.id.schedule_view);
        mRecyclerView.setAdapter(scheduleAdapter);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        return rootView;
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
        //schedules.clear();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }
}
