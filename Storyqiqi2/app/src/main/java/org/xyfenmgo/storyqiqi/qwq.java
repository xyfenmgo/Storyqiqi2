package org.xyfenmgo.storyqiqi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class qwq extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qwq);
        Timer t0 = new  Timer();
        TimerTask t1 = new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(qwq.this,start.class));
                finish();
            }
        };t0.schedule(t1,2000);
    }
}
