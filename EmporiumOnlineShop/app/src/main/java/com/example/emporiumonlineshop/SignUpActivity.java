package com.example.emporiumonlineshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    Button loginButton;
    Button signUpButton;
    EditText name;
    EditText email;
    EditText password;
    EditText confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        loginButton = findViewById(R.id.loginBtnSUA);
        signUpButton = findViewById(R.id.signUpBtnSUA);
        name = findViewById(R.id.nameField);
        email = findViewById(R.id.emailField);
        password = findViewById(R.id.passwordField);
        confirmPassword = findViewById(R.id.confirmPasswordField);

        loginButton.setOnClickListener(onClick);
        signUpButton.setOnClickListener(onClick);
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            if (v.getId() == R.id.loginBtn) {
                intent = new Intent(getApplicationContext(), LoginActivity.class);
            } if (v.getId() == R.id.signUpBtn) {
                if (name.getText().toString().isEmpty() || email.getText().toString().isEmpty() ||
                        password.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Incomplete fields", Toast.LENGTH_LONG).show();
                    intent = new Intent(getApplicationContext(), SignUpActivity.class);
                    if (!(password.getText().toString().equals(confirmPassword.getText().toString()))) {
                        Toast.makeText(SignUpActivity.this, "Passwords don't match", Toast.LENGTH_LONG).show();
                        intent = new Intent(getApplicationContext(), SignUpActivity.class);
                    }
                } else {
                    intent = new Intent(SignUpActivity.this, BrowseActivity.class);
                }
            } startActivity(intent);
        }
    };
}
