package com.example.myapplication;

import androidx.annotation.NonNull;

public class Memo {
    private String plan_add;

    public  Memo(String plan){
        this.plan_add=plan;
    }

    public void getPlan_add(String plan_add){
        this.plan_add = plan_add;
    }

    public String getTitle(){
        return plan_add;
    }


    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
