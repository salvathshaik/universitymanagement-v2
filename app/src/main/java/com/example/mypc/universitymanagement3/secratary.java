package com.example.mypc.universitymanagement3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class secratary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secratary);
    }
    public void home(View view)
    {

        Intent i1 = new Intent(this, MainActivity.class);
        startActivity(i1);

    }

    public void viewresults(View view)
    {

    }
}
