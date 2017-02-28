package com.example.gio.lessnote.activities;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.gio.lessnote.R;
import com.example.gio.lessnote.application.LessNoteApplication;
import com.example.gio.lessnote.helpers.Connections;

public class SaturdayActivity extends AppCompatActivity {

    //=========================================================================
    //les1
    final int DIALOG_ID_1 = 1;
    final String SAT_HOUR_1 = "sat hour 1";
    final String SAT_MINUTE_1 = "sat minute 1";
    int hours1, minutes1;
    private TextView tv_time_1;
    final String SAT_LESS_1 = "sat less 1";

    //les2
    final int DIALOG_ID_2 = 2;
    final String SAT_HOUR_2 = "sat hour 2";
    final String SAT_MINUTE_2 = "sat minute 2";
    int hours2, minutes2;
    private TextView tv_time_2;
    final String SAT_LESS_2 = "sat less 2";

    //les3
    final int DIALOG_ID_3 = 3;
    final String SAT_HOUR_3 = "sat hour 3";
    final String SAT_MINUTE_3 = "sat minute 3";
    int hours3, minutes3;
    private TextView tv_time_3;
    final String SAT_LESS_3 = "sat less 3";

    //les4
    final int DIALOG_ID_4 = 4;
    final String SAT_HOUR_4 = "sat hour 4";
    final String SAT_MINUTE_4 = "sat minute 4";
    int hours4, minutes4;
    private TextView tv_time_4;
    final String SAT_LESS_4 = "sat less 4";

    //les5
    final int DIALOG_ID_5 = 5;
    final String SAT_HOUR_5 = "sat hour 5";
    final String SAT_MINUTE_5 = "sat minute 5";
    int hours5, minutes5;
    private TextView tv_time_5;
    final String SAT_LESS_5 = "sat less 5";

    //les6
    final int DIALOG_ID_6 = 6;
    final String SAT_HOUR_6 = "sat hour 6";
    final String SAT_MINUTE_6 = "sat minute 6";
    int hours6, minutes6;
    private TextView tv_time_6;
    final String SAT_LESS_6 = "sat less 6";

    //les7
    final int DIALOG_ID_7 = 7;
    final String SAT_HOUR_7 = "sat hour 7";
    final String SAT_MINUTE_7 = "sat minute 7";
    int hours7, minutes7;
    private TextView tv_time_7;
    final String SAT_LESS_7 = "sat less 7";

    int[] hours = new int[7];
    int[] minutes = new int[7];

    private EditText et_les_1;
    private EditText et_les_2;
    private EditText et_les_3;
    private EditText et_les_4;
    private EditText et_les_5;
    private EditText et_les_6;
    private EditText et_les_7;

    private EditText [] edittexts = new EditText[7];


//=========================================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday);
        initView();
        Connections.fillLessonHints(edittexts);

        hours[0] = hours1;
        hours[1] = hours2;
        hours[2] = hours3;
        hours[3] = hours4;
        hours[4] = hours5;
        hours[5] = hours6;
        hours[6] = hours7;

        minutes[0] = minutes1;
        minutes[1] = minutes2;
        minutes[2] = minutes3;
        minutes[3] = minutes4;
        minutes[4] = minutes5;
        minutes[5] = minutes6;
        minutes[6] = minutes7;

    }

    //=========================================================================

    private void initView() {
        tv_time_1 = (TextView) findViewById(R.id.tv_time_1);
        tv_time_2 = (TextView) findViewById(R.id.tv_time_2);
        tv_time_3 = (TextView) findViewById(R.id.tv_time_3);
        tv_time_4 = (TextView) findViewById(R.id.tv_time_4);
        tv_time_5 = (TextView) findViewById(R.id.tv_time_5);
        tv_time_6 = (TextView) findViewById(R.id.tv_time_6);
        tv_time_7 = (TextView) findViewById(R.id.tv_time_7);

        if (!(LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_1) == 0 && LessNoteApplication
                .getInstce().getSharedInt(SAT_MINUTE_1) == 0)) {
            Connections.setTvTime(tv_time_1, LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_1), LessNoteApplication
                    .getInstce().getSharedInt(SAT_MINUTE_1));
        }

        if (!(LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_2) == 0 && LessNoteApplication
                .getInstce().getSharedInt(SAT_MINUTE_2) == 0)) {
            Connections.setTvTime(tv_time_2, LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_2), LessNoteApplication
                    .getInstce().getSharedInt(SAT_MINUTE_2));
        }

        if (!(LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_3) == 0 && LessNoteApplication
                .getInstce().getSharedInt(SAT_MINUTE_3) == 0)) {
            Connections.setTvTime(tv_time_3, LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_3), LessNoteApplication
                    .getInstce().getSharedInt(SAT_MINUTE_3));
        }

        if (!(LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_4) == 0 && LessNoteApplication
                .getInstce().getSharedInt(SAT_MINUTE_4) == 0)) {
            Connections.setTvTime(tv_time_4, LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_4), LessNoteApplication
                    .getInstce().getSharedInt(SAT_MINUTE_4));
        }

        if (!(LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_5) == 0 && LessNoteApplication
                .getInstce().getSharedInt(SAT_MINUTE_5) == 0)) {
            Connections.setTvTime(tv_time_5, LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_5), LessNoteApplication
                    .getInstce().getSharedInt(SAT_MINUTE_5));
        }

        if (!(LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_6) == 0 && LessNoteApplication
                .getInstce().getSharedInt(SAT_MINUTE_6) == 0)) {
            Connections.setTvTime(tv_time_6, LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_6), LessNoteApplication
                    .getInstce().getSharedInt(SAT_MINUTE_6));
        }

        if (!(LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_7) == 0 && LessNoteApplication
                .getInstce().getSharedInt(SAT_MINUTE_7) == 0)) {
            Connections.setTvTime(tv_time_7, LessNoteApplication.getInstce().getSharedInt(SAT_HOUR_7), LessNoteApplication
                    .getInstce().getSharedInt(SAT_MINUTE_7));
        }

        et_les_1 = (EditText) findViewById(R.id.et_les_1);
        et_les_1.setText(LessNoteApplication.getInstce().getSharedString(SAT_LESS_1));
        et_les_2 = (EditText) findViewById(R.id.et_les_2);
        et_les_2.setText(LessNoteApplication.getInstce().getSharedString(SAT_LESS_2));
        et_les_3 = (EditText) findViewById(R.id.et_les_3);
        et_les_3.setText(LessNoteApplication.getInstce().getSharedString(SAT_LESS_3));
        et_les_4 = (EditText) findViewById(R.id.et_les_4);
        et_les_4.setText(LessNoteApplication.getInstce().getSharedString(SAT_LESS_4));
        et_les_5 = (EditText) findViewById(R.id.et_les_5);
        et_les_5.setText(LessNoteApplication.getInstce().getSharedString(SAT_LESS_5));
        et_les_6 = (EditText) findViewById(R.id.et_les_6);
        et_les_6.setText(LessNoteApplication.getInstce().getSharedString(SAT_LESS_6));
        et_les_7 = (EditText) findViewById(R.id.et_les_7);
        et_les_7.setText(LessNoteApplication.getInstce().getSharedString(SAT_LESS_7));

        edittexts [0] = et_les_1;
        edittexts [1] = et_les_2;
        edittexts [2] = et_les_3;
        edittexts [3] = et_les_4;
        edittexts [4] = et_les_5;
        edittexts [5] = et_les_6;
        edittexts [6] = et_les_7;
    }

    @Override
    public void onBackPressed() {
        LessNoteApplication.getInstce().setSharedString(SAT_LESS_1, et_les_1.getText().toString());
        LessNoteApplication.getInstce().setSharedString(SAT_LESS_2, et_les_2.getText().toString());
        LessNoteApplication.getInstce().setSharedString(SAT_LESS_3, et_les_3.getText().toString());
        LessNoteApplication.getInstce().setSharedString(SAT_LESS_4, et_les_4.getText().toString());
        LessNoteApplication.getInstce().setSharedString(SAT_LESS_5, et_les_5.getText().toString());
        LessNoteApplication.getInstce().setSharedString(SAT_LESS_6, et_les_6.getText().toString());
        LessNoteApplication.getInstce().setSharedString(SAT_LESS_7, et_les_7.getText().toString());
        super.onBackPressed();
    }

    //=========================================================================

    //=========================================================================

    public void timeDialog(View view) {
        switch (view.getId()) {
            case R.id.tv_time_1:
                showDialog(DIALOG_ID_1);
                break;
            case R.id.tv_time_2:
                showDialog(DIALOG_ID_2);
                break;
            case R.id.tv_time_3:
                showDialog(DIALOG_ID_3);
                break;
            case R.id.tv_time_4:
                showDialog(DIALOG_ID_4);
                break;
            case R.id.tv_time_5:
                showDialog(DIALOG_ID_5);
                break;
            case R.id.tv_time_6:
                showDialog(DIALOG_ID_6);
                break;
            case R.id.tv_time_7:
                showDialog(DIALOG_ID_7);
                break;
        }

    }


    @Override
    protected Dialog onCreateDialog(int id) {

        if (id == DIALOG_ID_1) {
            return new TimePickerDialog(SaturdayActivity.this, timePickerListener1, hours1, minutes1, false);
        } else if (id == DIALOG_ID_2) {
            return new TimePickerDialog(SaturdayActivity.this, timePickerListener2, hours2, minutes2, false);
        } else if (id == DIALOG_ID_3) {
            return new TimePickerDialog(SaturdayActivity.this, timePickerListener3, hours3, minutes3, false);
        } else if (id == DIALOG_ID_4) {
            return new TimePickerDialog(SaturdayActivity.this, timePickerListener4, hours4, minutes4, false);
        } else if (id == DIALOG_ID_5) {
            return new TimePickerDialog(SaturdayActivity.this, timePickerListener5, hours5, minutes5, false);
        } else if (id == DIALOG_ID_6) {
            return new TimePickerDialog(SaturdayActivity.this, timePickerListener6, hours6, minutes6, false);
        } else if (id == DIALOG_ID_7) {
            return new TimePickerDialog(SaturdayActivity.this, timePickerListener7, hours7, minutes7, false);
        }
        return null;
    }

    //=========================================================================

    //=========================================================================

//    protected TimePickerDialog.OnTimeSetListener monTimePickerListener (final int index, final String TUE_HOUR, final String TUE_MINUTE, final TextView textView){
//        return new TimePickerDialog.OnTimeSetListener(){
//            @Override
//            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//                hours[index-1] = hourOfDay;
//                minutes[index-1] = minute;
//
//                LessNoteApplication.getInstce().setSharedInt(TUE_HOUR, hourOfDay);
//                LessNoteApplication.getInstce().setSharedInt(TUE_MINUTE, minute);
//
//                Connections.setTvTime(textView, hourOfDay, minute);
//
//            }
//        };
//    }

    protected TimePickerDialog.OnTimeSetListener timePickerListener1 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            hours1 = hourOfDay;
            minutes1 = minute;

            LessNoteApplication.getInstce().setSharedInt(SAT_HOUR_1, hours1);
            LessNoteApplication.getInstce().setSharedInt(SAT_MINUTE_1, minutes1);

            Connections.setTvTime(tv_time_1, hours1, minutes1);
        }
    };

    protected TimePickerDialog.OnTimeSetListener timePickerListener2 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            hours2 = hourOfDay;
            minutes2 = minute;

            LessNoteApplication.getInstce().setSharedInt(SAT_HOUR_2, hours2);
            LessNoteApplication.getInstce().setSharedInt(SAT_MINUTE_2, minutes2);

            Connections.setTvTime(tv_time_2, hours2, minutes2);
        }
    };

    protected TimePickerDialog.OnTimeSetListener timePickerListener3 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            hours3 = hourOfDay;
            minutes3 = minute;

            LessNoteApplication.getInstce().setSharedInt(SAT_HOUR_3, hours3);
            LessNoteApplication.getInstce().setSharedInt(SAT_MINUTE_3, minutes3);

            Connections.setTvTime(tv_time_3, hours3, minutes3);
        }
    };

    protected TimePickerDialog.OnTimeSetListener timePickerListener4 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            hours4 = hourOfDay;
            minutes4 = minute;

            LessNoteApplication.getInstce().setSharedInt(SAT_HOUR_4, hours4);
            LessNoteApplication.getInstce().setSharedInt(SAT_MINUTE_4, minutes4);

            Connections.setTvTime(tv_time_4, hours4, minutes4);
        }
    };

    protected TimePickerDialog.OnTimeSetListener timePickerListener5 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            hours5 = hourOfDay;
            minutes5 = minute;

            LessNoteApplication.getInstce().setSharedInt(SAT_HOUR_5, hours5);
            LessNoteApplication.getInstce().setSharedInt(SAT_MINUTE_5, minutes5);

            Connections.setTvTime(tv_time_5, hours5, minutes5);
        }
    };

    protected TimePickerDialog.OnTimeSetListener timePickerListener6 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            hours6 = hourOfDay;
            minutes6 = minute;

            LessNoteApplication.getInstce().setSharedInt(SAT_HOUR_6, hours6);
            LessNoteApplication.getInstce().setSharedInt(SAT_MINUTE_6, minutes6);

            Connections.setTvTime(tv_time_6, hours6, minutes6);
        }
    };

    protected TimePickerDialog.OnTimeSetListener timePickerListener7 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            hours7 = hourOfDay;
            minutes7 = minute;

            LessNoteApplication.getInstce().setSharedInt(SAT_HOUR_7, hourOfDay);
            LessNoteApplication.getInstce().setSharedInt(SAT_MINUTE_7, minutes7);

            Connections.setTvTime(tv_time_7, hourOfDay, minutes7);
        }
    };

    //=========================================================================

    public void finish(View v){
        onBackPressed();
    }


    //=========================================================================


}
