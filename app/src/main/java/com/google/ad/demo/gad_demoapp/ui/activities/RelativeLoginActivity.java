package com.google.ad.demo.gad_demoapp.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.ad.demo.gad_demoapp.R;

public class RelativeLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_login);
    }

    public void doLogin(View view)
    {

        EditText editUsername = findViewById(R.id.actRelativeLayout_editUser);
        EditText editPassword = findViewById(R.id.actRelativeLayout_editPass);

        /* password validation here */
        if (true) {
            Toast.makeText(this, "User signed in!", Toast.LENGTH_SHORT).show();
        }

    }
}
