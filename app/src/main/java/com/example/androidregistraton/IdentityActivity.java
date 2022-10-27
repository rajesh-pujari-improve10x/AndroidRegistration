package com.example.androidregistraton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        identityActivityToSuccessActivity();
        identityActivityToBankAccountActivity();
    }

    public void identityActivityToSuccessActivity() {
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent identityIntent = new Intent(this, SuccessActivity.class);
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            EditText panNumberTxt = findViewById(R.id.pan_number_txt);
            String panNumber = panNumberTxt.getText().toString();
            EditText aadharNumberTxt = findViewById(R.id.aadhar_number_txt);
            String aadharNumber = aadharNumberTxt.getText().toString();
            identityIntent.putExtras(bundle);
            identityIntent.putExtra("PAN Number", panNumber);
            identityIntent.putExtra("Aadhar Number", aadharNumber);
            startActivity(identityIntent);
        });
    }

    public void identityActivityToBankAccountActivity() {
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}