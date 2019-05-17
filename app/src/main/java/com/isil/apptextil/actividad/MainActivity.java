package com.isil.apptextil.actividad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.isil.apptextil.R;
import com.isil.apptextil.entidad.trabajador;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.txt);

        trabajador empleado=new trabajador("001","juan","perez","gerencia");
        txt.setText(empleado.MostrarInfo());
    }
}
