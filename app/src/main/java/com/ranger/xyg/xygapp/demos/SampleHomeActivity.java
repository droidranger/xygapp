package com.ranger.xyg.xygapp.demos;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ranger.xyg.xygapp.R;
import com.ranger.xyg.xygapp.demos.recycleview.NormalRecyclerViewAdapter;
import com.ranger.xyg.xygapp.ui.activity.BaseActivity;
import com.ranger.xyg.xygapp.ui.listener.OnRecyclerViewItemClickListener;

import butterknife.BindView;

/**
 * Created by xyg on 2017/4/7.
 */

public class SampleHomeActivity extends BaseActivity {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    private NormalRecyclerViewAdapter mAdapter;

    @Override
    protected int getContentResId() {
        return R.layout.activity_recycler_view_demo;
    }

    @Override
    protected void initViews() {
        super.initViews();
        //这里用线性显示 类似于listview
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new NormalRecyclerViewAdapter(this);
        mAdapter.setData(getResources().getStringArray(R.array.DemosList));
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new OnRecyclerViewItemClickListener<String>() {
            @Override
            public void onItemClick(View view, String data) {

            }
        });
    }
}
