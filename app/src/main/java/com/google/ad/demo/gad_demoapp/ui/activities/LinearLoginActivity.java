package com.google.ad.demo.gad_demoapp.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.ad.demo.gad_demoapp.R;

public class LinearLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_login);
    }

    public void doLogin(View view)
    {

        EditText editUsername = findViewById(R.id.actLinearLayout_editUser);
        EditText editPassword = findViewById(R.id.actLinearLayout_editPass);

        /* password validation here */
        if (true) {
            Toast.makeText(this, R.string.actLinearLogin_text_login_success, Toast.LENGTH_SHORT).show();
        }

    }
}
