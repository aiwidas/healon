package com.example.ho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton btn=(ImageButton)findViewById(R.id.app);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(home.this,appoinment.class);
                startActivity(intent);
            }
        });

        ImageButton btn1=(ImageButton)findViewById(R.id.med);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(home.this,medicalhistory.class);
                startActivity(intent);
            }
        });

        ImageButton btn2=(ImageButton)findViewById(R.id.don);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(home.this,donation.class);
                startActivity(intent);
            }
        });

        ImageButton btn3=(ImageButton)findViewById(R.id.pay);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(home.this,payment.class);
                startActivity(intent);
            }
        });


    }
}