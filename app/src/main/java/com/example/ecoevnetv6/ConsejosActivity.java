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

public class ConsejosActivity extends AppCompatActivity {
    private Button  btnHome, btnStatistics, btnCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejos);
        // Inicializar componentes

        btnHome = findViewById(R.id.homeButton);
        btnStatistics = findViewById(R.id.settingsButton);
        btnCategories = findViewById(R.id.gridButton);

        // Agregar listeners a los botones


        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de home
                Intent intent = new Intent(ConsejosActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        btnStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de estadísticas
                Intent intent = new Intent(ConsejosActivity.this, EstadisticasActivity.class);
                startActivity(intent);
            }
        });

        btnCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de categorías
                Intent intent = new Intent(ConsejosActivity.this, CategoriasActivity.class);
                startActivity(intent);
            }
        });
    }
    }
