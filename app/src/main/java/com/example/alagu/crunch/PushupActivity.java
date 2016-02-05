package com.example.alagu.crunch;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class PushupActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "abcde";
    public static int input;
    public static String message;
    public static int calval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushup);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        Intent intent = getIntent();
        message = intent.getStringExtra(PushupActivity.EXTRA_MESSAGE);
        TextView textV = (TextView) findViewById(R.id.textV);
        textV.setText(message);
        ImageView imv = (ImageView) findViewById(R.id.imageView);

        if (message.equals("How many reps of pushups did you do today?")) {
            imv.setImageResource(R.drawable.pushup);
        } else if (message.equals("How many reps of situps did you do today?")){
            imv.setImageResource(R.drawable.situp);
        } else if (message.equals("How many reps of squats did you do today?")){
            imv.setImageResource(R.drawable.squat);
        } else if (message.equals("How many minutes of leg-lift did you do today?")){
            imv.setImageResource(R.drawable.ll);
        } else if (message.equals("How many minutes of plank did you do today?")){
            imv.setImageResource(R.drawable.plank);
        } else if (message.equals("How many minutes of jumping jacks did you do today?")){
            imv.setImageResource(R.drawable.jj);
        } else if (message.equals("How many reps of pullups did you do today?")){
            imv.setImageResource(R.drawable.pullup);
        } else if (message.equals("How many minutes of cycling did you do today?")){
            imv.setImageResource(R.drawable.cycling);
        } else if (message.equals("How many minutes of walking did you do today?")){
            imv.setImageResource(R.drawable.walking);
        } else if (message.equals("How many minutes of jogging did you do today?")){
            imv.setImageResource(R.drawable.jogging);
        } else if (message.equals("How many minutes of swimming did you do today?")){
            imv.setImageResource(R.drawable.swim);
        } else if (message.equals("How many minutes of stair-climbing did you do today?")){
            imv.setImageResource(R.drawable.sc);
        } else {
            imv.setImageResource(R.drawable.jogging);
        }

    }

    public void calculatecalorie (View view) {
        // Do something in response to button
        Intent intentpushupcal = new Intent(this, calculateActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        if (editText.getText().toString().length() == 0) {
            input = 0;
        } else {
            input = Integer.valueOf(editText.getText().toString()).intValue();
        }
        input = (int) (input*MainActivity.wt);
        if (message.equals("How many reps of pushups did you do today?")) {
            calval = input*100/350;
        } else if (message.equals("How many reps of situps did you do today?")){
            calval = input*100/200;
        } else if (message.equals("How many reps of squats did you do today?")){
            calval = input*100/225;
        } else if (message.equals("How many minutes of leg-lift did you do today?")){
            calval = input*100/25;
        } else if (message.equals("How many minutes of plank did you do today?")){
            calval = input*100/25;
        } else if (message.equals("How many minutes of jumping jacks did you do today?")){
            calval = input*100/10;
        } else if (message.equals("How many reps of pullups did you do today?")){
            calval = input*100/100;
        } else if (message.equals("How many minutes of cycling did you do today?")){
            calval = input*100/12;
        } else if (message.equals("How many minutes of walking did you do today?")){
            calval = input*100/20;
        } else if (message.equals("How many minutes of jogging did you do today?")){
            calval = input*100/12;
        } else if (message.equals("How many minutes of swimming did you do today?")){
            calval = input*100/13;
        } else if (message.equals("How many minutes of stair-climbing did you do today?")){
            calval = input*100/15;
        } else {
            calval = input*100/100;
        }
        String message = "YAY!!! You have burned " +  Integer.toString(calval) + " calories";

        intentpushupcal.putExtra(EXTRA_MESSAGE, message);
        startActivity(intentpushupcal);
    }

}
