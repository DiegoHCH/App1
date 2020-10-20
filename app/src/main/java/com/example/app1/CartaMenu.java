package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class CartaMenu extends AppCompatActivity {

    List<Plato> platos;
    Button btCSession;
    Button btFacturar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cartamenu);
        btCSession = findViewById(R.id.btCLogin);
        btFacturar = findViewById(R.id.btFacturar);
        initializeDataPlatos();

        RecyclerView selectPlato = findViewById(R.id.rvMenu);
        selectPlato.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        Adapter adapter = new Adapter(platos);
        selectPlato.setAdapter(adapter);

        btCSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
                savedDataSession();
            }
        });

        btFacturar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                facturar();
            }
        });

    }

    private void facturar() {
        Intent facturacion = new Intent(CartaMenu.this, Factura.class);
        startActivity(facturacion);
    }

    private void login() {
        Intent login = new Intent(CartaMenu.this, Login.class);
        startActivity(login);
    }

    private void initializeDataPlatos(){
        platos = new ArrayList<>();
        platos.add(new Plato("","Bandeja Paisa",20000,"",0,R.drawable.bandejapaisa));
        platos.add(new Plato("","Arroz Chino",18000,"",0,R.drawable.arrozchino));
        platos.add(new Plato("","Sancocho",12000,"",0,R.drawable.sancocho));
        platos.add(new Plato("","Pechuga",10000,"",0,R.drawable.filete));
    }

    void savedDataSession(){
        SharedPreferences sharedPreferences = getSharedPreferences("datalogin", Context.MODE_PRIVATE);
        SharedPreferences.Editor sharedEditor = sharedPreferences.edit();
        sharedEditor.putBoolean("estado",false);
        sharedEditor.apply();
    }
}