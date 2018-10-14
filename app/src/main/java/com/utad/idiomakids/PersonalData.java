package com.utad.idiomakids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersonalData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);
    }

    public void onClick(View view) {
        Intent intent = new Intent (view.getContext(), Profile.class);
        startActivityForResult(intent, 0);
    }
}
