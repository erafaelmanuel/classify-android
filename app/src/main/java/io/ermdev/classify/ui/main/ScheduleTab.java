package io.ermdev.classify.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import io.ermdev.classify.R;
import io.ermdev.classify.data.local.schedule.Schedule;

/**
 * Created by erafaelmanuel on 12/11/2017.
 */

public class ScheduleTab extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_schedule, container, false);
        RecyclerView mRecyclerView = rootView.findViewById(R.id.schedule_view);
        scheduleRecyclerView = (RecyclerView)
                customView.findViewById(R.id.shedule_recyclerview);
        scheduleAdapter = new ScheduleAdapter(getContext(), scheduleList);
        scheduleRecyclerView.setAdapter(scheduleAdapter);
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        scheduleRecyclerView.setLayoutManager(layoutManager);
        scheduleRecyclerView.setItemAnimator(new DefaultItemAnimator());
        scheduleRecyclerView.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.INVISIBLE);
        return rootView;
    }
}
