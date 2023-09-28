package com.example.nhom2_activitylifecircle_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {


    private Button buttonToActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        buttonToActivity2 = findViewById(R.id.btnToActivity1);
        buttonToActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity1();
            }
        });
    }
    private void toActivity1() {
        Log.v("ActivityLifeCircle_Tract", "Activity2: OnCreate called");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("ActivityLifeCircle_Tract", "Activity2: OnStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("ActivityLifeCircle_Tract", "Activity2: OnResume called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("ActivityLifeCircle_Tract", "Activity2: OnRestart called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("ActivityLifeCircle_Tract", "Activity2: OnPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("ActivityLifeCircle_Tract", "Activity2: OnStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("ActivityLifeCircle_Tract", "Activity2: OnDestroy called");
    }

}