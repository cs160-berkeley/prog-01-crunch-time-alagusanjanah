package com.example.alagu.crunch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static double wt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void getweight(View view) {
        int weight;
        EditText ed = (EditText) findViewById(R.id.txew);
        if (ed.getText().toString().length() == 0) {
            weight = 0;
        } else {
            weight = Integer.valueOf(ed.getText().toString()).intValue();
        }
        if (weight<75) {
            wt = 0.5;
        } else if (weight>=75 && weight<=125) {
            wt = 0.75;
        } else if (weight<175 && weight>125) {
            wt = 1;
        } else if (weight>=175 && weight<=225) {
            wt = 1.25;
        } else {
            wt = 1.5;
        }
    }

    public void pushup (View view) {
        Intent intentpushup = new Intent(this, PushupActivity.class);
        String pushupm = "How many reps of pushups did you do today?";
        intentpushup.putExtra(PushupActivity.EXTRA_MESSAGE, pushupm);
        startActivity(intentpushup);
    }

    public void situp (View view) {
        Intent intentsitup = new Intent(this, PushupActivity.class);
        String situpm = "How many reps of situps did you do today?";
        intentsitup.putExtra(PushupActivity.EXTRA_MESSAGE, situpm);
        startActivity(intentsitup);
    }
    public void squats (View view) {
        Intent intentsquat = new Intent(this, PushupActivity.class);
        String situpm = "How many reps of squats did you do today?";
        intentsquat.putExtra(PushupActivity.EXTRA_MESSAGE, situpm);
        startActivity(intentsquat);
    }
    public void leglift (View view) {
        Intent intentleglift = new Intent(this, PushupActivity.class);
        String situpm = "How many minutes of leg-lift did you do today?";
        intentleglift.putExtra(PushupActivity.EXTRA_MESSAGE, situpm);
        startActivity(intentleglift);
    }
    public void plank (View view) {
        Intent intentsitup = new Intent(this, PushupActivity.class);
        String situpm = "How many minutes of plank did you do today?";
        intentsitup.putExtra(PushupActivity.EXTRA_MESSAGE, situpm);
        startActivity(intentsitup);
    }
    public void jumpingjacks (View view) {
        Intent intentsitup = new Intent(this, PushupActivity.class);
        String situpm = "How many minutes of jumping jacks did you do today?";
        intentsitup.putExtra(PushupActivity.EXTRA_MESSAGE, situpm);
        startActivity(intentsitup);
    }
    public void pullup (View view) {
        Intent intentsitup = new Intent(this, PushupActivity.class);
        String situpm = "How many reps of pullups did you do today?";
        intentsitup.putExtra(PushupActivity.EXTRA_MESSAGE, situpm);
        startActivity(intentsitup);
    }
    public void cycling (View view) {
        Intent intentsitup = new Intent(this, PushupActivity.class);
        String situpm = "How many minutes of cycling did you do today?";
        intentsitup.putExtra(PushupActivity.EXTRA_MESSAGE, situpm);
        startActivity(intentsitup);
    }
    public void walking (View view) {
        Intent intentsitup = new Intent(this, PushupActivity.class);
        String situpm = "How many minutes of walking did you do today?";
        intentsitup.putExtra(PushupActivity.EXTRA_MESSAGE, situpm);
        startActivity(intentsitup);
    }
    public void jogging (View view) {
        Intent intentsitup = new Intent(this, PushupActivity.class);
        String situpm = "How many minutes of jogging did you do today?";
        intentsitup.putExtra(PushupActivity.EXTRA_MESSAGE, situpm);
        startActivity(intentsitup);
    }
    public void swimming (View view) {
        Intent intentsitup = new Intent(this, PushupActivity.class);
        String situpm = "How many minutes of swimming did you do today?";
        intentsitup.putExtra(PushupActivity.EXTRA_MESSAGE, situpm);
        startActivity(intentsitup);
    }
    public void stairclimbing (View view) {
        Intent intentsitup = new Intent(this, PushupActivity.class);
        String situpm = "How many minutes of stair-climbing did you do today?";
        intentsitup.putExtra(PushupActivity.EXTRA_MESSAGE, situpm);
        startActivity(intentsitup);
    }

    public void givencal (View view) {
        // Do something in response to button
        Intent intent = new Intent(this, EquivActivity.class);
        int in;
        EditText editText = (EditText) findViewById(R.id.txe);
        if (editText.getText().toString().length() == 0) {
            in = 0;
        } else {
            in = Integer.valueOf(editText.getText().toString()).intValue();
        }
        in = (int) (in*wt);
        int cpushup;
        int csitup;
        int csquat;
        int cleg;
        int cplank;
        int cjj;
        int cpullup;
        int ccycling;
        int cwalking;
        int cjogging;
        int cswimming;
        int cstair;
        String message;
        cpushup = in*350/100;
        csitup = in*200/100;
        csquat = in*225/100;
        cleg = in*25/100;
        cplank = in*25/100;
        cjj = in*10/100;
        cpullup = in*100/100;
        ccycling = in*12/100;
        cwalking = in*20/100;
        cjogging = in*12/100;
        cswimming = in*13/100;
        cstair = in*15/100;
        message = "To burn " + Integer.toString(in) + " calories, you need to do" + System.lineSeparator()
                + Integer.toString(cpushup) + " reps of pushups"+ System.lineSeparator()
                + Integer.toString(csitup) + " reps of situps"+ System.lineSeparator()
                + Integer.toString(csquat) + " minutes of squats" + System.lineSeparator()
                + Integer.toString(cleg) + " minutes of leg-lift" + System.lineSeparator()
                + Integer.toString(cplank) + " minutes of plank" + System.lineSeparator()
                + Integer.toString(cjj) + " minutes of jumping jacks" + System.lineSeparator()
                + Integer.toString(cpullup) + " reps of pullups" + System.lineSeparator()
                + Integer.toString(ccycling) + " minutes of cycling" + System.lineSeparator()
                + Integer.toString(cwalking) + " minutes of walking" + System.lineSeparator()
                + Integer.toString(cjogging) + " minutes of jogging" + System.lineSeparator()
                + Integer.toString(cswimming) + " minutes of swimming" + System.lineSeparator()
                + Integer.toString(cstair) + " minutes of stair-climbing";

        intent.putExtra(PushupActivity.EXTRA_MESSAGE, message);

        startActivity(intent);

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}
