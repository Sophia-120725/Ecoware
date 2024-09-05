package com.example.concienciaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button button;
    EditText usuario;
    EditText contrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.loginButton);
        usuario=findViewById(R.id.username);
        contrasena=findViewById(R.id.password);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (usuario.getText().toString().isEmpty() || contrasena.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "El usuario y contraseña deben ser validos" , Toast.LENGTH_LONG).show();
                }
                else {

                    Intent intent=new Intent(MainActivity.this,Vista1Activity.class);
                    startActivity(intent);

                }

            }
        });
    }
}