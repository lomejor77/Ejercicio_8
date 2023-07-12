package cl.awakelabs.ejercicio4

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val suma = findViewById<Button>(R.id.btnSum)
        val resta = findViewById<Button>(R.id.btnRest)
        val multiplica = findViewById<Button>(R.id.btnMulti)
        val divide = findViewById<Button>(R.id.btnDiv)
        val nUno = findViewById<EditText>(R.id.numUno)
        val nDos = findViewById<EditText>(R.id.numDos)
        suma.setOnClickListener(View.OnClickListener {
            if (nUno.text.toString().isBlank()) {
                Toast.makeText(baseContext, "Falta algun valor", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            } else if (nDos.text.toString().isBlank()) {
                Toast.makeText(baseContext, "Falta algun valor", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val uno = nUno.text.toString().toInt()
            val dos = nDos.text.toString().toInt()
            val sumar = uno + dos
            Toast.makeText(baseContext, "Resultado: $sumar", Toast.LENGTH_SHORT).show()
        })
        resta.setOnClickListener(View.OnClickListener {
            if (nUno.text.toString().isBlank()) {
                Toast.makeText(baseContext, "Falta algun valor", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            } else if (nDos.text.toString().isBlank()) {
                Toast.makeText(baseContext, "Falta algun valor", Toast.LENGTH_LONG).show()
                return@OnClickListener
            }
            val uno = nUno.text.toString().toInt()
            val dos = nDos.text.toString().toInt()
            val restar = uno - dos
            Toast.makeText(baseContext, "Resultado: $restar", Toast.LENGTH_LONG).show()
        })
        multiplica.setOnClickListener(View.OnClickListener {
            if (nUno.text.toString().isBlank()) {
                Toast.makeText(baseContext, "Falta algun valor", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            } else if (nDos.text.toString().isBlank()) {
                Toast.makeText(baseContext, "Falta algun valor", Toast.LENGTH_LONG).show()
                return@OnClickListener
            }
            val uno = nUno.text.toString().toInt()
            val dos = nDos.text.toString().toInt()
            val multiplicar = uno * dos
            Toast.makeText(baseContext, "Resultado: $multiplicar", Toast.LENGTH_LONG).show()
        })
        divide.setOnClickListener(View.OnClickListener {
            if (nUno.text.toString().isBlank()) {
                Toast.makeText(baseContext, "Falta algun valor", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            } else if (nDos.text.toString().isBlank()) {
                Toast.makeText(baseContext, "Falta algun valor", Toast.LENGTH_LONG).show()
                return@OnClickListener
            }
            val uno = nUno.text.toString().toInt()
            val dos = nDos.text.toString().toInt()
            val dividir = uno / dos
            Toast.makeText(baseContext, "Resultado: $dividir", Toast.LENGTH_LONG).show()
        })
    }
}