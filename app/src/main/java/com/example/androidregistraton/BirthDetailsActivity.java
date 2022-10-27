package com.example.androidregistraton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
        birthDetailsActivityToProfessionalActivity();
        birthDetailsActivityToPersonalActivity();
    }

    public void birthDetailsActivityToProfessionalActivity() {
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent birthDetailIntent = new Intent(this, ProfessionalActivity.class);
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            EditText dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
            String dateOfBirth = dateOfBirthTxt.getText().toString();
            EditText placeOfBirthTxt = findViewById(R.id.place_of_birth_txt);
            String placeOfBirth = placeOfBirthTxt.getText().toString();
            birthDetailIntent.putExtras(bundle);
            birthDetailIntent.putExtra("Date Of Birth", dateOfBirth);
            birthDetailIntent.putExtra("Place Of Birth", placeOfBirth);
            startActivity(birthDetailIntent);
        });
    }

    public void birthDetailsActivityToPersonalActivity() {
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}