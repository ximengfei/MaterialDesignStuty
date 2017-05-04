package com.qanzone.coordinatorlayouttest.test;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.qanzone.coordinatorlayouttest.R;

public class SwipeRefreshLayout extends AppCompatActivity {
    android.support.v4.widget.SwipeRefreshLayout viewById;
    private Handler mhandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            viewById.setRefreshing(false);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_refresh_layout);
        viewById = (android.support.v4.widget.SwipeRefreshLayout) findViewById(R.id.refresh_layout);
        viewById.setColorSchemeResources(R.color.colorAccent, R.color.colorPrimary, R.color.colorPrimaryDark);
        viewById.setOnRefreshListener(new android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mhandler.sendEmptyMessageDelayed(1, 2000);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mhandler.removeMessages(1);
    }
}
