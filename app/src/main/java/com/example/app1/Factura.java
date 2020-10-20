package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Factura extends AppCompatActivity {

    Button btVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factura);

        btVolver = findViewById(R.id.btAtras);

        btVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volver();
            }
        });
    }

    private void volver() {
        Intent volver = new Intent(Factura.this, CartaMenu.class);
        startActivity(volver);
    }
}
