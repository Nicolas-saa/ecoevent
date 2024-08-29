package com.example.ecoevnetv6;

import android.content.Intent;
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

public class RegistroActivity extends AppCompatActivity {

    private EditText etName, etEmail, etPassword;
    private Button btnCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        // Inicializar componentes
        etName = findViewById(R.id.inputUsername);
        etEmail = findViewById(R.id.inputEmail);
        etPassword = findViewById(R.id.inputPassword);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);

        // Agregar listeners a los botones
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para crear cuenta
                createAccount();
            }
        });

    }

    private void createAccount() {
        // Lógica para crear cuenta
        // Aquí puedes agregar la lógica para crear una cuenta en tu base de datos
        // Por ahora, solo mostraremos un mensaje de éxito
        Toast.makeText(this, "Cuenta creada con éxito", Toast.LENGTH_SHORT).show();
    }
}