package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GoStats extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.statistics);
setTitle(R.string.mtitle_Stats);

//Load application preferences
SharedPreferences settings = getSharedPreferences("FileSettings", 0);
int trainingWeek = settings.getInt("TrainingWeek", 1);
int trainingDay = settings.getInt("TrainingDay", 1);
int trainingLevel = settings.getInt("TrainingLevel", 0);
int userAge = settings.getInt("UserAge", 0);
//int userLevel = settings.getInt("UserLevel", 0);
int userProgress = settings.getInt("UserProgress", 0);

String[] dweek = this.getResources().getStringArray(R.array.tweeks);
String[] dday = this.getResources().getStringArray(R.array.tdays);

TextView tv1 = (TextView) findViewById(R.id.StatsAgeRes);
TextView tv2 = (TextView) findViewById(R.id.StatsLevelRes);
TextView tv3 = (TextView) findViewById(R.id.StatsStageRes);
TextView tv4 = (TextView) findViewById(R.id.StatsProgressRes);

tv1.setText(" "+userAge);
tv2.setText(" "+trainingLevel);
tv3.setText(dday[trainingDay-1]+"\n"+dweek[trainingWeek-1]);
tv4.setText(" "+userProgress);

Button mStatsOk = (Button)findViewById(R.id.StatsOk);
mStatsOk.setOnClickListener(this);
}
	public void onClick(View v)
    {
		Intent intent = new Intent();
        intent.setClass(this, HundredPushUps.class);
        startActivity(intent);
    }
}

