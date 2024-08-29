package com.example.ecoevnetv6;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.renderscript.Int2;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EstadisticasActivity extends AppCompatActivity {
    private android.widget.ProgressBar progressFood, progressDrinks, progressDecorations;
    private Button btnHome, btnCategorias, btnTips, btnAdvice;
    private TextView txtFoodProgress, txtDrinksProgress, txtDecorationsProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);
        // Inicializar componentes
        progressFood = findViewById(R.id.progress_alimentos);
        progressDrinks = findViewById(R.id.progress_bebidas);
        progressDecorations = findViewById(R.id.progress_decoraciones);
//        btnAdvice = findViewById(R.id.buttonTips);
        txtFoodProgress = findViewById(R.id.txt_alimentos_progress);
        txtDrinksProgress = findViewById(R.id.txt_bebidas_progress);
        txtDecorationsProgress = findViewById(R.id.txt_decoraciones_progress);
        btnHome = findViewById(R.id.homeButton);
        btnCategorias = findViewById(R.id.gridButton);
        btnTips = findViewById(R.id.settingsButton);

        // Agregar listeners a los botones


//        btnAdvice.setOnClickListener(new View(.OnClickListener)) {
//            @Override
//            public void onclick(View view) {
//                // Ir a la pantalla de consejos
//                Intent intent = new Intent(EstadisticasActivity.this, ConsejosActivity.class);
//                startActivity(intent);
//            }
//        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ir a la pantalla de home
                Intent intent = new Intent(EstadisticasActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        btnCategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ir a la pantalla de estadisticas
                Intent intent = new Intent(EstadisticasActivity.this, CategoriasActivity.class);
                startActivity(intent);
            }
        });
        btnTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Ir a la pantalla de consejos
                Intent intent = new Intent(EstadisticasActivity.this, ConsejosActivity.class);
                startActivity(intent);
            }
        });

    }


}


