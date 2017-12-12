package io.ermdev.classify.ui.main;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import io.ermdev.classify.data.local.schedule.Schedule;

/**
 * Created by erafaelmanuel on 12/12/2017.
 */

public class ScheduleTabAdapter extends RecyclerView.Adapter<ScheduleTabAdapter.ScheduleViewHolder> {

    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<Schedule> schedules;

    public ScheduleTabAdapter(Context mContext, List<Schedule> schedules) {
        this.mContext=mContext;
        this.schedules=schedules;
        mLayoutInflater=LayoutInflater.from(mContext);
    }

    @Override
    public ScheduleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ScheduleViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ScheduleViewHolder extends RecyclerView.ViewHolder {

        public ScheduleViewHolder(View itemView) {
            super(itemView);
        }

        public void setView() {

        }
    }
}
