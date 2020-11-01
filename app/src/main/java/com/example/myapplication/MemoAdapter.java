package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MemoAdapter extends BaseAdapter {
    private final List<Memo> NewMemoList;

    public MemoAdapter(List<Memo> memoList) {
        NewMemoList = memoList;
    }

    @Override
    public int getCount() {
        return NewMemoList.size();
    }

    @Override
    public Object getItem(int i) {
        return NewMemoList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        RecyclerView.ViewHolder viewHolder;
//        if(view == null){
//            viewHolder = new RecyclerView.ViewHolder;
//            view = LayoutInflater.from(viewGroup).inflate(R.layout.plan_item, parent)
//        }
        return null;
    }
}
