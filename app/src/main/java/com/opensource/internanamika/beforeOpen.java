package com.opensource.internanamika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class beforeOpen extends AppCompatActivity {
    private TextView details;
    private TextView topic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("OpenSource");
        setContentView(R.layout.activity_before_open);
        details = findViewById(R.id.detailssss);
        topic = findViewById(R.id.opennnn);


        topic.setText("Things you should know before Starting OpenSource Development");
        details.setText("For most beginners, Github may simply be a platform to upload code, but its simply much more than that. It can easily be used as a collaboration platform among coders, and can be used to build complex systems. For a beginner, its recommended to start learning the programming syntax first.");


    }
}
