package com.example.concienciaapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Vista8Activity2 extends AppCompatActivity {

    private EditText nameEditText;
    private EditText emailEditText;
    private EditText telEditText;
    private EditText sitiowebEditText;
    private EditText asuntoEditText;
    private EditText mensajeEditText;
    private Button submitButton;
    private ImageView clienteContacto;
    private TextView titleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista82);


        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        telEditText = findViewById(R.id.tel);
        sitiowebEditText = findViewById(R.id.sitioweb);
        asuntoEditText = findViewById(R.id.asusnto);
        mensajeEditText = findViewById(R.id.mensaje);
        submitButton = findViewById(R.id.submitButton);
        clienteContacto = findViewById(R.id.clientecontacto);
        titleTextView = findViewById(R.id.titleTextView);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarFormulario();
            }
        });
    }

    private void enviarFormulario() {
        String nombre = nameEditText.getText().toString().trim();
        String correo = emailEditText.getText().toString().trim();
        String telefono = telEditText.getText().toString().trim();
        String sitioWeb = sitiowebEditText.getText().toString().trim();
        String asunto = asuntoEditText.getText().toString().trim();
        String mensaje = mensajeEditText.getText().toString().trim();

        // Validar campos no vacíos
        if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty() || mensaje.isEmpty()) {
            Toast.makeText(this, "Por favor, complete todos los campos requeridos.", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(Vista8Activity2.this,Vista1Activity.class);
        startActivity(intent);

        // Mostrar mensaje de éxito temporal
        Toast.makeText(this, nombre+" "+correo+" "+telefono+" "+sitioWeb+" "+asunto+" "+mensaje+" Enviados existosamente", Toast.LENGTH_LONG).show();
    }
}