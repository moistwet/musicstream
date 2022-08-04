package com.example.musicstream;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class loginpage extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter= 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        //calling loginName , loginPassword , tvinfo, loginButton in xml file to activity
        Name = (EditText)findViewById(R.id.loginName);
        Password = (EditText)findViewById(R.id.loginPassword);
        Info = (TextView)findViewById(R.id.tvinfo);
        Login = (Button) findViewById(R.id.loginButton);

        //sets info to (no of attempts remaining 5)
        Info.setText("No of attempts remaining: 5");

        //listens for onclick
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }

    //validates if username and password are correct
    private void validate(String username, String userpassword){
        //username= Admin and password= Password
        //if username and password is correct, intent code will lead the user to Mainactivity class
        if ((username.equals("Admin"))&& (userpassword.equals("Password"))){
            Intent intent = new Intent(loginpage.this, MainActivity.class);
            startActivity(intent);
        }
        else {
            //if username and password is incorrect, the counter will minus 1
            counter--;

            Info.setText("No of attempts remaining" + String.valueOf(counter));

            if(counter==0){
                //when counter =0, login button is disabled
                Login.setEnabled(false);
            }

        }
    }
}