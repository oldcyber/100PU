package ru.d_lab.HundredPushUps.tools;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import ru.d_lab.HundredPushUps.R;

public class MakePlan  extends Activity {

	//@SuppressWarnings("unused")
	private final int tLevel;
    private final int tDay;
    private final int tWeek;
	
	public MakePlan (final int tLevel, final int tDay, final int tWeek){
		this.tDay = tDay;
		this.tWeek = tWeek;
		this.tLevel = tLevel;
	}
public String[] gettTrainingPlan(Context context) {
		String[] cLocalPlan=null; 
		Resources res = context.getResources();

		if (tWeek==1){
			if (tDay==1){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week1day1level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week1day1level2);}
				else {cLocalPlan = res.getStringArray(R.array.week1day1level3);}
			}
			else if (tDay==2){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week1day2level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week1day2level2);}
				else {cLocalPlan = res.getStringArray(R.array.week1day2level3);}
			}
			else if(tDay==3){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week1day3level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week1day3level2);}
				else {cLocalPlan = res.getStringArray(R.array.week1day3level3);}
			
			}
		}
		else if (tWeek==2){
			if (tDay==1){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week2day1level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week2day1level2);}
				else {cLocalPlan = res.getStringArray(R.array.week2day1level3);}
			}
			else if (tDay==2){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week2day2level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week2day2level2);}
				else {cLocalPlan = res.getStringArray(R.array.week2day2level3);}
			}
			else if(tDay==3){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week2day3level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week2day3level2);}
				else {cLocalPlan = res.getStringArray(R.array.week2day3level3);}
			}
		}
		else if (tWeek==3){
			if (tDay==1){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week3day1level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week3day1level2);}
				else {cLocalPlan = res.getStringArray(R.array.week3day1level3);}
			}
			else if (tDay==2){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week3day2level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week3day2level2);}
				else {cLocalPlan = res.getStringArray(R.array.week3day2level3);}
			}
			else if(tDay==3){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week3day3level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week3day3level2);}
				else {cLocalPlan = res.getStringArray(R.array.week3day3level3);}
			}
		}
		else if (tWeek==4){
			if (tDay==1){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week4day1level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week4day1level2);}
				else {cLocalPlan = res.getStringArray(R.array.week4day1level3);}
			}
			else if (tDay==2){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week4day2level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week4day2level2);}
				else {cLocalPlan = res.getStringArray(R.array.week4day2level3);}
			}
			else if(tDay==3){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week4day3level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week4day3level2);}
				else {cLocalPlan = res.getStringArray(R.array.week4day3level3);}
			}
		}
		else if (tWeek==5){
			if (tDay==1){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week5day1level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week5day1level2);}
				else {cLocalPlan = res.getStringArray(R.array.week5day1level3);}
			}
			else if (tDay==2){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week5day2level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week5day2level2);}
				else {cLocalPlan = res.getStringArray(R.array.week5day2level3);}
			}
			else if(tDay==3){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week5day3level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week5day3level2);}
				else {cLocalPlan = res.getStringArray(R.array.week5day3level3);}
			}
		}
		else if (tWeek==6){
			if (tDay==1){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week6day1level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week6day1level2);}
				else {cLocalPlan = res.getStringArray(R.array.week6day1level3);}
			}
			else if (tDay==2){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week6day2level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week6day2level2);}
				else {cLocalPlan = res.getStringArray(R.array.week6day2level3);}
			}
			else if(tDay==3){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week6day3level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week6day3level2);}
				else {cLocalPlan = res.getStringArray(R.array.week6day3level3);}
			}
		}
		
return cLocalPlan;
			
	}

}
