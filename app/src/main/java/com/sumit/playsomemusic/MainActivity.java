package com.sumit.playsomemusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Button button, button2;
   Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intitview();
    }

    private void intitview() {
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        intent=new Intent(this,MusicService.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startService(intent);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(intent);
            }
        });
    }

}