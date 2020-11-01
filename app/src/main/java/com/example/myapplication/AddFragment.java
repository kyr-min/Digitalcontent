package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
    public  static  final int REQUEST_CODE_=1000;
    private String plan_str;
    private TextView PlanTextView;
    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {

        Bundle bundle=getArguments();
        if(bundle!=null){
            String data1=bundle.getString("planText");
            Log.d(TAG, data1);
            //Toast.makeText(this, "저장되었습니다", Toast.LENGTH_SHORT).show();
        }
        else{
            //Toast.makeText(this, "취소되었습니다.", Toast.LENGTH_SHORT).show();
        }

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = (ViewGroup) inflater.inflate(R.layout.fragment_add,container,false);
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
}

