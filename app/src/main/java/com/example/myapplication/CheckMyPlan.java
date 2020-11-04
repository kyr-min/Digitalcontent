package com.example.myapplication;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CheckMyPlan extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton CheckYes, CheckNo;
    private Button button;
    private int result;

    UserFragment userFragment = new UserFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_my_plan);

        radioGroup=(RadioGroup)findViewById(R.id.RadioGroup);
        CheckYes= (RadioButton) findViewById(R.id.CheckYes);
        CheckNo= (RadioButton) findViewById(R.id.CheckNo);
        button=(Button)findViewById(R.id.CheckBtn);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup,@IdRes int i) {
                if(i==R.id.CheckYes){
                    result=1;
                }
                else{
                    result=0;
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putInt("Int", result);
                userFragment.getArguments(bundle);
            }
        });
    }
}