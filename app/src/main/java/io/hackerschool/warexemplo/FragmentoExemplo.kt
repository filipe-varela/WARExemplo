package io.hackerschool.warexemplo

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlin.random.Random

class FragmentoExemplo : Fragment(R.layout.fragmento_exemplo) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inicialização dos elementos do UI
        val viewCor : View = view.findViewById(R.id.view_cor)
        val btnCor : Button = view.findViewById(R.id.btn_cor)

        // Quando se carrega no btnCor, altera a cor do viewCor para uma nova aleatoria
        btnCor.setOnClickListener {
            // Primeiro exemplo - sem Utils
//            viewCor.setBackgroundColor(
//                Color.rgb(
//                    Random.nextInt(0, 256),
//                    Random.nextInt(0, 256),
//                    Random.nextInt(0, 256)
//                )
//            )

            // TODO: 15/12/2021 Tornar o view persistente

            // Segundo exemplo - com Utils
            viewCor.setBackgroundColor(Utils.randomCor())
        }

    }
}