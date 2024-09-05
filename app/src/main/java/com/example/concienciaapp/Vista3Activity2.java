package com.example.concienciaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Vista3Activity2 extends AppCompatActivity {

    private TextView titulo;
    private TextView aguaResumen;
    private CheckBox fraseAgua;
    private RadioGroup radioGroup;
    private Button finishButton;
    private Button anteriorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista32);

        titulo = findViewById(R.id.titulo4);
        aguaResumen = findViewById(R.id.agua_resumen);
        fraseAgua = findViewById(R.id.fraseagua);
        radioGroup = findViewById(R.id.radiog);
        finishButton = findViewById(R.id.finish_button);
        anteriorButton=findViewById(R.id.retroceder);


        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleFinish();
            }
        });
        anteriorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Vista3Activity2.this, Vista2Activity2.class);
                startActivity(intent);
            }
        });
    }

    private void handleFinish() {
        // Obtiene la selección del RadioGroup
        int selectedId = radioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedId);

        // Crea un mensaje para mostrar los resultados de las selecciones
        String message = "Frase: " + (fraseAgua.isChecked() ? "El agua es vida; conserve cada gota." : "Frase no seleccionada.");
        if (selectedRadioButton != null) {
            message += "\nRespuesta Seleccionada: " + selectedRadioButton.getText();
        } else {
            message += "\nNo has seleccionado una respuesta.";
        }


        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Intent intent=new Intent(Vista3Activity2.this, Vista4Activity2.class);
        startActivity(intent);
    }
}