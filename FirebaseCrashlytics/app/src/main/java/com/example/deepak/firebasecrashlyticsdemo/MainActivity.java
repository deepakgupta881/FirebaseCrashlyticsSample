package com.example.deepak.firebasecrashlyticsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.crashlytics.android.Crashlytics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Crashlytics.setUserIdentifier("user123456789");
        Crashlytics.log(Log.DEBUG, "tag", "message");
        Crashlytics.getInstance().crash(); }
}
