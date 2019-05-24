package com.example.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String tag = "ffffff";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "1 onCreate: ");
        button = findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivty2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, " 1 onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, " 1 onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, " 1 onPause: ");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "1 onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "1 onRestart: ");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "1 onDestroy: ");
    }


}
