package com.utad.idiomakids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mEmail;
    private EditText mPassword;
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.Button);
        mEmail = findViewById(R.id.etemail);
        mPassword = findViewById(R.id.etpassword);
        String email = mEmail.getText().toString();
        String password = mPassword.getText().toString();


    }

    public void onClick(View view) {
        Intent intent = new Intent (view.getContext(), FormData.class);
        startActivityForResult(intent, 0);
    }
}
