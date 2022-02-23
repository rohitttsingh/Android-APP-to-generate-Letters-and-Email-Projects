package com.formats.letter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    private AdView mAdView;

     ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//ORIENTATION
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

      

        button1=findViewById(R.id.letter);
        button2=findViewById(R.id.email);

        progressDialog= new ProgressDialog(com.formats.letter.MainActivity.this);

        progressDialog.setMessage("Redirecting To Page ");
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();}


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              progressDialog.show();

                Intent intent = new Intent(new Intent(MainActivity.this, lettertype.class));

                Toasty.info(MainActivity.this,"Opening for Letter....",Toasty.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.show();
                Intent intent = new Intent(new Intent(MainActivity.this, emailtype.class));

                Toasty.info(MainActivity.this,"Opening for Email....",Toasty.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


///GOOGLE ADS
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                super.onAdFailedToLoad(adError);
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }
}