package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Configuration extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.configuration);

Button mResetButton = (Button)findViewById(R.id.ResetButton);
mResetButton.setOnClickListener(this);

Button mSaveData = (Button)findViewById(R.id.SaveData);
mSaveData.setOnClickListener(this);

Button mResetFirstInitButton = (Button)findViewById(R.id.ResetFirstInitButton);
mResetFirstInitButton.setOnClickListener(this);

Button mGoDayButton = (Button)findViewById(R.id.GoDayButton);
mGoDayButton.setOnClickListener(this);

}
	
	public void onClick(View v)
    {
		switch (v.getId())
		{
		case R.id.ResetButton:
    	{
    		//Reset config
    		SharedPreferences settings = getSharedPreferences("FileSettings", 0);
    	    SharedPreferences.Editor editor = settings.edit();
    	    editor.putBoolean("FirstRun", true);
    	    editor.putInt("TrainingWeek", 1);
    	    editor.putInt("TrainingDay", 1);
    	    editor.putInt("TrainingLevel", 0);
    	    editor.putInt("UserAge", 0);
    	    editor.putInt("UserLevel",0);
    	    editor.putInt("UserProgress", 0);
    	    editor.putLong("RestTime", 0);
    	    editor.commit();
    		
    		//Return to main menu
    		Intent intent = new Intent();
            intent.setClass(this, HundredPushUps.class);
            startActivity(intent);	
    		break;
    	}
		case R.id.ResetFirstInitButton:
		{
			Intent intent = new Intent();
            intent.setClass(this, FirstInitInit.class);
            startActivity(intent);	
			break;
		}
		case R.id.GoDayButton:
		{
			
			break;
		}
		case R.id.SaveData:
		{
			EditText UserRestTime = (EditText)findViewById(R.id.RestTime);
			int RestTime = Integer.parseInt(UserRestTime.getText().toString());	
			
			SharedPreferences settings = getSharedPreferences("FileSettings", 0);
    	    SharedPreferences.Editor editor = settings.edit();
    	    editor.putLong("RestTime", RestTime);
    	    editor.commit();
    	    
    		Intent intent = new Intent();
            intent.setClass(this, HundredPushUps.class);
            startActivity(intent);	
            
    	    break;
		}
		}
    }
}

