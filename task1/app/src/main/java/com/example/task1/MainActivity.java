package com.example.task1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etFirstName, etMiddleName, etLastName, etPassportSerial, etDOB;
    private Button btnConfirm;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        etFirstName = findViewById(R.id.etFirstName);
        etMiddleName = findViewById(R.id.etMiddleName);
        etLastName = findViewById(R.id.etLastName);
        etPassportSerial = findViewById(R.id.etPassportSerial);
        etDOB = findViewById(R.id.etDOB);
        btnConfirm = findViewById(R.id.btnConfirm);
        tvResult = findViewById(R.id.tvResult);

        // Set click listener on button
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get input data
                String firstName = etFirstName.getText().toString();
                String middleName = etMiddleName.getText().toString();
                String lastName = etLastName.getText().toString();
                String passportSerial = etPassportSerial.getText().toString();
                String dob = etDOB.getText().toString();

                // Display the entered information
                String resultText = "First Name: " + firstName + "\n" +
                        "Middle Name: " + middleName + "\n" +
                        "Last Name: " + lastName + "\n" +
                        "Passport Serial: " + passportSerial + "\n" +
                        "Date of Birth: " + dob;

                tvResult.setText(resultText);
            }
        });
    }
}
