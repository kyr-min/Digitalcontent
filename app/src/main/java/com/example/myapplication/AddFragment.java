package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class AddFragment extends Fragment {

    private Button plan_btn;
    public  static  final int REQUEST_CODE_=1000;
    private String plan_str;

    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment_add, null);
        plan_btn=(Button) v.findViewById(R.id.plan_add_btn);

        plan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(v.getContext(), AddActivity.class);
                startActivityForResult(Intent, REQUEST_CODE_);
            }
        });
        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_) {
            if(resultCode==Activity.RESULT_OK) {
                plan_str=data.getStringExtra("plan");

                Log.d(TAG,"onActivity"+plan_str+",");
                Toast.makeText(getActivity(), "저장되었습니다.", Toast.LENGTH_LONG).show();
            }
        }
    }
}

