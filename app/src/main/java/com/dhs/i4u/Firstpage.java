package com.dhs.i4u;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Firstpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        Button Instructbtn= (Button) findViewById(R.id.Instructbtn);
        Instructbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Firstpage.this, Instructs.class);
                startActivity(intent);
            }
        });

        Button Skipbtn = (Button) findViewById(R.id.Skipbtn);
        Skipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Firstpage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
