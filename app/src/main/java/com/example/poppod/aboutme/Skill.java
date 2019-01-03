package com.example.poppod.aboutme;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class Skill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);
        Button back=(Button) findViewById(R.id.back_myskill);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        final Switch sw1= findViewById(R.id.switch_show);
        sw1.setChecked(false);
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                /*TextView skill= findViewById(R.id.skilldetail);
                TextView skill2= findViewById(R.id.skilldetail2);
                TextView skill3= findViewById(R.id.skilldetail3);
                TextView skill4;
                skill4 = findViewById(R.id.skilldetail4);*/
                LinearLayout skill =findViewById(R.id.linearLayout2);

                if(isChecked){
                    /*skill.setVisibility(View.VISIBLE);
                    skill2.setVisibility(View.VISIBLE);
                    skill3.setVisibility(View.VISIBLE);
                    skill4.setVisibility(View.VISIBLE);*/
                    skill.setVisibility(View.VISIBLE);
                }
                else {
                    /*skill.setVisibility(View.INVISIBLE);
                    skill2.setVisibility(View.INVISIBLE);
                    skill3.setVisibility(View.INVISIBLE);
                    skill4.setVisibility(View.INVISIBLE);*/
                    skill.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
