package com.example.androidregistraton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
        creditCardDetailsActivityToIdentityActivity();
        creditCardDetailsActivityToBankAccountActivity();
    }

    public void creditCardDetailsActivityToIdentityActivity() {
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent creditCardDetailsIntent = new Intent(this, IdentityActivity.class);
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            EditText cardNumberTxt = findViewById(R.id.card_number_txt);
            String cardNumber = cardNumberTxt.getText().toString();
            EditText cardHolderTxt = findViewById(R.id.card_holder_txt);
            String cardHolder = cardHolderTxt.getText().toString();
            EditText expiryTxt = findViewById(R.id.expiry_txt);
            String expiry = expiryTxt.getText().toString();
            EditText cvvTxt = findViewById(R.id.cvv_txt);
            String cvv = cvvTxt.getText().toString();
            creditCardDetailsIntent.putExtras(bundle);
            creditCardDetailsIntent.putExtra("Card Number", cardNumber);
            creditCardDetailsIntent.putExtra("Card Holder", cardHolder);
            creditCardDetailsIntent.putExtra("Expiry", expiry);
            creditCardDetailsIntent.putExtra("CVV", cvv);
            startActivity(creditCardDetailsIntent);
        });
    }

    public void creditCardDetailsActivityToBankAccountActivity() {
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });

    }
}