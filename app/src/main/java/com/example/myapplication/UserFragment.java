package com.example.myapplication;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class UserFragment extends Fragment {
    ImageView checkDay1;
    ImageView checkDay2;
    ImageView checkDay3;
    ImageView checkDay4;
    ImageView checkDay5;
    ImageView checkDay6;
    ImageView checkDay7;
    ImageView changeBackground1;
    ImageView changeBackground2;
    ImageView changeBackground3;
    ImageView changeBackground4;
    ImageView changeBackground5;

    private int count = 0;
    private int Complete = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = (ViewGroup) inflater.inflate(R.layout.fragment_user, container, false);
        checkDay1 = (ImageView) v.findViewById(R.id.check_1);
        checkDay2 = (ImageView) v.findViewById(R.id.check_2);
        checkDay3 = (ImageView) v.findViewById(R.id.check_3);
        checkDay4 = (ImageView) v.findViewById(R.id.check_4);
        checkDay5 = (ImageView) v.findViewById(R.id.check_5);
        checkDay6 = (ImageView) v.findViewById(R.id.check_6);
        checkDay7 = (ImageView) v.findViewById(R.id.check_7);
        changeBackground1 = (ImageView) v.findViewById(R.id.changeBackground1);
        changeBackground2 = (ImageView) v.findViewById(R.id.changeBackground2);
        changeBackground3 = (ImageView) v.findViewById(R.id.changeBackground3);
        changeBackground4 = (ImageView) v.findViewById(R.id.changeBackground4);
        changeBackground5 = (ImageView) v.findViewById(R.id.changeBackground5);


        return inflater.inflate(R.layout.fragment_user, container, false);
    }

    public void getArguments(Bundle bundle) {
        Complete = getArguments().getInt("Int");
        count += Complete;

        switch (count) {
            case 1: {
                checkDay1.setVisibility(View.VISIBLE);
                changeBackground2.setVisibility(View.VISIBLE);
                break;
            }
            case 2: {
                checkDay2.setVisibility(View.VISIBLE);
                changeBackground3.setVisibility(View.VISIBLE);
                break;
            }
            case 3: {
                checkDay3.setVisibility(View.VISIBLE);
                break;
            }
            case 4: {
                checkDay4.setVisibility(View.VISIBLE);
                changeBackground4.setVisibility(View.VISIBLE);
                break;
            }
            case 5: {
                checkDay5.setVisibility(View.VISIBLE);
                break;
            }
            case 6: {
                checkDay6.setVisibility(View.VISIBLE);
                break;
            }
            case 7: {
                checkDay7.setVisibility(View.VISIBLE);
                changeBackground5.setVisibility(View.VISIBLE);;
                break;
            }
        }
    }
}