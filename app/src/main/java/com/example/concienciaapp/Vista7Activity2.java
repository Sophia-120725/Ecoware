package com.example.concienciaapp;

import  android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Vista7Activity2 extends AppCompatActivity {

    private CheckBox fraseCheckBox;
    private RadioGroup radioGroup;
    private Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista62);

        fraseCheckBox = findViewById(R.id.frase);
        radioGroup = findViewById(R.id.radiog);
        finishButton = findViewById(R.id.finish_button);

        // Configurar el clic en el botón
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleFinishButtonClick();
            }
        });
    }

    private void handleFinishButtonClick() {

        if (fraseCheckBox.isChecked()) {
            Toast.makeText(this, "CheckBox seleccionado", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "CheckBox no seleccionado", Toast.LENGTH_SHORT).show();
        }


        int selectedId = radioGroup.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedId);

        if (selectedRadioButton != null) {
            String selectedText = selectedRadioButton.getText().toString();
            Toast.makeText(this, "Opción seleccionada: " + selectedText, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No se ha seleccionado ninguna opción", Toast.LENGTH_SHORT).show();
        }

        // Navegar a la MainActivity
        Intent intent = new Intent(Vista7Activity2.this,Vista8Activity2.class);
        startActivity(intent);
    }
}