package com.example.app1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText etUsser;
    EditText etPassword;
    Button btLogin;
    final String usser = "2020";
    final String password = "2020";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        validatesession();

        etUsser = findViewById(R.id.etUsser);
        etPassword = findViewById(R.id.etPassword);
        btLogin = findViewById(R.id.btLogin);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(usser.equals(etUsser.getText().toString()) && password.equals(etPassword.getText().toString())){
                    menu();
                    savedDataSession();
                }else{
                    error();
                }
            }
        });

    }

    private void validatesession() {
        SharedPreferences sharedPreferences = getSharedPreferences("datalogin", Context.MODE_PRIVATE);
        if (sharedPreferences.getBoolean("estado",false)){
            menu();
        }

    }


    void savedDataSession() {
        SharedPreferences sharedPreferences = getSharedPreferences("datalogin", Context.MODE_PRIVATE);
        SharedPreferences.Editor sharedEditor = sharedPreferences.edit();
        sharedEditor.putString("usser",etUsser.getText().toString());
        sharedEditor.putString("password",etPassword.getText().toString());
        sharedEditor.putBoolean("estado",true);
        sharedEditor.apply();
    }


    private void menu() {
        Intent menu = new Intent(Login.this, CartaMenu.class);
        startActivity(menu);
    }

    private void error() {
        new AlertDialog.Builder(this)
                .setMessage("Usuario o Contraseña Erroneo")
                .show();
    }
}