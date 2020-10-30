package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    private EditText plan_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.meno_plan, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        plan_edit=(EditText)findViewById(R.id.add_plan);
        switch (item.getItemId()){
            case R.id.action_btn :{
                String plan=plan_edit.getText().toString();
                Intent intent = new Intent(getApplicationContext(), AddFragment.class);
                intent.putExtra("plan", plan);

                setResult(RESULT_OK, intent);
                return true;
            }
            case R.id.cancel_btn :{
                setResult(RESULT_CANCELED);
                finish();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}