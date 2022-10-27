package com.example.androidregistraton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        showSuccessfulActivity();
    }

    public void showSuccessfulActivity() {
        Intent intent = getIntent();
        String email = intent.getStringExtra("Email");
        String password = intent.getStringExtra("Password");
        String confirmPassword = intent.getStringExtra("Confirm Password");
        String userName = intent.getStringExtra("User Name");
        String firstName = intent.getStringExtra("First Name");
        String lastName = intent.getStringExtra("Last Name");
        String hNoApartment = intent.getStringExtra("H.No/Apartment");
        String street = intent.getStringExtra("Street");
        String city = intent.getStringExtra("City");
        String state = intent.getStringExtra("State");
        String country = intent.getStringExtra("Country");
        String dateOfBirth = intent.getStringExtra("Date Of Birth");
        String placeOfBirth = intent.getStringExtra("Place Of Birth");
        String currentCompany = intent.getStringExtra("Current Company");
        String totalExperience = intent.getStringExtra("Total Experience");
        String designation = intent.getStringExtra("Designation");
        String bankName = intent.getStringExtra("Bank Name");
        String accountHolderName = intent.getStringExtra("Account Holder Name");
        String accountNumber = intent.getStringExtra("Account Number");
        String cardNumber = intent.getStringExtra("Card Number");
        String cardHolder = intent.getStringExtra("Card Holder");
        String expiry = intent.getStringExtra("Expiry");
        String cvv = intent.getStringExtra("CVV");
        String ifscCode = intent.getStringExtra("IFSC Code");
        String panNumber = intent.getStringExtra("PAN Number");
        String aadharNumber = intent.getStringExtra("Aadhar Number");
        TextView emailIdTxt = findViewById(R.id.email_id_txt);
        emailIdTxt.setText(email);
        TextView usernameTxt = findViewById(R.id.username_txt);
        usernameTxt.setText(userName);
        TextView firstnameTxt = findViewById(R.id.firstname_txt);
        firstnameTxt.setText(firstName);
        TextView lastnameTxt = findViewById(R.id.lastname_txt);
        lastnameTxt.setText(lastName);
        TextView dateOfBirthTxt = findViewById(R.id.dateofbirth_txt);
        dateOfBirthTxt.setText(dateOfBirth);
        TextView placeOfBirthTxt = findViewById(R.id.placeofbirth_txt);
        placeOfBirthTxt.setText(placeOfBirth);
        TextView currentCompanyNameTxt = findViewById(R.id.current_company_name_txt);
        currentCompanyNameTxt.setText(currentCompany);
        TextView totalExperienceTxt1 = findViewById(R.id.totalexperience_txt);
        totalExperienceTxt1.setText(totalExperience);
        TextView designation1Txt = findViewById(R.id.designation_txt1);
        designation1Txt.setText(designation);
        TextView bankNameTxt1 = findViewById(R.id.bankname_txt);
        bankNameTxt1.setText(bankName);
        TextView accountHolderNameTxt1 = findViewById(R.id.accountholder_txt);
        accountHolderNameTxt1.setText(accountHolderName);
        TextView accountNumberTxt1 = findViewById(R.id.accountnumber_txt);
        accountNumberTxt1.setText(accountNumber);
        TextView ifscCodeTxt1 = findViewById(R.id.ifsccode_txt);
        ifscCodeTxt1.setText(ifscCode);
        TextView panNumberTxt = findViewById(R.id.pannumber_txt);
        panNumberTxt.setText(panNumber);
        TextView aadharNumberTxt = findViewById(R.id.aadharnumber_txt);
        aadharNumberTxt.setText(aadharNumber);
        TextView hNoApartmentTxt1 = findViewById(R.id.hno_apartment_txt);
        hNoApartmentTxt1.setText(hNoApartment);
        TextView streetNameTxt = findViewById(R.id.street_name_txt);
        streetNameTxt.setText(street);
        TextView cityTxt1 = findViewById(R.id.city_txt_1);
        cityTxt1.setText(city);
        TextView stateTxt1 = findViewById(R.id.state_txt_1);
        stateTxt1.setText(state);
        TextView countryTxt1 = findViewById(R.id.country_txt_1);
        countryTxt1.setText(country);
        TextView cardNumberTxt1 = findViewById(R.id.cardnumber_txt);
        cardNumberTxt1.setText(cardNumber);
        TextView cardHolderTxt1 = findViewById(R.id.cardholder_txt);
        cardHolderTxt1.setText(cardHolder);
        TextView expiryTxt1 = findViewById(R.id.expiry_txt_1);
        expiryTxt1.setText(expiry);
        TextView cvvTxt1 = findViewById(R.id.cvv_txt_1);
        cvvTxt1.setText(cvv);
    }
}