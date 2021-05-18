package com.hfad.mycard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;


public class AboutActivity<TAG> extends AppCompatActivity implements View.OnClickListener {
    final String TAG = "States";
    ImageButton butSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.d(TAG, "MainActivity onCreate()");

        butSend = findViewById(R.id.butSenMess);
        butSend.setOnClickListener(this);
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "MainActivity: onResume");
    }

    @Override
    public void onClick(View v) {

        try {
            EditText messageView = (EditText)findViewById(R.id.massage_my);
            String messageText = messageView.getText().toString();
            Intent telegramIntent = new Intent(Intent.ACTION_VIEW);
            telegramIntent.setData(Uri.parse("http://telegram.me/Ro_JA2020"));
            startActivity(telegramIntent);
        } catch (Exception e) {
            // show error message
        }
        }



    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }
}


