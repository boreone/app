package com.photograph365.go.photograph.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.photograph365.go.photograph.R;
import com.photograph365.go.photograph.utils.BottomNavigationViewHelper;
import com.photograph365.go.photograph.utils.LogUtil;
import static com.photograph365.go.photograph.utils.LogUtil.makeLogTag;

/**
 * Created by jake64 on 2017/8/21.
 */

public class MainActivity  extends AppCompatActivity {
    protected BottomNavigationView navigationView;
    private static final String TAG = makeLogTag(MainActivity.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        LogUtil.logD(TAG ,"sddiekd");
        BottomNavigationViewHelper.removeShiftMode((BottomNavigationView)findViewById(R.id.bottom));//底部状态栏去动画
        navigationView = (BottomNavigationView) findViewById(R.id.bottom);


        initNavigationView();
    }



    private void initNavigationView() {

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.me:
                        startActivity(new Intent(getBaseContext(),MainActivity.class));
                        break;
                    case R.id.home:
                        startActivity(new Intent(getBaseContext(),MainActivity.class));
                        break;
                }
                return true;
            }
        });
        //  thirdViewModel = new ThirdViewModel(this);
        //  activityMainBinding.setViewModel(thirdViewModel);
    }

    @Override
    protected void onStart() {
        super.onStart();
        updateNavigationBarState();
    }

    // Remove inter-activity transition to avoid screen tossing on tapping bottom navigation items
    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
    private void updateNavigationBarState(){
        int actionId =R.id.me;
        selectBottomNavigationBarItem(actionId);
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
