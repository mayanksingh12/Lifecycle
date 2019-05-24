package com.example.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivty2  extends AppCompatActivity {
    Button button1;

    String tag="ffffff";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Log.d(tag, "2 onCreate: ");
        button1=findViewById(R.id.btn2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivty2.this,MainActivity3.class);
                startActivity(intent);
                MainActivty2.this.finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, " 2 onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, " 2 onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, " 2 onPause: ");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "2 onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "2 onRestart: ");
    }




    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "2 onDestroy: ");
    }




}
