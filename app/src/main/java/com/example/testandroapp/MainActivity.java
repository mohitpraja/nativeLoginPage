package com.example.testandroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_mail;
    EditText et_password;
    Button login_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_mail = (EditText) findViewById(R.id.et_mail);
        et_password = (EditText) findViewById(R.id.et_password);
        login_btn = (Button) findViewById(R.id.login_btn);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_mail.getText().toString();
                String password = et_password.getText().toString();

                Toast.makeText(getApplicationContext(),"Name : "+name+ " "+ "Password : "+password,Toast.LENGTH_LONG).show();


                System.out.println("name : $name");
                System.out.println(name);
                System.out.println("password: $password");
                System.out.println(password);
            }
        });

    }
    public void checkTmp(){
        System.out.println("this is my check temp print");
    }
//    public void tstClick(View view){
//        et_mail = (EditText) findViewById(R.id.et_mail);
//        et_password = (EditText) findViewById(R.id.et_password);
//        login_btn = (Button) findViewById(R.id.login_btn);
//        String name = et_mail.getText().toString();
//        String password = et_password.getText().toString();
//        Toast.makeText(getApplicationContext(),"Name : "+name+ " "+ "Password : "+password,Toast.LENGTH_LONG).show();
//    }
}