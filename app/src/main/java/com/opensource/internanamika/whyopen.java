package com.opensource.internanamika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class whyopen extends AppCompatActivity {
    private TextView details;
    private TextView topic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whyopen);
        details = findViewById(R.id.detailss);
        getSupportActionBar().setTitle("OpenSource");
        topic = findViewById(R.id.openn);


        topic.setText("Why Open Source");
        details.setText("Traditionally, due to the fact that open source software companies revenue exclusively from support and maintenance, they usually do not have money to compete with proprietary software creators in terms of marketing. And thus, the richer companies usually win the battle" +
                " for the potential user.");


    }
}
