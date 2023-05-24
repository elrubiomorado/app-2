package avila.gonzalez.tiendas

import androidx.lifecycle.ViewModel
import java.util.*

class TiendaListViewModel: ViewModel() {
    val tiendas = mutableListOf<Tienda>()

    init {
        for (i in 0 until 100){
            val tienda = Tienda(
                id = UUID.randomUUID(),
                nombre = "Tienda #${i}",
                telefono = "${i}"
            )
            tiendas += tienda
        }
    }
}