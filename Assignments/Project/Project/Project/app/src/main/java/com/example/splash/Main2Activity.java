package com.example.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView join_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        join_list = (TextView) findViewById(R.id.join_list);
        String[] arr = OrphanageList.getOrphanageList();
        for (String a : arr) {
            join_list.append(a+"\n\n\n");
        }
    }

}
