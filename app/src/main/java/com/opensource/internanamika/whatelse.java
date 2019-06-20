package com.opensource.internanamika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class whatelse extends AppCompatActivity {
    private TextView details;
    private TextView topic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatelse);
        getSupportActionBar().setTitle("OpenSource");
        details = findViewById(R.id.detailsssss);
        topic = findViewById(R.id.opennnnn);


        topic.setText("What Else in open source");
        details.setText("Open source is a term denoting that a product includes permission to use its source code, design documents, or content. It most commonly refers to the open-source model, in which open-source software or other products are released under an open-source license as part of the open-source-software movement. Use of the term originated with software, but has expanded beyond the software sector to cover other open content and forms of open collaboration.");


    }
}
