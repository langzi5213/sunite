package com.waji.service;

import com.waji.local.SharedPrefer;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import android.widget.Toast;

public class LocationService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    } 

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
    	AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);
        int minute = 120*60*1000;
        long triggerAtTime = SystemClock.elapsedRealtime() + minute;
        
        Intent i = new Intent(this, LocationReceiver.class);
        PendingIntent pi = PendingIntent.getBroadcast(this, 0, i, 0);
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerAtTime, pi);
        return super.onStartCommand(intent, flags, startId);
    }
}
