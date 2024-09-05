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

public class Vista2Activity2 extends AppCompatActivity {

    private TextView titulo3, reciclajeResumen;
    private CheckBox frase;
    private RadioGroup radiog;
    private RadioButton radioButtonPlastico, radioButtonVidrio, radioButtonPapel;
    private Button finishButton;
    private Button anteriorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista22);


        titulo3 = findViewById(R.id.titulo3);
        reciclajeResumen = findViewById(R.id.reciclaje_resumen);
        frase = findViewById(R.id.frase);
        radiog = findViewById(R.id.radiog);
        anteriorButton=findViewById(R.id.retroceder);

        radioButtonPlastico = new RadioButton(this); // crear instancia de RadioButton
        radioButtonVidrio = new RadioButton(this);
        radioButtonPapel = new RadioButton(this);


        finishButton = findViewById(R.id.finish_button);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Recolectar información de UI
                StringBuilder result = new StringBuilder();
                result.append("Checkbox: ").append(frase.isChecked() ? "Checked" : "Unchecked").append("\n");

                // Captura la opción seleccionada del RadioGroup
                int selectedId = radiog.getCheckedRadioButtonId();
                if (selectedId == radioButtonPlastico.getId()) {
                    result.append("Respuesta: Plástico");
                } else if (selectedId == radioButtonVidrio.getId()) {
                    result.append("Respuesta: Vidrio");
                } else if (selectedId == radioButtonPapel.getId()) {
                    result.append("Respuesta: Papel");
                } else {
                    result.append("Respuesta: Ninguna seleccionada");
                }


                System.out.println(result);
                Intent intent=new Intent(Vista2Activity2.this, Vista3Activity2.class);
                startActivity(intent);
            }

        });
        anteriorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Vista2Activity2.this, Vista1Activity.class);
                startActivity(intent);
            }
        });
    }
}