package com.example.androidregistraton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        personalActivityToProfessionalActivity();
        personalActivityToSignupActivity();
    }

    public void personalActivityToProfessionalActivity() {
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            //String email = intent.getStringExtra("Email");
            //String password = intent.getStringExtra("Password");
            //String confirmPassword = intent.getStringExtra("Confirm Password");
            Intent personalIntent = new Intent(this, AddressActivity.class);
            EditText userNameTxt = findViewById(R.id.user_name_txt);
            String userName = userNameTxt.getText().toString();
            EditText firstNameTxt = findViewById(R.id.first_name_txt);
            String firstName = firstNameTxt.getText().toString();
            EditText lastNameTxt = findViewById(R.id.last_name_txt);
            String lastName = lastNameTxt.getText().toString();
            //personalIntent.putExtra("Email", email);
            //personalIntent.putExtra("Password", password);
            //personalIntent.putExtra("Confirm Password", confirmPassword);
            personalIntent.putExtras(bundle);
            personalIntent.putExtra("User Name", userName);
            personalIntent.putExtra("First Name", firstName);
            personalIntent.putExtra("Last Name", lastName);
            startActivity(personalIntent);
        });
    }

    public  void personalActivityToSignupActivity() {
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}