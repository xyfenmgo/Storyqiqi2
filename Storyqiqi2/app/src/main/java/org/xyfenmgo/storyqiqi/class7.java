package org.xyfenmgo.storyqiqi;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class class7 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class7);
        VideoView videoView=(VideoView) findViewById(R.id.video_view);

        String uri = "android.resource://" + getPackageName() + "/" + R.raw.class7;
        videoView.setVideoURI(Uri.parse(uri));
        videoView.start();
    }
}
