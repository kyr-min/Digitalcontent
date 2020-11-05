package com.example.myapplication;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

import static android.content.Context.ALARM_SERVICE;


public class SettingFragment extends Fragment {

    Button ReTimeBtn;
    Button ResetPlanBtn;
    Button DevoleperBtn;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = (ViewGroup) inflater.inflate(R.layout.fragment_setting,container,false);
        ReTimeBtn=v.findViewById(R.id.planReTime);
        DevoleperBtn=v.findViewById(R.id.devolper);

        ReTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerFragment timePickerFragment = new TimePickerFragment();
                timePickerFragment.show(getFragmentManager(), "timePicker");
            }
        });

        DevoleperBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

                builder.setTitle("만든 사람들")
                        .setMessage("개발자 : 민경록 김서윤 이준상\n" +
                                "디자이너 : 이소윤 이지수")
                        .setNegativeButton("취소", null);
                AlertDialog alert=builder.create();
                alert.show();
            }
        });
        return v;
    }
}