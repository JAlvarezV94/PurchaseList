package com.jnoma.purchaselist.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.jnoma.purchaselist.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Login extends AppCompatActivity {

    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.et_username_login)
    EditText etUsername;
    @BindView(R.id.et_password_login)
    EditText etPassword;
    FirebaseDatabase database;
    DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        database = FirebaseDatabase.getInstance();
        ref = database.getReference("users");


        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etUsername.getText() != null && etPassword.getText() != null){
                    String username = etUsername.getText().toString();
                    String password = etPassword.getText().toString();

                    ref.child("username").setValue(username);
                    ref.child("password").setValue(password);

                    Toast.makeText(getApplicationContext(),"SE HA ESCRITO!",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
