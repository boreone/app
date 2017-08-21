package com.photograph365.go.photograph.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.photograph365.go.photograph.R;
import com.photograph365.go.photograph.listener.CompletedListener;
import com.photograph365.go.photograph.utils.BottomNavigationViewHelper;
import static com.photograph365.go.photograph.utils.LogUtil.makeLogTag;

/**
 * Created by jake64 on 2017/8/21.
 */

public abstract class BaseActivity extends AppCompatActivity implements CompletedListener {
    private static final String TAG = makeLogTag(MainActivity.class);
    protected BottomNavigationView navigationView;
    public int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initNavigationView();
    }
    protected abstract void initView();

    protected abstract void updateNavigationBarState();

    @Override
    protected void onStart() {
        super.onStart();
        updateNavigationBarState();
    }
    public void initNavigationView() {
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.one:
                        startActivity(new Intent(getBaseContext(),MainActivity.class));
                        break;
                    case R.id.two:
                        startActivity(new Intent(getBaseContext(),MainActivity.class));
                        break;
                    case R.id.three:
                        startActivity(new Intent(getBaseContext(),MainActivity.class));
                        break;
                    case R.id.four:
                        startActivity(new Intent(getBaseContext(),MainActivity.class));
                        break;
                    case R.id.five:
                        startActivity(new Intent(getBaseContext(),MainActivity.class));
                        break;
                }
                return true;
            }
        });
    }

    // Remove inter-activity transition to avoid screen tossing on tapping bottom navigation items
    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
    @Override
    public void onCompleted() {

    }
    void selectBottomNavigationBarItem(int itemId) {
        Menu menu = navigationView.getMenu();
        for (int i = 0, size = menu.size(); i < size; i++) {
            MenuItem item = menu.getItem(i);
            boolean shouldBeChecked = item.getItemId() == itemId;
            if (shouldBeChecked) {
                item.setChecked(true);
                break;
            }
        }
    }
}
