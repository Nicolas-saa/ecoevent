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

public class CategoriasActivity extends AppCompatActivity {

    private Button btnFood, btnDrinks, btnDecorations, btnHelp, btnHome, btnStatistics, btnTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        // Inicializar componentes
        btnFood = findViewById(R.id.alimentosButton);
        btnDrinks = findViewById(R.id.bebidasButton);
        btnDecorations = findViewById(R.id.decoracionesButton);
        btnHelp = findViewById(R.id.ayudabutton);
        btnHome = findViewById(R.id.homeButton);
        btnStatistics = findViewById(R.id.gridButton);
        btnTips = findViewById(R.id.settingsButton);

        // Agregar listeners a los botones
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de alimentos
                Intent intent = new Intent(CategoriasActivity.this, AlimentosActivity.class);
                startActivity(intent);
            }
        });
//
        btnDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de bebidas
                Intent intent = new Intent(CategoriasActivity.this, BebidasActivity.class);
                startActivity(intent);
            }
        });
//
        btnDecorations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de decoraciones
                Intent intent = new Intent(CategoriasActivity.this, DecoracionesActivity.class);
                startActivity(intent);
            }
        });

                btnHelp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Ir a la pantalla de ayuda
                        Intent intent = new Intent(CategoriasActivity.this, AyudaActivity.class);
                        startActivity(intent);

                    }
                });

                btnHome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Ir a la pantalla de home
                        Intent intent = new Intent(CategoriasActivity.this, HomeActivity.class);
                        startActivity(intent);
                    }
                });
                btnStatistics.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Ir a la pantalla de estadisticas
                        Intent intent = new Intent(CategoriasActivity.this, EstadisticasActivity.class);
                        startActivity(intent);
                    }
                });
                btnTips.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
//                Ir a la pantalla de consejos
                        Intent intent = new Intent(CategoriasActivity.this, ConsejosActivity.class);
                        startActivity(intent);
                    }
                });

            }
        }

