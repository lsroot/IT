package com.example.lsroot.it;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class UnixConsole extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unix_console);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    public void onClick_unix1(View view) {
        final Animation animScale  = AnimationUtils.loadAnimation(this, R.anim.scale);
        TextView unixTv1 = (TextView) findViewById(R.id.unix_tv1);
        Intent intent = new Intent(this, UnixManConsole.class);
        startActivity(intent);
        //unixTv1.setText("fgdfgdgfd");
        view.startAnimation(animScale);
    }

    public void onClick_unix2(View view) {
        final Animation animScale  = AnimationUtils.loadAnimation(this, R.anim.scale);
        TextView unixTv1 = (TextView) findViewById(R.id.unix_tv1);
        Intent intent = new Intent(this, UnixManConsolePath2.class);
        startActivity(intent);
        view.startAnimation(animScale);



    }
}
