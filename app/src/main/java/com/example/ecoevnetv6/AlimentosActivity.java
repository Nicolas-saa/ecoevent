package com.example.ecoevnetv6;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class AlimentosActivity extends AppCompatActivity {

    private EditText etCategory, etQuantity, etCost, etMonth;
    private Button btnSave, btnCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alimentos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inicializar componentes
        etCategory = findViewById(R.id.etCategoria);
        etQuantity = findViewById(R.id.etCantidad);
        etCost = findViewById(R.id.etCosto);
        etMonth = findViewById(R.id.etMes);
        btnSave = findViewById(R.id.btnGuardar);
        btnCancel = findViewById(R.id.btnCancelar);

        // Agregar listeners a los botones
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validar inputs
                if (isValidInput()) {
                    // Guardar datos
                    String category = etCategory.getText().toString();
                    int quantity = Integer.parseInt(etQuantity.getText().toString());
                    double cost = Double.parseDouble(etCost.getText().toString());
                    String month = etMonth.getText().toString();



                    Toast.makeText(AlimentosActivity.this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
                    finish(); // Cerrar la actividad
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cerrar la actividad
            }
        });

    }

    private boolean isValidInput() {
        return isValidInput();
    }


}

