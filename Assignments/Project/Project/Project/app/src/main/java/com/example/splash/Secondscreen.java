package com.example.splash;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Secondscreen<v> extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private Button join;
    private Button supply_food;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondcreen);
        join = (Button) findViewById(R.id.join);
        supply_food = (Button) findViewById(R.id.supply_food);
    }

    public void onClickOpenWebPageButton(View v) {
        String urlAsString = "https://aashayeinblog.wordpress.com/programs/sba/orphanages-list-in-hyderabad/";
        openWebPage(urlAsString);
    }

    private void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void onClickOpenLayout(View v) {
        openActivity2();
    }

    private void openActivity2() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
