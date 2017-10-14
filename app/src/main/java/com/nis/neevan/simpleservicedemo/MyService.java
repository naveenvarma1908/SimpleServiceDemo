package com.nis.neevan.simpleservicedemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Naveen Varma on 10/14/2017.
 */

public class MyService extends Service {

    MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        player = MediaPlayer.create(this,R.raw.app_tone);
        player.start(); // Start PLaying the Music
        player.setLooping(true); // true means music will playing repeatdly.

        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        player.stop(); // By calling this method service will get stopped.

        Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show();
    }
}
