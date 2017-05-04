package com.qanzone.coordinatorlayouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.qanzone.coordinatorlayouttest.test.Coordinator_toolbar_scrollerview;
import com.qanzone.coordinatorlayouttest.test.SwipeRefreshLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Coordinator_toolbar_scrollerview(View view) {
        startActivity(new Intent(this, Coordinator_toolbar_scrollerview.class));
    }

    public void SwipeRefreshLayout(View view) {
        startActivity(new Intent(this, SwipeRefreshLayout.class));
    }
}
