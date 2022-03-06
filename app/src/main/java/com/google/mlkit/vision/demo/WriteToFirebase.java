package com.google.mlkit.vision.demo;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WriteToFirebase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("User Name");
        String  userID = intent.getStringExtra("User ID");
        Toast.makeText(this, userID+" : "+userID, Toast.LENGTH_SHORT).show();
    }

}
