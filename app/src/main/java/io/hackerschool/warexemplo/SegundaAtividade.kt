package io.hackerschool.warexemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit

class SegundaAtividade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_atividade)

        // Mostra o FragmentoExemplo no container_fragment: precisa do implementation do fragment
        supportFragmentManager.commit {
            add<FragmentoExemplo>(R.id.container_fragment)
        }

    }
}