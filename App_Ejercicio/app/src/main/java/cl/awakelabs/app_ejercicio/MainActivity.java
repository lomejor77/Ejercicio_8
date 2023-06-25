package cl.awakelabs.app_ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.mainText);
        int result = calcular("1,2");
        text.setText("El resultado es: " + String.valueOf(result));
    }

    private int calcular (String numeros) {
        if(numeros.isEmpty()){
            return 0;

        }

        String[] num = numeros.split(",");
        int sum = 0;
        for(int i=0; i<num.length; i++) {
            sum += Integer.valueOf(num[i]);
        }
        return sum;
    }
}