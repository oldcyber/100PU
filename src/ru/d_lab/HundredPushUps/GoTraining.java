package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;
import ru.d_lab.HundredPushUps.tools.MakePlan;
import ru.d_lab.HundredPushUps.tools.TrainingDialog;
import ru.d_lab.HundredPushUps.tools.WriteResult;

public class GoTraining extends Activity implements OnClickListener {
    /**
     * Called when the activity is first created.
     */
/*	private static final int TRAINING = 1;
	private static final int SAVING = 2;*/

// Welcome training screen
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training);
        setTitle(R.string.mtitle_Training);
//Load application preferences

        SharedPreferences settings = getSharedPreferences("FileSettings", 0);
        int trainingWeek = settings.getInt("TrainingWeek", 1);
        int trainingDay = settings.getInt("TrainingDay", 1);
        int trainingLevel = settings.getInt("TrainingLevel", 0);

        if (trainingWeek < 5) {
            TextView tv1 = (TextView) findViewById(R.id.Trainig1);
            TextView tv2 = (TextView) findViewById(R.id.Trainig2);
            TextView tv3 = (TextView) findViewById(R.id.Trainig3);
            TextView tv4 = (TextView) findViewById(R.id.Trainig4);
            TextView tv5 = (TextView) findViewById(R.id.Trainig5);

            MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
            String[] cPlan = WeekPlan.gettTrainingPlan(this);

            tv1.setText(cPlan[0]);
            tv2.setText(cPlan[1]);
            tv3.setText(cPlan[2]);
            tv4.setText(cPlan[3]);
            tv5.setText("max (" + getText(R.string.TrainingMax) + " " + cPlan[4] + ")");
        } else if (trainingWeek == 5) {
            if (trainingDay == 1) {
                TextView tv1 = (TextView) findViewById(R.id.Trainig1);
                TextView tv2 = (TextView) findViewById(R.id.Trainig2);
                TextView tv3 = (TextView) findViewById(R.id.Trainig3);
                TextView tv4 = (TextView) findViewById(R.id.Trainig4);
                TextView tv5 = (TextView) findViewById(R.id.Trainig5);

                MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
                String[] cPlan = WeekPlan.gettTrainingPlan(this);

                tv1.setText(cPlan[0]);
                tv2.setText(cPlan[1]);
                tv3.setText(cPlan[2]);
                tv4.setText(cPlan[3]);
                tv5.setText("max (" + getText(R.string.TrainingMax) + " " + cPlan[4] + ")");
            } else {
                TextView tv1 = (TextView) findViewById(R.id.Trainig1);
                TextView tv2 = (TextView) findViewById(R.id.Trainig2);
                TextView tv3 = (TextView) findViewById(R.id.Trainig3);
                TextView tv4 = (TextView) findViewById(R.id.Trainig4);
                TextView tv5 = (TextView) findViewById(R.id.Trainig5);
                TextView tv6 = (TextView) findViewById(R.id.Trainig6);
                TextView tv7 = (TextView) findViewById(R.id.Trainig7);

                MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
                String[] cPlan = WeekPlan.gettTrainingPlan(this);

                TableRow rec6 = (TableRow) findViewById(R.id.TTrainig6);
                rec6.setVisibility(View.VISIBLE);
                TableRow rec7 = (TableRow) findViewById(R.id.TTrainig6);
                rec7.setVisibility(View.VISIBLE);

                tv1.setText(cPlan[0]);
                tv2.setText(cPlan[1]);
                tv3.setText(cPlan[2]);
                tv4.setText(cPlan[3]);
                tv5.setText(cPlan[4]);
                tv6.setText(cPlan[5]);
                tv7.setText("max (" + getText(R.string.TrainingMax) + " " + cPlan[6] + ")");
            }
        } else if (trainingWeek == 6) {
            if (trainingDay == 1) {
                TextView tv1 = (TextView) findViewById(R.id.Trainig1);
                TextView tv2 = (TextView) findViewById(R.id.Trainig2);
                TextView tv3 = (TextView) findViewById(R.id.Trainig3);
                TextView tv4 = (TextView) findViewById(R.id.Trainig4);
                TextView tv5 = (TextView) findViewById(R.id.Trainig5);

                MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
                String[] cPlan = WeekPlan.gettTrainingPlan(this);

                tv1.setText(cPlan[0]);
                tv2.setText(cPlan[1]);
                tv3.setText(cPlan[2]);
                tv4.setText(cPlan[3]);
                tv5.setText("max (" + getText(R.string.TrainingMax) + " " + cPlan[4] + ")");
            } else {
                TextView tv1 = (TextView) findViewById(R.id.Trainig1);
                TextView tv2 = (TextView) findViewById(R.id.Trainig2);
                TextView tv3 = (TextView) findViewById(R.id.Trainig3);
                TextView tv4 = (TextView) findViewById(R.id.Trainig4);
                TextView tv5 = (TextView) findViewById(R.id.Trainig5);
                TextView tv6 = (TextView) findViewById(R.id.Trainig6);
                TextView tv7 = (TextView) findViewById(R.id.Trainig7);
                TextView tv8 = (TextView) findViewById(R.id.Trainig8);
                TextView tv9 = (TextView) findViewById(R.id.Trainig9);

                MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
                String[] cPlan = WeekPlan.gettTrainingPlan(this);

                TableRow rec6 = (TableRow) findViewById(R.id.TTrainig6);
                rec6.setVisibility(View.VISIBLE);
                TableRow rec7 = (TableRow) findViewById(R.id.TTrainig6);
                rec7.setVisibility(View.VISIBLE);
                TableRow rec8 = (TableRow) findViewById(R.id.TTrainig6);
                rec8.setVisibility(View.VISIBLE);
                TableRow rec9 = (TableRow) findViewById(R.id.TTrainig6);
                rec9.setVisibility(View.VISIBLE);

                tv1.setText(cPlan[0]);
                tv2.setText(cPlan[1]);
                tv3.setText(cPlan[2]);
                tv4.setText(cPlan[3]);
                tv5.setText(cPlan[4]);
                tv6.setText(cPlan[5]);
                tv7.setText(cPlan[6]);
                tv8.setText(cPlan[7]);
                tv9.setText("max (" + getText(R.string.TrainingMax) + " " + cPlan[8] + ")");
            }
        }


        Button mFirstRunOk = (Button) findViewById(R.id.BeginTraining);
        mFirstRunOk.setOnClickListener(this);
    }


	private void saveResult(){
	final WriteResult wr = new WriteResult(this);
    wr.setTitle(R.string.EndTraining);
    wr.setCancelable(false);
    wr.show();
	}

    // Button Listener	

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.BeginTraining: {
                SharedPreferences settings = getSharedPreferences("FileSettings", 0);
                int trainingWeek = settings.getInt("TrainingWeek", 1);
                int trainingDay = settings.getInt("TrainingDay", 1);
                int trainingLevel = settings.getInt("TrainingLevel", 0);

                MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
                String[] cPlan = WeekPlan.gettTrainingPlan(this);

                TrainingDialog td = new TrainingDialog(this, trainingWeek, trainingDay,/*trainingLevel,*/ cPlan);
                saveResult();
/*    		switch(v.getTop()){
        case TRAINING:
            td.show();
            showDialog(SAVING);
        case SAVING:
            saveResult();
        }*/
                td.show();

                break;
            }
            default:
                break;
        }
    }

}

