package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AddFragment extends Fragment {

    private Button plan_btn;

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
                startActivity(Intent);
            }
        });
        return v;
    }
}

