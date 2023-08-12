package com.gtappdevelopers.wallpaperapp;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtEmail, edtPass;
    private AppCompatButton btnSignIn;

    private TextView txtBCA, txtWelcome, txtForgot, txtAlready, txtSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findView();

    }
    private void findView() {
        edtEmail = findViewById(R.id.edtEmail);
        edtPass = findViewById(R.id.edtPass);
        txtForgot = findViewById(R.id.txtForgot);
        btnSignIn = findViewById(R.id.btnSignIn);
        txtSignUp = findViewById(R.id.txtSignUp);
        txtBCA = findViewById(R.id.txtBCA);
        btnSignIn.setOnClickListener(this);
        txtSignUp.setOnClickListener(this);
//        btnSignIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edtEmail.getText().toString().isEmpty() && !edtPass.getText().toString().isEmpty())
//                    ;
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSignIn) {
            if (edtEmail.getText().toString().isEmpty() || edtPass.getText().toString().isEmpty()) {

                if (edtEmail.getText().toString().isEmpty() && !edtPass.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Please enter Email", Toast.LENGTH_LONG).show();
                } else if (edtPass.getText().toString().isEmpty() && !edtEmail.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Please enter Password", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Please enter Email and Password", Toast.LENGTH_LONG).show();

                }
            } else if (!edtEmail.getText().toString().isEmpty() && !edtPass.getText().toString().isEmpty()) {
                Intent intent = new Intent(LoginActivity.this, HomeScreenActivity.class);
                Toast.makeText(this, "You have logged in", Toast.LENGTH_LONG).show();
//            intent.putExtra("Email",edtEmail.getText().toString().trim());
//                intent.putExtra("Email", "Email Address");
                startActivity(intent);
//            startActivityForResult(intent,100);


            }


        } else if (view.getId() == R.id.txtSignUp) {
            Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
            Toast.makeText(this, "Sign Up Now", Toast.LENGTH_LONG).show();
//            intent.putExtra("Email",edtEmail.getText().toString().trim());
//            intent.putExtra("Email", "Email Address");
            startActivity(intent);
//            startActivityForResult(intent,100);
//            signupActivityLauncher.launch(intent);


        }
    }
}

