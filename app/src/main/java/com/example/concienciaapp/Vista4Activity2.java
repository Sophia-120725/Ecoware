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

public class Vista4Activity2 extends AppCompatActivity {

    private TextView titulo;
    private TextView reforestacionResumen;
    private CheckBox fraseAgua;
    private RadioGroup radioGroup;
    private Button finishButton;
    private Button anteriorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista42);


        titulo = findViewById(R.id.titulo5);
        reforestacionResumen = findViewById(R.id.Reforestacion_resumen);
        fraseAgua = findViewById(R.id.fraseagua);
        radioGroup = findViewById(R.id.radiog);
        finishButton = findViewById(R.id.finish_button);
        anteriorButton= findViewById(R.id.retroceder);


        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleFinish();
            }
        });
        anteriorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Vista4Activity2.this, Vista3Activity2.class);
                startActivity(intent);
            }
        });
    }

    private void handleFinish() {

        int selectedId = radioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedId);


        String message = "Frase: " + (fraseAgua.isChecked() ? "Planta un árbol hoy, y cosecha un futuro verde mañana." : "Frase no seleccionada.");
        if (selectedRadioButton != null) {
            message += "\nRespuesta Seleccionada: " + selectedRadioButton.getText();
        } else {
            message += "\nNo has seleccionado una respuesta.";
        }


        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Intent intent=new Intent(Vista4Activity2.this, Vista5Activity2.class);
        startActivity(intent);
    }
}