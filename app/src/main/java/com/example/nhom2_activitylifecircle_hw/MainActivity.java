package com.example.nhom2_activitylifecircle_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonToActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToActivity2 = findViewById(R.id.btnToActivity2);
        buttonToActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse( "tel: 0" + 912456789));
                startActivity(callIntent);
            }
        });
    }
    private void toActivity2() {
        Log.v("ActivityLifeCircle_Tract", "Activity1: OnCreate called");
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("ActivityLifeCircle_Tract", "Activity1: OnStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("ActivityLifeCircle_Tract", "Activity1: OnResume called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("ActivityLifeCircle_Tract", "Activity1: OnRestart called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("ActivityLifeCircle_Tract", "Activity1: OnPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("ActivityLifeCircle_Tract", "Activity1: OnStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("ActivityLifeCircle_Tract", "Activity1: OnDestroy called");
    }

}