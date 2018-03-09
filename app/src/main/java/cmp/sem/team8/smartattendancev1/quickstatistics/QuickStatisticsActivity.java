package cmp.sem.team8.smartattendancev1.quickstatistics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cmp.sem.team8.fireapp.R;
import cmp.sem.team8.fireapp.auth.LoginActivity;

public class QuickStatisticsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_statistics);


        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }







}
