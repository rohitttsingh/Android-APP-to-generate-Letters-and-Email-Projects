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
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class formalemail extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formalemail);

        String[] main_title ={
                "•  The Welcome Email",
                "•  The Offer Email",
                "•  The Survey Email",
                "•  The Request Email",
                "•  The We’re Hiring Email",
                "•  The New Product Email",
                "•  The Reorder Email",
                "•  The Announcement Email",
                "•  The Anniversary Email",
                "•  The Confirmation Email"

        };
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("FormatX");
        getSupportActionBar().setSubtitle("Here you can edit your form");

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#035F5E"));
        actionBar.setBackgroundDrawable(colorDrawable);

        listView= findViewById(R.id.list);

        Mylistadapter  adapter=new Mylistadapter(this, main_title);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value =adapter.getItem(position);
                Toasty.success(formalemail.this, value , Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(formalemail.this,formalemail1.class);
                intent.putExtra("key",value);


                startActivity(intent);


            }
        });


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