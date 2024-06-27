package com.example.patientapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5, e6, e7, e8;
    AppCompatButton bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        e1 = (EditText) findViewById(R.id.pname);
        e2 = (EditText) findViewById(R.id.page);
        e3 = (EditText) findViewById(R.id.phousename);
        e4 = (EditText) findViewById(R.id.ppincode);
        e5 = (EditText) findViewById(R.id.pmobno);
        e6 = (EditText) findViewById(R.id.puname);
        e7 = (EditText) findViewById(R.id.ppass);
        e8 = (EditText) findViewById(R.id.pconpass);
        bt1 = (AppCompatButton) findViewById(R.id.plogbtn);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        bt2 = (AppCompatButton) findViewById(R.id.pregbtn);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getPname = e1.getText().toString();
                String getPage = e2.getText().toString();
                String getHouseName = e3.getText().toString();
                String getPpincode = e4.getText().toString();
                String getPmobileno = e5.getText().toString();
                String getPuname = e6.getText().toString();
                String getPpass = e7.getText().toString();
                String getconfirmpass = e8.getText().toString();
                Toast.makeText(getApplicationContext(), getPname +" "+ getPage + " "+ getHouseName +" " +getPpincode + " "+getPmobileno + " "+ getPuname +" "+ getPpass +" "+ getconfirmpass,Toast.LENGTH_SHORT).show();
            }
        });
    }
}

