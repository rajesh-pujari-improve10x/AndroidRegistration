package com.example.androidregistraton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        addressActivityToBirthDetailsActivity();
        addressActivityToPersonalActivity();
    }

    public void addressActivityToBirthDetailsActivity() {
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent addressIntent = new Intent(this, BirthDetailsActivity.class);
            Intent intent = getIntent();
            Bundle bundle = intent.getExtras();
            EditText hNoApartmentTxt = findViewById(R.id.h_no_apartment_txt);
            String hNoApartment = hNoApartmentTxt.getText().toString();
            EditText streetTxt = findViewById(R.id.street_txt);
            String street = streetTxt.getText().toString();
            EditText cityTxt = findViewById(R.id.city_txt);
            String city = cityTxt.getText().toString();
            EditText stateTxt = findViewById(R.id.state_txt);
            String state = stateTxt.getText().toString();
            EditText countryTxt = findViewById(R.id.country_txt);
            String country = countryTxt.getText().toString();
            addressIntent.putExtras(bundle);
            addressIntent.putExtra("H.No/Apartment", hNoApartment);
            addressIntent.putExtra("Street", street);
            addressIntent.putExtra("City", city);
            addressIntent.putExtra("State", state);
            addressIntent.putExtra("Country", country);
            startActivity(addressIntent);
        });
    }

    public void addressActivityToPersonalActivity() {
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(view -> {
            finish();
        });
    }
}