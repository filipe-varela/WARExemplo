package io.hackerschool.warexemplo

import android.graphics.Color
import kotlin.random.Random

class Utils {

    companion object {
        /**
         * Returna uma cor aleatoria
         */
        fun randomCor() : Int {
            return Color.rgb(
                    Random.nextInt(0, 256),
                    Random.nextInt(0, 256),
                    Random.nextInt(0, 256)
            )
        }
    }

}
