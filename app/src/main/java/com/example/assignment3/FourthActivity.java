package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class FourthActivity extends AppCompatActivity {
     private CircleImageView image;
     private EditText Contactname;
     private TextView mobile;
     private EditText email;
     private TextView personal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        image=(CircleImageView)findViewById(R.id.centerimage);
        Contactname=(EditText) findViewById(R.id.contactname);
        mobile=(TextView)findViewById(R.id.mob);
        email=(EditText)findViewById(R.id.email);
        personal=(TextView)findViewById(R.id.personall);

    }
}
