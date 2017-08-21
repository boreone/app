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

public class MainActivity  extends BaseActivity {
    protected BottomNavigationView navigationView;
    private static final String TAG = makeLogTag(MainActivity.class);

    @Override
    protected void initView() {
        setContentView(R.layout.main_activity);
    }

    @Override
    protected void updateNavigationBarState(){
        int actionId =R.id.me;
        selectBottomNavigationBarItem(actionId);
    }




}
