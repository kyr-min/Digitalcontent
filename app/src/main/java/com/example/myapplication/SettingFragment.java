package com.example.myapplication;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SettingFragment extends Fragment {

    Button ReTimeBtn;
    Button ResetPlanBtn;
    Button DevoleperBtn;


    public SettingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = (ViewGroup) inflater.inflate(R.layout.fragment_add,container,false);
        ReTimeBtn=v.findViewById(R.id.planReTime);
        ResetPlanBtn=v.findViewById(R.id.planReset);
        DevoleperBtn=v.findViewById(R.id.devolper);

        ReTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

//        ReTimeBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//
//
//        ResetPlanBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ReTimeBtn.setText("시간 재설정");
//            }
//        });
//
//        devoleperBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
        return v;
    }

    public  void showAlarmDialog(View view){
        TimePickerFragment timePickerFragment = new TimePickerFragment();
        timePickerFragment.show(getFragmentManager(),"timePicker");
    }
}