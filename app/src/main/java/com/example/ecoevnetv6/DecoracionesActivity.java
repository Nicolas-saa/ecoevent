package com.example.ecoevnetv6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DecoracionesActivity extends AppCompatActivity {

    private EditText etCategory, etQuantity, etCost, etMonth;
    private Button btnSave, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_decoraciones);
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


                    Toast.makeText(DecoracionesActivity.this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
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
        // Validar inputs
        if (etCategory.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Por favor, ingrese una categoría", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!etQuantity.getText().toString().matches("\\d+")) {
            Toast.makeText(this, "Por favor, ingrese una cantidad válida", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!etCost.getText().toString().matches("\\d+(\\.\\d+)?")) {
            Toast.makeText(this, "Por favor, ingrese un costo válido", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (etMonth.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Por favor, ingrese un mes", Toast.LENGTH_SHORT).show();
            return false;
        }
        // Si todos los inputs son válidos, devolver true
        return true;


    }
}