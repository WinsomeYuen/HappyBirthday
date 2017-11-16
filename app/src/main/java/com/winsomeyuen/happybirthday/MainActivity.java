package com.winsomeyuen.happybirthday;

import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);

        VideoView videoview = (VideoView) findViewById(R.id.videoview);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.advert);

        videoview.setVideoURI(uri);
        videoview.start();
    }

}
