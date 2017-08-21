package com.photograph365.go.photograph.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.photograph365.go.photograph.R;

public class WelcomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载启动图片
        setContentView(R.layout.activity_welcome);
        //后台处理耗时任务
        new Thread(new Runnable() {
            @Override
            public void run() {
                //耗时任务，比如加载网络数据
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //跳转至 MainActivity
                        Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                        startActivity(intent);

                        //        Integer time = 20000;    //设置等待时间，单位为毫秒
                        //        Handler handler = new Handler();
                        //        //当计时结束时，跳转至主界面
                        //        handler.postDelayed(new Runnable() {
                        //            @Override
                        //            public void run() {
                        //                Welcome.this.finish();
                        //            }
                        //        }, time);

                        //结束当前的 Activity

                        WelcomeActivity.this.finish();
                    }
                });
            }
        }).start();
    }

}
