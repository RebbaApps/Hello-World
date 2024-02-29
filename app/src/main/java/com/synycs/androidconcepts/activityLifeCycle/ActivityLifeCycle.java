package com.synycs.androidconcepts.activityLifeCycle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.synycs.androidconcepts.R;

public class ActivityLifeCycle extends AppCompatActivity {

    Button tv_alert_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        tv_alert_dialog = findViewById(R.id.tv_alert_dialog);


        Log.i("Actuvity_LifeCycle","OnCreate");
        finish();

        tv_alert_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
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

    //======================================

    public void showalertDialog()
    {

    }
}