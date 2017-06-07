package com.example.jd.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    TextView buckysText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        buckysText=(TextView) findViewById(R.id.buckysText);
    }
//    save the user login info
    public void saveinfo(View view)
    {
        SharedPreferences sharedPref=getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit=sharedPref.edit();
        edit.putString("username",username.getText().toString());
        edit.putString("password",password.getText().toString());
        edit.apply();

        Toast.makeText(this,"saved ",Toast.LENGTH_SHORT).show();

    }
//    print out the saved data
    public  void displaydata(View view)
    {
        SharedPreferences sharedPref=getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        String name = sharedPref.getString("username","");
        String pwd = sharedPref.getString("password","");
        buckysText.setText(name +" "+ pwd);

    }
}
