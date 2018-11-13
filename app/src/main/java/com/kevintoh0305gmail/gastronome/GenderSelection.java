package com.kevintoh0305gmail.gastronome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GenderSelection extends AppCompatActivity {
    Button female, male;
    TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_selection);
        female = findViewById(R.id.btnGenderFemale);
        male = findViewById(R.id.btnGenderMale);
        login = findViewById(R.id.tvGenderText2);
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HelloPage.profile.setGender("F");
                startActivity(new Intent(GenderSelection.this, InputAge.class));
            }
        });
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HelloPage.profile.setGender("M");
                startActivity(new Intent(GenderSelection.this, InputAge.class));
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GenderSelection.this, Login.class));
            }
        });
    }
}