package com.formats.letter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import es.dmoral.toasty.Toasty;

public class lettertype extends AppCompatActivity {
    Button button1,button2;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lettertype);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        button1=findViewById(R.id.formalbtn);
        button2=findViewById(R.id.informalbtn);

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("FormatX");
        getSupportActionBar().setSubtitle("Here you can edit your Letter");
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF018786"));
        actionBar.setBackgroundDrawable(colorDrawable);


 //

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(new Intent(lettertype.this, fromalletter.class));

                Toasty.info(lettertype.this,"Opening for Formal Letter....",Toasty.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(new Intent(lettertype.this, informalleter.class));

                Toasty.info(lettertype.this,"Opening for InFormal Letter....",Toasty.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

//

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

///
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.logout:

                Toasty.success(this,"Logged Out",Toasty.LENGTH_LONG).show();
                finish();
                System.exit(0);
                break;
            case R.id.about:
                Toasty.info(this, "App Developer \n ROHIT SINGH", Toast.LENGTH_LONG).show();

                break;
            case R.id.bug:
                Toasty.success(this,"Bug Reposted Successfully",Toast.LENGTH_SHORT).show();
                break;


        }
        return true;
    }
}