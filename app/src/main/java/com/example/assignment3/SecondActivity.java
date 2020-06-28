package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Email;
    private EditText Password;
    private TextView Info;
    private Button SignUp;
    private Button SignUp2;
    private TextView Signupinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Name = (EditText)findViewById(R.id.tvname);
        Email = (EditText)findViewById(R.id.Ptemail);
        Password = (EditText)findViewById(R.id.Spassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        SignUp=(Button)findViewById(R.id.btnSignup);
        SignUp2 = (Button)findViewById(R.id.btnsignup2);
        Signupinfo = (TextView)findViewById(R.id.tvsignup);

    }

}
