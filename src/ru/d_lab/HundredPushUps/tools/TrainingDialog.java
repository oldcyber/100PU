/**
 *
 */
package ru.d_lab.HundredPushUps.tools;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import ru.d_lab.HundredPushUps.R;

/**
 * @author Old Cyber
 */
public class TrainingDialog extends Dialog {

    private Button ok_button;
    private Button cancel_button;
    private final int trWeek;
    private final int trDay;
    private int iter = 0;
    private final String[] cPlan;

    public TrainingDialog(Context context, int trWeek, int trDay, /*int trLevel,*/ String[] cPlan) {
        super(context);
        this.trWeek = trWeek;
        this.trDay = trDay;
        //int trLevel1 = trLevel;
        this.cPlan = cPlan;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.training_dialog);
        ok_button = (Button) findViewById(R.id.ButtonOk);
        cancel_button = (Button) findViewById(R.id.ButtonCancel);

        // Content begin
        tTraining();

        setOnOkClick(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                restTime();
            }
        });

        setOnCancelClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

    }
// Content End

    //ok listener
    void setOnOkClick(View.OnClickListener l) {
        ok_button.setOnClickListener(l);
    }

    //cancel listener
    void setOnCancelClick(View.OnClickListener l) {
        cancel_button.setOnClickListener(l);
    }

    //rest window
    void restTime() {
        long tRest = 0;
        if (trWeek < 5) {
            if (trDay == 1) {
                tRest = 60000;
            } else if (trDay == 2) {
                tRest = 90000;
            } else {
                tRest = 120000;
            }
        } else if (trWeek < 7) {
            if (trDay == 1) {
                tRest = 60000;
            } else {
                tRest = 45000;
            }
        }
        if (iter < cPlan.length - 1) {
            TextView TimeTraining = (TextView) findViewById(R.id.DialogTrainingTex);
            ok_button.setVisibility(View.VISIBLE);
            cancel_button.setVisibility(View.VISIBLE);
            //ok_button.setVisibility(View.INVISIBLE);
            // cancel_button.setVisibility(View.INVISIBLE);
            final TextView TimeTimer = (TextView) findViewById(R.id.DialogRestTex);
            TimeTimer.setVisibility(View.VISIBLE);
            TimeTraining.setVisibility(View.GONE);
            setTitle(R.string.Rest);
            new CountDownTimer(tRest, 1000) {
                public void onTick(long millisUntilFinished) {
                    TimeTimer.setText("" + millisUntilFinished / 1000 + "");
                }

                public void onFinish() {
                    iter = iter + 1;
                    tTraining();
                }
            }.start();
        } else if (iter == cPlan.length - 1) {
            // do nothing
            dismiss();
            //!!! goto save result
        }
    }

    //training window
    void tTraining() {
        if (iter < cPlan.length - 1) {
            if (iter == 0) {
                setTitle(R.string.Training1);
            } else if (iter == 1) {
                setTitle(R.string.Training2);
            } else if (iter == 2) {
                setTitle(R.string.Training3);
            } else if (iter == 3) {
                setTitle(R.string.Training4);
            } else if (iter == 4) {
                setTitle(R.string.Training5);
            } else if (iter == 5) {
                setTitle(R.string.Training6);
            } else if (iter == 6) {
                setTitle(R.string.Training7);
            } else if (iter == 7) {
                setTitle(R.string.Training8);
            } else if (iter == 8) {
                setTitle(R.string.Training9);
            } else {
                //wrong!
            }
            TextView TimeTraining = (TextView) findViewById(R.id.DialogTrainingTex);
            TextView TimeTimer = (TextView) findViewById(R.id.DialogRestTex);
            ok_button.setVisibility(View.VISIBLE);
            cancel_button.setVisibility(View.VISIBLE);
            TimeTimer.setVisibility(View.GONE);
            TimeTraining.setVisibility(View.VISIBLE);
            TimeTraining.setText(cPlan[iter]);
        } else if (iter == cPlan.length - 1) {
            setTitle(R.string.TrainingMax);

            TextView TimeTraining = (TextView) findViewById(R.id.DialogTrainingTex);
            TextView TimeTimer = (TextView) findViewById(R.id.DialogRestTex);
            ok_button.setVisibility(View.VISIBLE);
            cancel_button.setVisibility(View.VISIBLE);
            TimeTimer.setVisibility(View.GONE);
            TimeTraining.setVisibility(View.VISIBLE);
            TimeTraining.setText(cPlan[iter]);
        } else {
            dismiss();
        }
    }


// --Commented out by Inspection START (16.03.10 10:25):
//    /**
//     * @noinspection EmptyMethod
//     */
//    public void saveResult() {
//
//    }
// --Commented out by Inspection STOP (16.03.10 10:25)
}
