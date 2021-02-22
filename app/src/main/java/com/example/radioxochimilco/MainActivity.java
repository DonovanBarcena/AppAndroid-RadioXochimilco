package com.example.radioxochimilco;



import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView btnLive, btnPodcast, btnInstagram, btnYoutube;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //Botones
        btnLive = (ImageView)findViewById(R.id.btnLive);
        btnPodcast = (ImageView)findViewById(R.id.btnPodcast);
        btnInstagram = (ImageView)findViewById(R.id.btnInstagram);
        btnYoutube = (ImageView)findViewById(R.id.btnYoutube);

        //Creacion del objeto MediaPlayer
        mediaPlayer = new MediaPlayer();
        prepareMediaPlayer();

        btnLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    btnLive.setImageResource(R.drawable.ic_mic);
                }else {
                    mediaPlayer.start();
                    btnLive.setImageResource(R.drawable.ic_mic_live);
                }
            }
        });
        btnPodcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private void prepareMediaPlayer() {
        try {
            mediaPlayer.setDataSource("https://18553.live.streamtheworld.com/XHEXA_SC?DIST=TuneIn&TGT=TuneIn&maxServers=2&gdpr=0&us_privacy=1YNY&partnertok=eyJhbGciOiJIUzI1NiIsImtpZCI6InR1bmVpbiIsInR5cCI6IkpXVCJ9.eyJ0cnVzdGVkX3BhcnRuZXIiOnRydWUsImlhdCI6MTYxMDE1OTgyMSwiaXNzIjoidGlzcnYifQ.QfPKf3tQORX_Rr7UwynQrvZIzwKjf-pmxzDSqbfx2v4");
            mediaPlayer.prepare();
        } catch (Exception exception) {

        }
    }

}
