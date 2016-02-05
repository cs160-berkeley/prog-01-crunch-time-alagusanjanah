package com.example.alagu.crunch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class calculateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        Intent intent = getIntent();
        String message = intent.getStringExtra(PushupActivity.EXTRA_MESSAGE);
        TextView textVi = (TextView) findViewById(R.id.textVi);
        textVi.setText(message);
    }

    public void gohome (View view) {
        // Do something in response to button
        Intent intentback = new Intent(this, MainActivity.class);

        startActivity(intentback);
    }

    public void findeq (View view) {
        // Do something in response to button
        Intent intentfindeq = new Intent(this, EquivActivity.class);
        int ip = PushupActivity.input;
        ip = (int) (ip*MainActivity.wt);
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
        String messag;
        if (PushupActivity.message.equals("How many reps of pushups did you do today?")) {
            csitup = ip*200/350;
            csquat = ip*225/350;
            cleg = ip*25/350;
            cplank = ip*25/350;
            cjj = ip*10/350;
            cpullup = ip*100/350;
            ccycling = ip*12/350;
            cwalking = ip*20/350;
            cjogging = ip*12/350;
            cswimming = ip*13/350;
            cstair = ip*15/350;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do" + System.lineSeparator()
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
        } else if (PushupActivity.message.equals("How many reps of situps did you do today?")){
            cpushup = ip*350/200;
            csquat = ip*225/200;
            cleg = ip*25/200;
            cplank = ip*25/200;
            cjj = ip*10/200;
            cpullup = ip*100/200;
            ccycling = ip*12/200;
            cwalking = ip*20/200;
            cjogging = ip*12/200;
            cswimming = ip*13/200;
            cstair = ip*15/200;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do" + System.lineSeparator()
                    +  Integer.toString(cpushup) + " reps of pushups"+ System.lineSeparator()
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
        } else if (PushupActivity.message.equals("How many reps of squats did you do today?")){
            cpushup = ip*350/225;
            csitup = ip*200/225;
            cleg = ip*25/225;
            cplank = ip*25/225;
            cjj = ip*10/225;
            cpullup = ip*100/225;
            ccycling = ip*12/225;
            cwalking = ip*20/225;
            cjogging = ip*12/225;
            cswimming = ip*13/225;
            cstair = ip*15/225;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do" + System.lineSeparator()
                    +  Integer.toString(cpushup) + " reps of pushups"+ System.lineSeparator()
                    + Integer.toString(csitup) + " reps of situps"+ System.lineSeparator()
                    + Integer.toString(cleg) + " minutes of leg-lift" + System.lineSeparator()
                    + Integer.toString(cplank) + " minutes of plank" + System.lineSeparator()
                    + Integer.toString(cjj) + " minutes of jumping jacks" + System.lineSeparator()
                    + Integer.toString(cpullup) + " reps of pullups" + System.lineSeparator()
                    + Integer.toString(ccycling) + " minutes of cycling" + System.lineSeparator()
                    + Integer.toString(cwalking) + " minutes of walking" + System.lineSeparator()
                    + Integer.toString(cjogging) + " minutes of jogging" + System.lineSeparator()
                    + Integer.toString(cswimming) + " minutes of swimming" + System.lineSeparator()
                    + Integer.toString(cstair) + " minutes of stair-climbing";
        } else if (PushupActivity.message.equals("How many minutes of leg-lift did you do today?")){
            cpushup = ip*350/25;
            csitup = ip*200/25;
            csquat = ip*225/25;
            cplank = ip*25/25;
            cjj = ip*10/25;
            cpullup = ip*100/25;
            ccycling = ip*12/25;
            cwalking = ip*20/25;
            cjogging = ip*12/25;
            cswimming = ip*13/25;
            cstair = ip*15/25;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do" + System.lineSeparator()
                    +  Integer.toString(cpushup) + " reps of pushups"+ System.lineSeparator()
                    + Integer.toString(csitup) + " reps of situps"+ System.lineSeparator()
                    + Integer.toString(csquat) + " minutes of squats" + System.lineSeparator()
                    + Integer.toString(cplank) + " minutes of plank" + System.lineSeparator()
                    + Integer.toString(cjj) + " minutes of jumping jacks" + System.lineSeparator()
                    + Integer.toString(cpullup) + " reps of pullups" + System.lineSeparator()
                    + Integer.toString(ccycling) + " minutes of cycling" + System.lineSeparator()
                    + Integer.toString(cwalking) + " minutes of walking" + System.lineSeparator()
                    + Integer.toString(cjogging) + " minutes of jogging" + System.lineSeparator()
                    + Integer.toString(cswimming) + " minutes of swimming" + System.lineSeparator()
                    + Integer.toString(cstair) + " minutes of stair-climbing";
        } else if (PushupActivity.message.equals("How many minutes of plank did you do today?")){
            cpushup = ip*350/25;
            csitup = ip*200/25;
            csquat = ip*225/25;
            cleg = ip*25/25;
            cjj = ip*10/25;
            cpullup = ip*100/25;
            ccycling = ip*12/25;
            cwalking = ip*20/25;
            cjogging = ip*12/25;
            cswimming = ip*13/25;
            cstair = ip*15/25;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do" + System.lineSeparator()
                    +  Integer.toString(cpushup) + " reps of pushups"+ System.lineSeparator()
                    + Integer.toString(csitup) + " reps of situps"+ System.lineSeparator()
                    + Integer.toString(csquat) + " minutes of squats" + System.lineSeparator()
                    + Integer.toString(cleg) + " minutes of leg-lift" + System.lineSeparator()
                    + Integer.toString(cjj) + " minutes of jumping jacks" + System.lineSeparator()
                    + Integer.toString(cpullup) + " reps of pullups" + System.lineSeparator()
                    + Integer.toString(ccycling) + " minutes of cycling" + System.lineSeparator()
                    + Integer.toString(cwalking) + " minutes of walking" + System.lineSeparator()
                    + Integer.toString(cjogging) + " minutes of jogging" + System.lineSeparator()
                    + Integer.toString(cswimming) + " minutes of swimming" + System.lineSeparator()
                    + Integer.toString(cstair) + " minutes of stair-climbing";
        } else if (PushupActivity.message.equals("How many minutes of jumping jacks did you do today?")){
            cpushup = ip*350/10;
            csitup = ip*200/10;
            csquat = ip*225/10;
            cleg = ip*25/10;
            cplank = ip*25/10;
            cpullup = ip*100/10;
            ccycling = ip*12/10;
            cwalking = ip*20/10;
            cjogging = ip*12/10;
            cswimming = ip*13/10;
            cstair = ip*15/10;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do" + System.lineSeparator()
                    +  Integer.toString(cpushup) + " reps of pushups"+ System.lineSeparator()
                    + Integer.toString(csitup) + " reps of situps"+ System.lineSeparator()
                    + Integer.toString(csquat) + " minutes of squats" + System.lineSeparator()
                    + Integer.toString(cleg) + " minutes of leg-lift" + System.lineSeparator()
                    + Integer.toString(cplank) + " minutes of plank" + System.lineSeparator()
                    + Integer.toString(cpullup) + " reps of pullups" + System.lineSeparator()
                    + Integer.toString(ccycling) + " minutes of cycling" + System.lineSeparator()
                    + Integer.toString(cwalking) + " minutes of walking" + System.lineSeparator()
                    + Integer.toString(cjogging) + " minutes of jogging" + System.lineSeparator()
                    + Integer.toString(cswimming) + " minutes of swimming" + System.lineSeparator()
                    + Integer.toString(cstair) + " minutes of stair-climbing";
        } else if (PushupActivity.message.equals("How many reps of pullups did you do today?")){
            cpushup = ip*350/100;
            csitup = ip*200/100;
            csquat = ip*225/100;
            cleg = ip*25/100;
            cplank = ip*25/100;
            cjj = ip*10/100;
            ccycling = ip*12/100;
            cwalking = ip*20/100;
            cjogging = ip*12/100;
            cswimming = ip*13/100;
            cstair = ip*15/100;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do" + System.lineSeparator()
                    +  Integer.toString(cpushup) + " reps of pushups"+ System.lineSeparator()
                    + Integer.toString(csitup) + " reps of situps"+ System.lineSeparator()
                    + Integer.toString(csquat) + " minutes of squats" + System.lineSeparator()
                    + Integer.toString(cleg) + " minutes of leg-lift" + System.lineSeparator()
                    + Integer.toString(cplank) + " minutes of plank" + System.lineSeparator()
                    + Integer.toString(cjj) + " minutes of jumping jacks" + System.lineSeparator()
                    + Integer.toString(ccycling) + " minutes of cycling" + System.lineSeparator()
                    + Integer.toString(cwalking) + " minutes of walking" + System.lineSeparator()
                    + Integer.toString(cjogging) + " minutes of jogging" + System.lineSeparator()
                    + Integer.toString(cswimming) + " minutes of swimming" + System.lineSeparator()
                    + Integer.toString(cstair) + " minutes of stair-climbing";
        } else if (PushupActivity.message.equals("How many minutes of cycling did you do today?")){
            cpushup = ip*350/12;
            csitup = ip*200/12;
            csquat = ip*225/12;
            cleg = ip*25/12;
            cplank = ip*25/12;
            cjj = ip*10/12;
            cpullup = ip*100/12;
            cwalking = ip*20/12;
            cjogging = ip*12/12;
            cswimming = ip*13/12;
            cstair = ip*15/12;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do" + System.lineSeparator()
                    +  Integer.toString(cpushup) + " reps of pushups"+ System.lineSeparator()
                    + Integer.toString(csitup) + " reps of situps"+ System.lineSeparator()
                    + Integer.toString(csquat) + " minutes of squats" + System.lineSeparator()
                    + Integer.toString(cleg) + " minutes of leg-lift" + System.lineSeparator()
                    + Integer.toString(cplank) + " minutes of plank" + System.lineSeparator()
                    + Integer.toString(cjj) + " minutes of jumping jacks" + System.lineSeparator()
                    + Integer.toString(cpullup) + " reps of pullups" + System.lineSeparator()
                    + Integer.toString(cwalking) + " minutes of walking" + System.lineSeparator()
                    + Integer.toString(cjogging) + " minutes of jogging" + System.lineSeparator()
                    + Integer.toString(cswimming) + " minutes of swimming" + System.lineSeparator()
                    + Integer.toString(cstair) + " minutes of stair-climbing";
        } else if (PushupActivity.message.equals("How many minutes of walking did you do today?")){
            cpushup = ip*350/20;
            csitup = ip*200/20;
            csquat = ip*225/20;
            cleg = ip*25/20;
            cplank = ip*25/20;
            cjj = ip*10/20;
            cpullup = ip*100/20;
            ccycling = ip*12/20;
            cjogging = ip*12/20;
            cswimming = ip*13/20;
            cstair = ip*15/20;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do" + System.lineSeparator()
                    +  Integer.toString(cpushup) + " reps of pushups"+ System.lineSeparator()
                    + Integer.toString(csitup) + " reps of situps"+ System.lineSeparator()
                    + Integer.toString(csquat) + " minutes of squats" + System.lineSeparator()
                    + Integer.toString(cleg) + " minutes of leg-lift" + System.lineSeparator()
                    + Integer.toString(cplank) + " minutes of plank" + System.lineSeparator()
                    + Integer.toString(cjj) + " minutes of jumping jacks" + System.lineSeparator()
                    + Integer.toString(cpullup) + " reps of pullups" + System.lineSeparator()
                    + Integer.toString(ccycling) + " minutes of cycling" + System.lineSeparator()
                    + Integer.toString(cjogging) + " minutes of jogging" + System.lineSeparator()
                    + Integer.toString(cswimming) + " minutes of swimming" + System.lineSeparator()
                    + Integer.toString(cstair) + " minutes of stair-climbing";
        } else if (PushupActivity.message.equals("How many minutes of jogging did you do today?")){
            cpushup = ip*350/12;
            csitup = ip*200/12;
            csquat = ip*225/12;
            cleg = ip*25/12;
            cplank = ip*25/12;
            cjj = ip*10/12;
            cpullup = ip*100/12;
            ccycling = ip*12/12;
            cwalking = ip*20/12;
            cswimming = ip*13/12;
            cstair = ip*15/12;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do" + System.lineSeparator()
                    +  Integer.toString(cpushup) + " reps of pushups"+ System.lineSeparator()
                    + Integer.toString(csitup) + " reps of situps"+ System.lineSeparator()
                    + Integer.toString(csquat) + " minutes of squats" + System.lineSeparator()
                    + Integer.toString(cleg) + " minutes of leg-lift" + System.lineSeparator()
                    + Integer.toString(cplank) + " minutes of plank" + System.lineSeparator()
                    + Integer.toString(cjj) + " minutes of jumping jacks" + System.lineSeparator()
                    + Integer.toString(cpullup) + " reps of pullups" + System.lineSeparator()
                    + Integer.toString(ccycling) + " minutes of cycling" + System.lineSeparator()
                    + Integer.toString(cwalking) + " minutes of walking" + System.lineSeparator()
                    + Integer.toString(cswimming) + " minutes of swimming" + System.lineSeparator()
                    + Integer.toString(cstair) + " minutes of stair-climbing";
        } else if (PushupActivity.message.equals("How many minutes of swimming did you do today?")){
            cpushup = ip*350/13;
            csitup = ip*200/13;
            csquat = ip*225/13;
            cleg = ip*25/13;
            cplank = ip*25/13;
            cjj = ip*10/13;
            cpullup = ip*100/13;
            ccycling = ip*12/13;
            cwalking = ip*20/13;
            cjogging = ip*12/13;
            cstair = ip*15/13;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do"+ System.lineSeparator()
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
                    + Integer.toString(cstair) + " minutes of stair-climbing";
        } else if (PushupActivity.message.equals("How many minutes of stair-climbing did you do today?")){
            cpushup = ip*350/15;
            csitup = ip*200/15;
            csquat = ip*225/15;
            cleg = ip*25/15;
            cplank = ip*25/15;
            cjj = ip*10/15;
            cpullup = ip*100/15;
            ccycling = ip*12/15;
            cwalking = ip*20/15;
            cjogging = ip*12/15;
            cswimming = ip*13/15;
            messag = "To burn " + Integer.toString(PushupActivity.calval) + " calories, you need to do" + System.lineSeparator()
                    +  Integer.toString(cpushup) + " reps of pushups"+ System.lineSeparator()
                    + Integer.toString(csitup) + " reps of situps"+ System.lineSeparator()
                    + Integer.toString(csquat) + " minutes of squats" + System.lineSeparator()
                    + Integer.toString(cleg) + " minutes of leg-lift" + System.lineSeparator()
                    + Integer.toString(cplank) + " minutes of plank" + System.lineSeparator()
                    + Integer.toString(cjj) + " minutes of jumping jacks" + System.lineSeparator()
                    + Integer.toString(cpullup) + " reps of pullups" + System.lineSeparator()
                    + Integer.toString(ccycling) + " minutes of cycling" + System.lineSeparator()
                    + Integer.toString(cwalking) + " minutes of walking" + System.lineSeparator()
                    + Integer.toString(cjogging) + " minutes of jogging" + System.lineSeparator()
                    + Integer.toString(cswimming) + " minutes of swimming";
        } else {
            messag = "No equivalent";
        }

        intentfindeq.putExtra(PushupActivity.EXTRA_MESSAGE, messag);
        startActivity(intentfindeq);
    }


}
