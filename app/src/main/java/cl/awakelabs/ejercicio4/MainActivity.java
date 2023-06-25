package cl.awakelabs.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button suma = findViewById(R.id.btnSum);
        Button resta = findViewById(R.id.btnRest);
        Button multiplica = findViewById(R.id.btnMulti);
        Button divide = findViewById(R.id.btnDiv);

        EditText nUno = findViewById(R.id.numUno);
        EditText nDos = findViewById(R.id.numDos);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer uno = Integer.parseInt(nUno.getText().toString());
                Integer dos = Integer.parseInt(nDos.getText().toString());

                Integer suma = uno + dos;

                Toast.makeText(getBaseContext(), "Resultado: "+ suma, Toast.LENGTH_SHORT).show();
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        multiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}