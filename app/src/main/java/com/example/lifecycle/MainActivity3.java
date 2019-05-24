package com.example.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3  extends AppCompatActivity {

    String tag="ffffff";
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Log.d(tag, "3 onCreate: ");
        button2=findViewById(R.id.btn3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this,MainActivity.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);

            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, " 3 onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, " 3 onResume: ");

         onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, " 3 onPause: ");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "3 onStop: ");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "3 onRestart: ");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "3 onDestroy: ");
    }



    }





