package org.xyfenmgo.storyqiqi;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class class15 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class15);
        VideoView videoView=(VideoView) findViewById(R.id.video_view);

        String uri = "android.resource://" + getPackageName() + "/" + R.raw.class15;
        videoView.setVideoURI(Uri.parse(uri));
        videoView.start();
    }
}
