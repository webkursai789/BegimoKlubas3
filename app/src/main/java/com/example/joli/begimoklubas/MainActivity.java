package com.example.joli.begimoklubas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openMap(View v) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/Slu%C5%A1k%C5%B3+g.+7,+Vilnius+01100,+Lithuania/@54.6921014,25.2972359,17z/data=!3m1!4b1!4m5!3m4!1s0x46dd941f3d099d47:0xd1313b0aff82480!8m2!3d54.6921014!4d25.2994246"));
        startActivity(intent);
    }


    public void openFacebook(View v) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/groups/begimoklubas/"));
        startActivity(intent);
    }

}

