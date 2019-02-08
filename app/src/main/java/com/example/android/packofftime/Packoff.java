package com.example.android.packofftime;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.text.NumberFormat;

public class Packoff extends AppCompatActivity {

    double nextPackoff = 0.00;
    double nextPackoffM;
    long nextPackoffH;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packoff);


    }

    private void displayH(long number) {
        TextView nextPackoffH = (TextView) findViewById(R.id.nextPackoffH_view);
        nextPackoffH.setText("" + number);

    }

    private void displayM(double number) {
        TextView nextPackoffM = (TextView) findViewById(R.id.nextPackoffM_view);
        nextPackoffM.setText("" + (int)number);

    }

   private void displayC1(int number){
        TextView cavities_1_d = (TextView) findViewById(R.id.cavities_1_d);
        cavities_1_d.setText(number+"k");
    }
    private void displayC2(int number){
        TextView cavities_2_d = (TextView) findViewById(R.id.cavities_2_d);
        cavities_2_d.setText(number+"k");
    }
    private void displayC3(int number){
        TextView cavities_3_d = (TextView) findViewById(R.id.cavities_3_d);
        cavities_3_d.setText(number+"k");
    }
    private void displayC4(int number){
        TextView cavities_4_d = (TextView) findViewById(R.id.cavities_4_d);
        cavities_4_d.setText(number+"k");
    }
    public void calculate_stem(View view){

        EditText readcounter = (EditText) findViewById(R.id.counter);
        EditText readcycleTime = (EditText) findViewById(R.id.cycletime);
        double cycleTime = Double.valueOf(readcycleTime.getText().toString());
        int  counter = Integer.valueOf(readcounter.getText().toString());
        nextPackoff = (6000 - counter) * cycleTime / 3600;
        if (counter>6000) nextPackoff = 0;
        nextPackoffH = (long) nextPackoff;
        nextPackoffM = (nextPackoff - nextPackoffH)*60;
        nextPackoffM = (long) nextPackoffM;
        //adding it to current time
        double second = Math.floor(System.currentTimeMillis()/1000);
        double minutes = Math.floor(second/60);
        double hour = Math.floor(minutes/60);
        minutes = minutes %60;
        hour = hour %24;
        nextPackoffH+=hour;
        nextPackoffM+=minutes;

        if (nextPackoffM>59){
            nextPackoffH++;
            nextPackoffM-=60;
        }
        if(nextPackoffH>23) nextPackoffH-=24;


        displayH(nextPackoffH);
        displayM(nextPackoffM);
        EditText readcavity1 = (EditText) findViewById(R.id.cavities_1);
        EditText readcavity2 = (EditText) findViewById(R.id.cavities_2);
        EditText readcavity3 = (EditText) findViewById(R.id.cavities_3);
        EditText readcavity4 = (EditText) findViewById(R.id.cavities_4);
        int cavity1 = Integer.valueOf(readcavity1.getText().toString());
        int cavity2 = Integer.valueOf(readcavity2.getText().toString());
        int cavity3 = Integer.valueOf(readcavity3.getText().toString());
        int cavity4 = Integer.valueOf(readcavity4.getText().toString());
        cavity1 = cavity1 * 6;
        cavity2 = cavity2 * 6;
        cavity3 = cavity3 * 6;
        cavity4 = cavity4 * 6;
        displayC1(cavity1);
        displayC2(cavity2);
        displayC3(cavity3);
        displayC4(cavity4);

    }


    public void calculate_housing(View view){

        EditText readcounter = (EditText) findViewById(R.id.counter);
        EditText readcycleTime = (EditText) findViewById(R.id.cycletime);
        double cycleTime = Double.valueOf(readcycleTime.getText().toString());
        int  counter = Integer.valueOf(readcounter.getText().toString());
        nextPackoff = (2500 - counter) * cycleTime / 3600;
        if (counter>2500) nextPackoff = 0;
        nextPackoffH = (long) nextPackoff;
        nextPackoffM = (nextPackoff - nextPackoffH)*60;
        nextPackoffM = (long) nextPackoffM;
        //adding it to current time
        double second = Math.floor(System.currentTimeMillis()/1000);
        double minutes = Math.floor(second/60);
        double hour = Math.floor(minutes/60);
        minutes = minutes %60;
        hour = hour %24;
        nextPackoffH+=hour;
        nextPackoffM+=minutes;

        if (nextPackoffM>59){
            nextPackoffH++;
            nextPackoffM-=60;
        }
        if(nextPackoffH>23) nextPackoffH-=24;

        displayH(nextPackoffH);
        displayM(nextPackoffM);
        EditText readcavity1 = (EditText) findViewById(R.id.cavities_1);

        int cavity1 = Integer.valueOf(readcavity1.getText().toString());

        cavity1 = cavity1 * 2500/1000;

        displayC1(cavity1);
        displayC2(0);
        displayC3(0);
        displayC4(0);



    }

    public void calculate_insert(View view){

        EditText readcounter = (EditText) findViewById(R.id.counter);
        EditText readcycleTime = (EditText) findViewById(R.id.cycletime);
        double cycleTime = Double.valueOf(readcycleTime.getText().toString());
        int  counter = Integer.valueOf(readcounter.getText().toString());
        nextPackoff = (20000 - counter) * cycleTime / 3600;
        if (counter>20000) nextPackoff = 0;
        nextPackoffH = (long) nextPackoff;
        nextPackoffM = (nextPackoff - nextPackoffH)*60;
        nextPackoffM = (long) nextPackoffM;

        //adding it to current time
        double second = Math.floor(System.currentTimeMillis()/1000);
        double minutes = Math.floor(second/60);
        double hour = Math.floor(minutes/60);
        minutes = minutes %60;
        hour = hour %24;
        nextPackoffH+=hour;
        nextPackoffM+=minutes;

        if (nextPackoffM>59){
            nextPackoffH++;
            nextPackoffM-=60;
        }
        if(nextPackoffH>23) nextPackoffH-=24;

        displayH(nextPackoffH);
        displayM(nextPackoffM);
        EditText readcavity1 = (EditText) findViewById(R.id.cavities_1);
        EditText readcavity2 = (EditText) findViewById(R.id.cavities_2);
        EditText readcavity3 = (EditText) findViewById(R.id.cavities_3);
        EditText readcavity4 = (EditText) findViewById(R.id.cavities_4);
        int cavity1 = Integer.valueOf(readcavity1.getText().toString());
        int cavity2 = Integer.valueOf(readcavity2.getText().toString());
        int cavity3 = Integer.valueOf(readcavity3.getText().toString());
        int cavity4 = Integer.valueOf(readcavity4.getText().toString());
        cavity1 = cavity1 * 20;
        cavity2 = cavity2 * 20;
        cavity3 = cavity3 * 20;
        cavity4 = cavity4 * 20;
        displayC1(cavity1);
        displayC2(cavity2);
        displayC3(cavity3);
        displayC4(cavity4);
    }

    public void clear(View view){
        displayC1(0);
        displayC2(0);
        displayC3(0);
        displayC4(0);
        displayH(0);
        displayM(0);
        TextView counter = (TextView) findViewById(R.id.counter);
        counter.setText("0000");
        TextView cycletime = (TextView) findViewById(R.id.cycletime);
        cycletime.setText("0.00");
        TextView cavities_1 = (TextView) findViewById(R.id.cavities_1);
        cavities_1.setText("00");
        TextView cavities_2 = (TextView) findViewById(R.id.cavities_2);
        cavities_2.setText("00");
        TextView cavities_3 = (TextView) findViewById(R.id.cavities_3);
        cavities_3.setText("00");
        TextView cavities_4 = (TextView) findViewById(R.id.cavities_4);
        cavities_4.setText("00");

    }



}
