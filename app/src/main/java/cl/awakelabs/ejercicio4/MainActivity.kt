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
                if (nUno.getText().toString().isBlank()) {
                    Toast.makeText(getBaseContext(), "Falta algun valor", Toast.LENGTH_SHORT).show();
                    return;
                } else if (nDos.getText().toString().isBlank()) {
                    Toast.makeText(getBaseContext(), "Falta algun valor", Toast.LENGTH_SHORT).show();
                    return;
                }

                Integer uno = Integer.parseInt(nUno.getText().toString());
                Integer dos = Integer.parseInt(nDos.getText().toString());

                Integer sumar = uno + dos;

                Toast.makeText(getBaseContext(), "Resultado: "+ sumar, Toast.LENGTH_SHORT).show();
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nUno.getText().toString().isBlank()) {
                    Toast.makeText(getBaseContext(), "Falta algun valor", Toast.LENGTH_SHORT).show();
                    return;
                } else if (nDos.getText().toString().isBlank()) {
                    Toast.makeText(getBaseContext(), "Falta algun valor", Toast.LENGTH_LONG).show();
                    return;
                }
                Integer uno = Integer.parseInt(nUno.getText().toString());
                Integer dos = Integer.parseInt(nDos.getText().toString());

                Integer restar = uno - dos;

                Toast.makeText(getBaseContext(), "Resultado: "+ restar, Toast.LENGTH_LONG).show();

            }
        });

        multiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nUno.getText().toString().isBlank()) {
                    Toast.makeText(getBaseContext(), "Falta algun valor", Toast.LENGTH_SHORT).show();
                    return;
                } else if (nDos.getText().toString().isBlank()) {
                    Toast.makeText(getBaseContext(), "Falta algun valor", Toast.LENGTH_LONG).show();
                    return;
                }
                Integer uno = Integer.parseInt(nUno.getText().toString());
                Integer dos = Integer.parseInt(nDos.getText().toString());

                Integer multiplicar = uno * dos;

                Toast.makeText(getBaseContext(), "Resultado: "+ multiplicar, Toast.LENGTH_LONG).show();


            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nUno.getText().toString().isBlank()) {
                    Toast.makeText(getBaseContext(), "Falta algun valor", Toast.LENGTH_SHORT).show();
                    return;
                } else if (nDos.getText().toString().isBlank()) {
                    Toast.makeText(getBaseContext(), "Falta algun valor", Toast.LENGTH_LONG).show();
                    return;
                }
                Integer uno = Integer.parseInt(nUno.getText().toString());
                Integer dos = Integer.parseInt(nDos.getText().toString());

                Integer dividir = uno / dos;

                Toast.makeText(getBaseContext(), "Resultado: "+ dividir, Toast.LENGTH_LONG).show();

            }
        });

    }
}