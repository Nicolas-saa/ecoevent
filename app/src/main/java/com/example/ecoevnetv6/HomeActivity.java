package com.example.ecoevnetv6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button btnCategories, btnStatistics, btnTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inicializar componentes
        btnCategories = findViewById(R.id.buttonCategories);
        btnStatistics = findViewById(R.id.buttonStatistics);
        btnTips = findViewById(R.id.buttonTips);


        // Agregar listeners a los botones
        btnCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                 Ir a la pantalla de categorías
                Intent intent = new Intent(HomeActivity.this, CategoriasActivity.class);
                startActivity(intent);

            }
        });
//
        btnStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de estadísticas
                Intent intent = new Intent(HomeActivity.this, EstadisticasActivity.class);
                startActivity(intent);
            }
        });
//
        btnTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de consejos
                Intent intent = new Intent(HomeActivity.this, ConsejosActivity.class);
                startActivity(intent);
            }
        });


    }}
