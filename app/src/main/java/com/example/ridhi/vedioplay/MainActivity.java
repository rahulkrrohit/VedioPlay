package com.example.ridhi.vedioplay;



import java.net.URI;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {
    private static final String TAG = "PRANJAL";
    private boolean isImage = false;
    private String reviewImageLink;
    private MediaController mc;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView vd = (VideoView) findViewById(R.id.VideoView);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "hello");

        mc = new MediaController(this);
        vd.setMediaController(mc);

        vd.setVideoURI(uri);
        vd.start();
    }

}