package com.example.ho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button button=(Button)findViewById(R.id.User);
        CheckBox c=(CheckBox)findViewById(R.id.ews);





        //TextView username =(TextView) findViewById(R.id.username);
        //TextView password =(TextView) findViewById(R.id.password);

        //MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin

        //loginbtn.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                //}else
                    //oast.makeText(MainActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            //}








        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(c.isChecked())
                    {
                        if(c.isChecked())
                        {
                            Toast.makeText(register.this,"REGISTRATION SUCCESSFUL",Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(register.this,personaldetails.class);
                            startActivity(intent);
                        }


                    }
            }
        });


    }
}