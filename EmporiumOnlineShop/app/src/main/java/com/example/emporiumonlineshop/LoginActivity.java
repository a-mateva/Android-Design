package com.example.emporiumonlineshop;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button loginButton;
    Button signUpButton;
    EditText emailET;
    EditText passwordET;
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        link = findViewById(R.id.forgottenPasswordLink);
        emailET = findViewById(R.id.emailFieldLA);
        passwordET = findViewById(R.id.passwordFieldLA);
        signUpButton = findViewById(R.id.signUpBtnLA);
        loginButton = findViewById(R.id.loginBtnLA);
        signUpButton.setOnClickListener(onClick);
        loginButton.setOnClickListener(onClick);
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            /*if (v.getId() == R.id.signUpBtnLA) {
                intent = new Intent(getApplicationContext(), SignUpActivity.class);
            } if (v.getId() == R.id.loginBtnLA) {
                if (emailET.getText().toString().isEmpty() || passwordET.getText().toString().isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Incomplete fields", Toast.LENGTH_LONG).show();
                    intent = new Intent(getApplicationContext(), LoginActivity.class);
                } else {
                    intent = new Intent(getApplicationContext(), BrowseActivity.class);
                }
            }*/
            intent = new Intent(getApplicationContext(), BrowseActivity.class);
            startActivity(intent);
        }
    };
}
