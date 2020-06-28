package com.example.assignment3;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private EditText SignIn;
    private TextView SInfo;
    private Button signubtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = (EditText) findViewById(R.id.temail);
        Password = (EditText) findViewById(R.id.tpassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        Login = (Button) findViewById(R.id.btnLogin);
        SignIn = (EditText) findViewById(R.id.pSingin);
        SInfo = (TextView) findViewById(R.id.tvSignin);
        signubtn = (Button) findViewById(R.id.signubtn);
        setListeners();
    }

    private void validation(String userEmail, String userPassword) {
        if ((userEmail.equalsIgnoreCase("MashalMaqsood12") && userPassword.equalsIgnoreCase("MAD"))) {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            startActivity(intent);
        }
    }

    private void setListeners() {
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation(Email.getText().toString(), Password.getText().toString());
            }
        });
        findViewById(R.id.signubtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
