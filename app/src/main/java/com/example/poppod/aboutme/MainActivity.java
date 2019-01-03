package com.example.poppod.aboutme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button exit=(Button) findViewById(R.id.btn_exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }



    public void show_about(View view) {
        Intent info=new Intent(getApplicationContext(),About.class);
        startActivity(info);
    }

    public void show_skill(View view) {
        Intent i =new Intent(getApplicationContext(),Skill.class);
        startActivity(i);
    }
}
