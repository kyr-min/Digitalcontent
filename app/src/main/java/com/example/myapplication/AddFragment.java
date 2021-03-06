package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static android.app.Activity.RESULT_OK;
import static android.content.ContentValues.TAG;

public class AddFragment extends Fragment {

    private Button plan_btn;
    private TextView PlanTextView;
    private EditText AddPlan;
    private Button CheckBtn;
    public String s="아직 목표가 입력되지않았습니다.";
    private InputMethodManager imm;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = (ViewGroup) inflater.inflate(R.layout.fragment_add,container,false);
        plan_btn=(Button) v.findViewById(R.id.plan_add_btn);
        PlanTextView=(TextView) v.findViewById(R.id.planText);
        AddPlan=(EditText) v.findViewById(R.id.PlanAdd);
        CheckBtn=(Button) v.findViewById(R.id.CheckBtn);


        plan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBtn.setVisibility(View.VISIBLE);
                AddPlan.setVisibility(View.VISIBLE);
                PlanTextView.setVisibility(View.INVISIBLE);
                plan_btn.setVisibility(View.INVISIBLE);
            }
        });

        CheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=AddPlan.getText().toString();
                PlanTextView.setText(s);
                CheckBtn.setVisibility(View.INVISIBLE);
                AddPlan.setVisibility(View.INVISIBLE);
                PlanTextView.setVisibility(View.VISIBLE);
                plan_btn.setVisibility(View.VISIBLE);
                Toast.makeText(getContext(), "목표 : "+s, Toast.LENGTH_SHORT).show();
            }
        });
        PlanTextView.setText(s);
        return v;
    }


}