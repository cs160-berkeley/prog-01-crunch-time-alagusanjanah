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

public class EquivActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equiv);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);



        Intent intent = getIntent();
        String message = intent.getStringExtra(PushupActivity.EXTRA_MESSAGE);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(message);
        //RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        //layout.addView(textView);
    }
    public void backhome (View view) {
        // Do something in response to button
        Intent intentback = new Intent(this, MainActivity.class);

        startActivity(intentback);
    }

}
