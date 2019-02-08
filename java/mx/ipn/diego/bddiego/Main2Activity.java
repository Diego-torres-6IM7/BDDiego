package mx.ipn.diego.bddiego;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView dato;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        dato = (TextView) findViewById(R.id.nombre);

        Bundle andross = new Bundle();
        andross = this.getIntent().getExtras();

        nombre = andross.getString("nombre");

        dato.setText("Tu Nombre:\n"+nombre);


    }
}
