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

public class MainActivity extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPassword;
    private Button btnLogin;
    private Button btnCreateAccount;
    // Nuevo botón para crear cuenta

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnCreateAccount = findViewById(R.id.btCreateAccount); // Enlazar el nuevo botón

        etEmail.setText("introducir@gmail.com");
        etPassword.setText("Introducir contraseña");
        btnLogin.setText("Iniciar sesión");
        btnCreateAccount.setText("Crear cuenta"); // Texto del nuevo botón

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                if (isValidEmailAndPassword(email, password)) {
                    // Lógica de inicio de sesión aquí
                    Toast.makeText(MainActivity.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Correo electrónico o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navegar a la pantalla de registro
                startActivity(new Intent(MainActivity.this,RegistroActivity.class));
            }
        });
    }

    private boolean isValidEmailAndPassword(String email, String password) {
        // Lógica para validar el correo electrónico y contraseña aquí
        // Por ejemplo:
        return email.contains("@") && password.length() > 6;
        }

}
