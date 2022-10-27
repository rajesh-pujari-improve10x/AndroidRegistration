package com.example.androidregistraton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
        bankAccountActivityToSuccessfulActivity();
        bankAccountActivityToProfessionalActivity();
    }

    public void bankAccountActivityToSuccessfulActivity() {
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent bankAccountIntent = new Intent(this, CreditCardDetailsActivity.class);
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            /*String email = intent.getStringExtra("Email");
            String password = intent.getStringExtra("Password");
            String confirmPassword = intent.getStringExtra("Confirm Password");
            String userName = intent.getStringExtra("User Name");
            String firstName = intent.getStringExtra("First Name");
            String lastName = intent.getStringExtra("Last Name");
            String currentCompany = intent.getStringExtra("Current Company");
            String totalExperience = intent.getStringExtra("Total Experience");
            String designation = intent.getStringExtra("Designation");*/
            EditText bankNameTxt = findViewById(R.id.bank_name_txt);
            String bankName = bankNameTxt.getText().toString();
            EditText accountHolderNameTxt = findViewById(R.id.account_holder_name_txt);
            String accountHolderName = accountHolderNameTxt.getText().toString();
            EditText accountNumberTxt = findViewById(R.id.account_number_txt);
            String accountNumber = accountNumberTxt.getText().toString();
            EditText ifscCodeTxt = findViewById(R.id.ifsc_code_txt);
            String ifscCode = ifscCodeTxt.getText().toString();
           /* bankAccountIntent.putExtra("Email", email);
            bankAccountIntent.putExtra("Password", password);
            bankAccountIntent.putExtra("Confirm Password", confirmPassword);
            bankAccountIntent.putExtra("User Name", userName);
            bankAccountIntent.putExtra("First Name", firstName);
            bankAccountIntent.putExtra("Last Name", lastName);
            bankAccountIntent.putExtra("Current Company", currentCompany);
            bankAccountIntent.putExtra("Total Experience", totalExperience);
            bankAccountIntent.putExtra("Designation", designation);*/
            bankAccountIntent.putExtras(bundle);
            bankAccountIntent.putExtra("Bank Name", bankName);
            bankAccountIntent.putExtra("Account Holder Name", accountHolderName);
            bankAccountIntent.putExtra("Account Number", accountNumber);
            bankAccountIntent.putExtra("IFSC Code", ifscCode);
            startActivity(bankAccountIntent);
        });
    }

    public void  bankAccountActivityToProfessionalActivity() {
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}