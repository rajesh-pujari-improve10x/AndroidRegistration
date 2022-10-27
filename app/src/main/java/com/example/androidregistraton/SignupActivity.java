package com.example.androidregistraton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signupActivityToPersonalActivity();
    }

    public void signupActivityToPersonalActivity() {
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, PersonalActivity.class);
            EditText emailTxt = findViewById(R.id.email_txt);
            String email = emailTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.password_txt);
            String password = passwordTxt.getText().toString();
            EditText confirmPasswordTxt = findViewById(R.id.confirm_password_txt);
            String confirmPassword = confirmPasswordTxt.getText().toString();
            intent.putExtra("Email", email);
            intent.putExtra("Password", password);
            intent.putExtra("Confirm Password", confirmPassword);
            startActivity(intent);
        });
    }
}