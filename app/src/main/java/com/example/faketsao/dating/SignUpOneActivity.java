package com.example.faketsao.dating;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_one);
    }

    public void goToSignUpTwo(View view) {

        startActivity(new Intent(SignUpOneActivity.this, SignUpTwoActivity.class));
    }


}
