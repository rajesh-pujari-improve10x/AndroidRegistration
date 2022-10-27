package com.example.androidregistraton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional);
        professionalActivityToBankAccountActivity();
        professionalActivityToPersonalActivity();
    }

    public void professionalActivityToBankAccountActivity() {
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view ->  {
            Intent professionalIntent = new Intent(this, BankAccountActivity.class);
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            /*String email = intent.getStringExtra("Email");
            String password = intent.getStringExtra("Password");
            String confirmPassword = intent.getStringExtra("Confirm Password");
            String userName = intent.getStringExtra("User Name");
            String firstName = intent.getStringExtra("First Name");
            String lastName = intent.getStringExtra("Last Name");*/
            EditText currentCompanyTxt = findViewById(R.id.current_company_txt);
            String currentCompany = currentCompanyTxt.getText().toString();
            EditText totalExperienceTxt = findViewById(R.id.total_experience_txt);
            String totalExperience = totalExperienceTxt.getText().toString();
            EditText designationTxt = findViewById(R.id.designation_txt);
            String designation = designationTxt.getText().toString();
            /*professionalIntent.putExtra("Email", email);
            professionalIntent.putExtra("Password", password);
            professionalIntent.putExtra("Confirm Password", confirmPassword);
            professionalIntent.putExtra("User Name", userName);
            professionalIntent.putExtra("First Name", firstName);
            professionalIntent.putExtra("Last Name", lastName);*/
            professionalIntent.putExtras(bundle);
            professionalIntent.putExtra("Current Company", currentCompany);
            professionalIntent.putExtra("Total Experience", totalExperience);
            professionalIntent.putExtra("Designation", designation);
            startActivity(professionalIntent);
        });
    }

    public void professionalActivityToPersonalActivity() {
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}