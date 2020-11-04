package com.example.myapplication;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

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
    TimePicker TimePicker;


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

        View v = (ViewGroup) inflater.inflate(R.layout.fragment_setting,container,false);
        ReTimeBtn=v.findViewById(R.id.planReTime);
        ResetPlanBtn=v.findViewById(R.id.planReset);
        DevoleperBtn=v.findViewById(R.id.devolper);
        TimePicker=v.findViewById(R.id.TimePicker);


        ReTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePicker.setVisibility(View.VISIBLE);
                ReTimeBtn.setVisibility(View.INVISIBLE);
                DevoleperBtn.setVisibility(View.INVISIBLE);
                ResetPlanBtn.setVisibility(View.INVISIBLE);
                
            }
        });


        ResetPlanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReTimeBtn.setText("시간 재설정");
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

//    public void testAlarm() {
//        Intent intent = new Intent(getContext(), AlarmReceiver.class);
//        PendingIntent sender = PendingIntent.getBroadcast(getContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
//        AlarmManager am = (AlarmManager) ContextCompat.getSystemService(getContext());
//        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){
//            am.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+1000, sender);
//        } else{
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//                am.setExact(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+1000, sender);
//            }
//        }
//    }
}