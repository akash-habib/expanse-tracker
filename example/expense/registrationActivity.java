package com.example.expense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class registrationActivity extends AppCompatActivity {

    private EditText  mEmail;
    private EditText mpass;
    private Button btnReg;
    private TextView mSignin;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regetration);
        registration();
    }
    private void registration(){
        mEmail=findViewById(R.id.email_registration);
        mpass=findViewById(R.id.password_reg);
        btnReg=findViewById(R.id.btn_reg);
        mSignin=findViewById(R.id.sign_in_here);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=mEmail.getText().toString().trim();
                String pass=mpass.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    mEmail.setError("Email required");
                    return;
                }
                if(TextUtils.isEmpty(pass)){
                    mpass.setError("Password Required");
                }
            }
        });
        mSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });


    }

}