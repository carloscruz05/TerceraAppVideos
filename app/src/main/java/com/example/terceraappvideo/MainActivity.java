package com.example.terceraappvideo;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button audioPlayerButton = findViewById(R.id.button_audio_player);
        audioPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AudioPlayerActivity.class));
            }
        });

        Button videoMediaPlayerButton = findViewById(R.id.button_video_media_player);
        videoMediaPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VideoMediaPlayerActivity.class));
            }
        });

        Button videoSurfaceViewButton = findViewById(R.id.button_video_surface_view);
        videoSurfaceViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VideoSurfaceViewActivity.class));
            }
        });

        Button videoViewButton = findViewById(R.id.button_video_view);
        videoViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VideoViewActivity.class));
            }
        });

        Button takePhotoButton = findViewById(R.id.button_take_photo);
        takePhotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TakePhotoActivity.class));
            }
        });
    }
}

