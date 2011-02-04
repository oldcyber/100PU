package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

class CopyOfGoTraining extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	private static final int DIALOG_1 = 1;
	private static final int DIALOG_2 = 2;
	private static final int DIALOG_3 = 3;
	private static final int DIALOG_4 = 4;
	private static final int DIALOG_5 = 5;
	private static final int DIALOG_REST_1=6;
	private static final int DIALOG_REST_2=7;
	private static final int DIALOG_REST_3=8;
	private static final int DIALOG_REST_4=9;
	private static final int DIALOG_SAVE = 10;
	
	@Override
public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.training);

//Load application preferences

SharedPreferences settings = getSharedPreferences("FileSettings", 0);
int trainingWeek = settings.getInt("TrainingWeek", 1);
int trainingDay = settings.getInt("TrainingDay", 1);
int trainingLevel = settings.getInt("TrainingLevel", 0);
TextView tv1 = (TextView) findViewById(R.id.Trainig1);
TextView tv2 = (TextView) findViewById(R.id.Trainig2);
TextView tv3 = (TextView) findViewById(R.id.Trainig3);
TextView tv4 = (TextView) findViewById(R.id.Trainig4);
TextView tv5 = (TextView) findViewById(R.id.Trainig5); 
String[] cPlan = null;

//trainingLevel = 1;
if (trainingWeek==1){
	if (trainingDay==1){
		if (trainingLevel==1){cPlan = this.getResources().getStringArray(R.array.week1day1level1);}
		else if (trainingLevel==2){cPlan = this.getResources().getStringArray(R.array.week1day1level2);}
		else {cPlan = this.getResources().getStringArray(R.array.week1day1level3);}
	}
	else if (trainingDay==2){
		if (trainingLevel==1){cPlan = this.getResources().getStringArray(R.array.week1day2level1);}
		else if (trainingLevel==2){cPlan = this.getResources().getStringArray(R.array.week1day2level2);}
		else {cPlan = this.getResources().getStringArray(R.array.week1day2level3);}
	}
	else if(trainingDay==3){
		if (trainingLevel==1){cPlan = this.getResources().getStringArray(R.array.week1day3level1);}
		else if (trainingLevel==2){cPlan = this.getResources().getStringArray(R.array.week1day3level2);}
		else {cPlan = this.getResources().getStringArray(R.array.week1day3level3);}
	
	}

}

tv1.setText(cPlan[0]);
tv2.setText(cPlan[1]);
tv3.setText(cPlan[2]);
tv4.setText(cPlan[3]);
tv5.setText("max ("+getText(R.string.TrainingMax)+" "+cPlan[4]+")");

Button mFirstRunOk = (Button)findViewById(R.id.BeginTraining);
mFirstRunOk.setOnClickListener(this);



}

	@Override

	protected Dialog onCreateDialog(int id) {
		
		SharedPreferences settings = getSharedPreferences("FileSettings", 0);
        long restTime = settings.getLong("RestTime", 10);
        restTime = (restTime+1)*1000;
        int trainingWeek = settings.getInt("TrainingWeek", 1);
    	int trainingDay = settings.getInt("TrainingDay", 1);
    	int trainingLevel = settings.getInt("TrainingLevel", 0);    	
    	String[] cPlan = null;
    	
    	Button mdialog_Next1 = (Button)findViewById(R.id.BeginTraining);
    	mdialog_Next1.setOnClickListener(this);
    	
    	if (trainingWeek==1){
    		if (trainingDay==1){
    			if (trainingLevel==1){cPlan = this.getResources().getStringArray(R.array.week1day1level1);}
    			else if (trainingLevel==2){cPlan = this.getResources().getStringArray(R.array.week1day1level2);}
    			else {cPlan = this.getResources().getStringArray(R.array.week1day1level3);}
    		}
    		else if (trainingDay==2){
    			if (trainingLevel==1){cPlan = this.getResources().getStringArray(R.array.week1day2level1);}
    			else if (trainingLevel==2){cPlan = this.getResources().getStringArray(R.array.week1day2level2);}
    			else {cPlan = this.getResources().getStringArray(R.array.week1day2level3);}
    		}
    		else if(trainingDay==3){
    			if (trainingLevel==1){cPlan = this.getResources().getStringArray(R.array.week1day3level1);}
    			else if (trainingLevel==2){cPlan = this.getResources().getStringArray(R.array.week1day3level2);}
    			else {cPlan = this.getResources().getStringArray(R.array.week1day3level3);}
    		}
    	}
    	
    	
    	switch (id) {
        case DIALOG_1:

            LayoutInflater factory = LayoutInflater.from(this); 
            final View textEntryView = factory.inflate(R.layout.gotraining, null); 
            return new AlertDialog.Builder(CopyOfGoTraining.this) 
                .setIcon(R.drawable.light) 
                .setTitle(R.string.Training1) 
                .setView(textEntryView) 

                //.setMessage(getText(R.string.TrainigNum)+" "+cPlan[0])
                .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() { 
                    public void onClick(DialogInterface dialog, int whichButton) { 
                    	showDialog(DIALOG_REST_1);
                    } 
                })  
                .create(); 
         	
        case DIALOG_2:
        	return new AlertDialog.Builder(CopyOfGoTraining.this)
        	.setIcon(R.drawable.light)
            .setTitle(R.string.Training2)
        	.setMessage(getText(R.string.TrainigNum)+" "+cPlan[1])
            .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                	showDialog(DIALOG_REST_2);
                }
            })		
            .create();
        case DIALOG_3:
        	return new AlertDialog.Builder(CopyOfGoTraining.this)
        	.setIcon(R.drawable.light)
            .setTitle(R.string.Training3)
        	.setMessage(getText(R.string.TrainigNum)+" "+cPlan[2])
            .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                	showDialog(DIALOG_REST_3);
                }
            })		
            .create();
        case DIALOG_4:
        	return new AlertDialog.Builder(CopyOfGoTraining.this)
        	.setIcon(R.drawable.light)
            .setTitle(R.string.Training4)
        	.setMessage(getText(R.string.TrainigNum)+" "+cPlan[3])
            .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                	showDialog(DIALOG_REST_4);
                }
            })		
            .create();
        case DIALOG_5:
        	return new AlertDialog.Builder(CopyOfGoTraining.this)
        	.setIcon(R.drawable.light)
            .setTitle(R.string.Training5)
        	.setMessage(getText(R.string.TrainigNum)+" "+cPlan[4])
            .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                	//showDialog(DIALOG_REST);
                }
            })		
            .create();
        
        case DIALOG_REST_1:
        	Dialog dialog1 = new Dialog(this);
        	dialog1.setContentView(R.layout.timer);
        	dialog1.setTitle(R.string.Rest);
        	final TextView tv11 = (TextView) dialog1.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv11.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
                showDialog(DIALOG_2);
                removeDialog(6);
                //dismissDialog(6);
                }
             }.start(); 
         	return dialog1;
         	
        case DIALOG_REST_2:
        	Dialog dialog2 = new Dialog(this);
        	dialog2.setContentView(R.layout.timer);
        	dialog2.setTitle(R.string.Rest);
        	final TextView tv12 = (TextView) dialog2.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv12.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
                showDialog(DIALOG_3);
                removeDialog(7);
                }
             }.start(); 
         	return dialog2;
         	
        case DIALOG_REST_3:
        	Dialog dialog3 = new Dialog(this);
        	dialog3.setContentView(R.layout.timer);
        	dialog3.setTitle(R.string.Rest);
        	final TextView tv13 = (TextView) dialog3.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv13.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
                showDialog(DIALOG_4);
                removeDialog(8);
                }
             }.start(); 
         	return dialog3;

        case DIALOG_REST_4:
        	Dialog dialog4 = new Dialog(this);
        	dialog4.setContentView(R.layout.timer);
        	dialog4.setTitle(R.string.Rest);
        	final TextView tv14 = (TextView) dialog4.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv14.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
                showDialog(DIALOG_5);
                removeDialog(9);
                }
             }.start(); 
         	return dialog4;
         	//finish
        case DIALOG_SAVE:
        	return new AlertDialog.Builder(CopyOfGoTraining.this)
        	.setIcon(R.drawable.light)
            .setTitle(R.string.Training5)
        	.setMessage(getText(R.string.TrainigNum)+" "+cPlan[4])
            .setView(getCurrentFocus())
        	.setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                	//showDialog(DIALOG_REST);
                }
            })		
            .create();   	
    	}
		return null;
	}	
	
	


	
	public void onClick(View v)
    {
		switch (v.getId())
    	{
		case R.id.BeginTraining:
    	{
    		showDialog(DIALOG_1);
    		break;
    	}
//		case R.id.dialog_Next:
//		{
//			showDialog(DIALOG_REST_1);
//            removeDialog(1);
//			break;
//		}
    	default:
    		break;
    	}
		/*
		Intent intent = new Intent();
        intent.setClass(this, Timer.class);
        startActivity(intent);
        */
    }
}

