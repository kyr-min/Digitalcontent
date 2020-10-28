package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm = getSupportFragmentManager();
    private AddFragment addFragment = new AddFragment();
    private UserFragment userFragment = new UserFragment();
    private SettingFragment settingFragment = new SettingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragment,addFragment).commitAllowingStateLoss();
        bottomNavigationView=findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.firs:{
                        FragmentTransaction transaction = fm.beginTransaction();
                        transaction.replace(R.id.fragment,addFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.second:{
                        FragmentTransaction transaction = fm.beginTransaction();
                        transaction.replace(R.id.fragment,userFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.third:{
                        FragmentTransaction transaction = fm.beginTransaction();
                        transaction.replace(R.id.fragment,settingFragment).commitAllowingStateLoss();
                        break;
                    }
                }
                return true;
            }
        });
    }
}