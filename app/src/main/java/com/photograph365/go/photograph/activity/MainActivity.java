package com.photograph365.go.photograph.activity;

import android.os.Handler;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.photograph365.go.photograph.R;
import com.photograph365.go.photograph.utils.BottomNavigationViewHelper;


/**
 * Created by jake64 on 2017/8/21.
 */

public class MainActivity  extends BaseActivity {

    @Override
    protected void initView() {
        setContentView(R.layout.main_activity);

    }

    @Override
    protected void updateNavigationBarState(){
        int actionId =R.id.home;
        selectBottomNavigationBarItem(actionId);
    }

    private boolean mIsExit;
    @Override
    /**
     * 双击返回键退出
     */
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (mIsExit) {
                this.finish();
            } else {
                Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
                mIsExit = true;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mIsExit = false;
                    }
                }, 2000);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


}
