package com.example.reboot.video;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView myvideo=(VideoView)findViewById(R.id.videoView);
        myvideo.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
        //myvideo.start();
        MediaController mycontroller=new MediaController(this);
        mycontroller.setAnchorView(myvideo);
        myvideo.setMediaController(mycontroller);


    }

}
