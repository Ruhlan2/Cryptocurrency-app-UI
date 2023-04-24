package com.ruhlanusubov.mapsactivity.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ruhlanusubov.mapsactivity.R;

public class LoginActivity extends AppCompatActivity {

    private EditText Useredit,passwordedit;
    private Button Loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        setVariables();

    }
    private void initView(){
        Useredit=findViewById(R.id.editTextPersonName);
        passwordedit=findViewById(R.id.editTextPassword);
        Loginbtn=findViewById(R.id.LoginBtn);
    }

    private void setVariables(){
        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Useredit.getText().toString().isEmpty()||passwordedit.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this,"Please fill the login form",Toast.LENGTH_LONG).show();
                    
                } else if (Useredit.getText().toString().equals("admin")&&passwordedit.getText().toString().equals("admin")) {
                    Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                }
            }
        });
    }


}