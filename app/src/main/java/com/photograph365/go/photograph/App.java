package com.photograph365.go.photograph;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/*
 * Created by Alexander Krol (troy379) on 29.08.16.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        /**
         * IMPORTANT! Enable the configuration below, if you expect to open really large images.
         * Also you can add the {@code android:largeHeap="true"} to Manifest file to avoid an OOM error.*/
//        ImagePipelineConfig config = ImagePipelineConfig.newBuilder(this)
//                .setProgressiveJpegConfig(new SimpleProgressiveJpegConfig())
//                .setResizeAndRotateEnabledForNetwork(true)
//                .setDownsampleEnabled(true)
//                .build();
//        Fresco.initialize(this, config);

        Fresco.initialize(this);
        Realm.init(this);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfig);

    }


 //   public static App get(Context context) {
 //       return (App) context.getApplicationContext();
 //   }






}
