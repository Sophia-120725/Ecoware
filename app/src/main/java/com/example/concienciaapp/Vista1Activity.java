package com.example.concienciaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Vista1Activity extends AppCompatActivity {

    private TextView titulo, impactoResumen;
    private CheckBox cambio;
    private RadioGroup radiog;
    private RadioButton radioButtonTala, radioButtonGases, radioButtonContaminacion;
    private Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista1);

        titulo = findViewById(R.id.titulo);
        impactoResumen = findViewById(R.id.impacto_resumen);
        cambio = findViewById(R.id.cambio);
        radiog = findViewById(R.id.radiog);
        radioButtonTala = findViewById(R.id.radiog_tala);
        radioButtonGases = findViewById(R.id.radiog_gases);
        radioButtonContaminacion = findViewById(R.id.radiog_contaminacion);
        finishButton = findViewById(R.id.finish_button);


        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder result = new StringBuilder();
                result.append("Checkbox: ").append(cambio.isChecked() ? "Checked" : "Unchecked").append("\n");


                int selectedId = radiog.getCheckedRadioButtonId();
                if (selectedId == radioButtonTala.getId()) {
                    result.append("Respuesta: Tala de arboles");
                } else if (selectedId == radioButtonGases.getId()) {
                    result.append("Respuesta: Gases de efecto invernadero");
                } else if (selectedId == radioButtonContaminacion.getId()) {
                    result.append("Respuesta: Contaminación");
                } else {
                    result.append("Respuesta: Contaminacion");
                }


                System.out.println(result);
                Intent intent=new Intent(Vista1Activity.this,Vista2Activity2.class);
                startActivity(intent);

            }
        });
    }
}