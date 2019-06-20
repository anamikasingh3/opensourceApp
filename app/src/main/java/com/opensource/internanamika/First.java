package com.opensource.internanamika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class First extends AppCompatActivity {
private Button aboutopensource;
private Button whyopen;
private Button whatelse;
private Button development;
private Button internships;
    private Button beforeInternship;
    private Toolbar mainToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        View view= getLayoutInflater().inflate(R.layout.activity_first,mainToolbar,true);
        getSupportActionBar().setTitle("OpenSource");
        aboutopensource=findViewById(R.id.button);
        whyopen=findViewById(R.id.button2);
        whatelse=findViewById(R.id.button3);
        development=findViewById(R.id.button4);
        internships=findViewById(R.id.button5);
        beforeInternship=findViewById(R.id.button7);
      beforeInternship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(First.this,beforeOpen.class);
                intent.putExtra("no",6);
                startActivity(intent);
            }
        });
        internships.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(First.this,Internships.class);
                intent.putExtra("no",5);
                startActivity(intent);
            }
        });
       development.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(First.this,Development.class);
                intent.putExtra("no",4);
                startActivity(intent);
            }
        });
        whatelse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(First.this,whatelse.class);
                intent.putExtra("no",3);
                startActivity(intent);
            }
        });
whyopen.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(First.this,whyopen.class);
        intent.putExtra("no",2);
        startActivity(intent);
    }
});
        aboutopensource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(First.this,Aboutopensource.class);
                intent.putExtra("no",1);
                startActivity(intent);
            }
        });
    }
}
