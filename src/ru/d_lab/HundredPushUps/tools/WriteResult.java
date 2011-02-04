/**
 * 
 */
package ru.d_lab.HundredPushUps.tools;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import ru.d_lab.HundredPushUps.R;

/**
 * @author Old Cyber
 *
 */
public class WriteResult extends Dialog {

    // public static final String TAG = "WriteResultDialog"; 
	private Button ok_button;
    private Button cancel_button;
    
	public WriteResult(final Activity activity) {
		super(activity);
        
		setContentView(R.layout.writeresult);
        ok_button = (Button) findViewById(R.id.button_save);
        cancel_button = (Button) findViewById(R.id.button_cancel);
	
        setOnCancelClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                activity.finish();
            }
        });
	
        setOnSaveClick(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	
	
	
	
	}



    void setOnSaveClick(View.OnClickListener l) {
	        ok_button.setOnClickListener(l);
	    }

	    void setOnCancelClick(View.OnClickListener l) {
	        cancel_button.setOnClickListener(l);
	    }
/*	    public String getLogin() {
	        return ((TextView) findViewById(R.id.Result)).getText().toString();
	    }*/


}
