package com.autonoma.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VistaDatosActivity extends AppCompatActivity {

    TextView txtUsuario;
    TextView txtApellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_datos);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtApellido = findViewById(R.id.txtApellido);


        String usuario = getIntent().getStringExtra("usuario");
        String clave = getIntent().getStringExtra("clave");

        txtUsuario.setText(usuario);
        txtApellido.setText(clave);

    }
}
