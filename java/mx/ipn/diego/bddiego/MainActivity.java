package mx.ipn.diego.bddiego;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nombre);



    }

    public void guardarBD(View t) {
        Intent envia = new Intent(this,Main2Activity.class);
        Bundle datos = new Bundle();
        datos.putString("nombre", nombre.getText().toString().trim());
        envia.putExtras(datos);
        finish();
        startActivity(envia);
    }

    public void guardarBD2(View t) {
        Intent envia = new Intent(this,Main2Activity.class);
        Bundle datos = new Bundle();
        datos.putString("nombre", nombre.getText().toString().trim());
        envia.putExtras(datos);
        finish();
        startActivity(envia);
    }
}
