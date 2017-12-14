package io.ermdev.classify.ui.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

import io.ermdev.classify.R;
import io.ermdev.classify.data.local.schedule.ScheduleDto;
import io.ermdev.classify.ui.BasicActivity;

public class MainActivity extends BasicActivity implements MainScreen {

    private static final String TAG = MainActivity.class.getSimpleName();

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mSectionsPagerAdapter.setFragments(new Fragment[]{null, new Fragment(), new Fragment()});

        MainPresenter mPresenter = new MainPresenter(this, getDatabaseComponent());
        mPresenter.onLoadSchedules();

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showSchedules(ArrayList<ScheduleDto> schedules) {
        ScheduleFragment mScheduleFragment = new ScheduleFragment();
        Bundle args = new Bundle();

        args.putParcelableArrayList("schedules", schedules);
        mScheduleFragment.setArguments(args);
        mSectionsPagerAdapter.getFragments()[0] = mScheduleFragment;

        Log.i(TAG, "showSchedules");
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        Fragment fragments[] = new Fragment[3];

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public Fragment[] getFragments() {
            return fragments;
        }

        public void setFragments(Fragment[] fragments) {
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            if(position < 0) {
                return fragments[0];
            } else if(position > 2) {
                return fragments[2];
            } else
                return fragments[position];
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
