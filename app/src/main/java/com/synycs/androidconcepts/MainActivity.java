package com.synycs.androidconcepts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Actuvity_LifeCycle","OnCreate  hfyt");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Actuvity_LifeCycle","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Actuvity_LifeCycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Actuvity_LifeCycle","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Actuvity_LifeCycle","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Actuvity_LifeCycle","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Actuvity_LifeCycle","onDestroy");
    }

}