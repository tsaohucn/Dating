package com.example.faketsao.dating;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void goToSignUpOne(View view) {
        startActivity(new Intent(WelcomeActivity.this, SignUpOneActivity.class));
        //setContentView(R.layout.activity_sign_up_one);
    }
}
