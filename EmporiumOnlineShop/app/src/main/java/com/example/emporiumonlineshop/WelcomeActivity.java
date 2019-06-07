package com.example.emporiumonlineshop;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class WelcomeActivity extends AppCompatActivity {

    Button loginButton;
    Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginBtn);
        signUpButton = findViewById(R.id.signUpBtn);
        loginButton.setOnClickListener(onClick);
        signUpButton.setOnClickListener(onClick);
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view){
            Intent intent = null;
            if (view.getId() == R.id.loginBtn) {
                intent = new Intent(WelcomeActivity.this, LoginActivity.class);
            } if (view.getId() == R.id.signUpBtn) {
                intent = new Intent(WelcomeActivity.this, SignUpActivity.class);
            }
            startActivity(intent);
        }
    };
}
