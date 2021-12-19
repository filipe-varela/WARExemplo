package io.hackerschool.warexemplo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var mudarTexto = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instanciar os elementos do layout
        val txtView : TextView = findViewById(R.id.txt_menu)
        val btnView : Button = findViewById(R.id.btn_menu)
        val btnAtividade : Button = findViewById(R.id.btn_atividade)

        // Instanciar o SharedPreferences e atribuir o valor salvo para o txtView
        val sharedPrefs = getSharedPreferences("CONSTANT_KEY", Context.MODE_PRIVATE)
        txtView.text = sharedPrefs.getString("Texto", "Hello World!")

        // todo botão para dar reset aos dados guardados

        // Quando se carrega no btnView
        btnView.setOnClickListener {
            // Troca o texto atual por um novo
            if (mudarTexto) {
                txtView.text = "HackerSchool rocks!"
            } else {
                txtView.text = resources.getText(R.string.txt_alternative)
            }
            mudarTexto = mudarTexto.not()

            // Salvar o texto atual do txtView no sharedPrefs
            // sharedPrefs.edit().putString("Texto", txtView.text.toString()).apply()
            val editor = sharedPrefs.edit()
            editor.putString("Texto", txtView.text.toString())
            editor.apply()
        }

        // Quando se carrega no btnActivity, inicia-se uma nova atividade - SegundaAtividade -
        // com uma Toast
        btnAtividade.setOnClickListener {
            val mudarAtividade = Intent(this, SegundaAtividade::class.java)
            Toast.makeText(this, "Iniciar atividade", Toast.LENGTH_SHORT).show()
            startActivity(mudarAtividade)
        }
    }
}