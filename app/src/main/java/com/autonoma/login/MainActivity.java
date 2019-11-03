package com.autonoma.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText etUsuario;
    EditText etClave;
    Button btnValidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = findViewById(R.id.etUsuario);
        etClave = findViewById(R.id.etClave);
        btnValidar = findViewById(R.id.btnValidar);
       //
   btnValidar.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           //
           if(etUsuario.getText().toString().equals("jhudith") && etClave.getText().toString().equals("egocheaga")) {

               // vamos a la pantalla de datos
               Intent intent = new Intent(MainActivity.this, VistaDatosActivity.class);
               //
               String usuario= etUsuario.getText().toString();
               String clave = etClave.getText().toString();


               //enviamos el nombre a la siguiente pantalla
               intent.putExtra( "usuario",usuario);
               intent.putExtra( "clave", clave);

               startActivity(intent);

           } else {
               Toast.makeText( MainActivity.this, "usuaro o contraseña incorreta ",  Toast.LENGTH_LONG).show();
           }



       }
   });


    }
}
