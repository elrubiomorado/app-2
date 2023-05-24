package avila.gonzalez.tiendas

import java.util.UUID

data class Tienda(
    val id: UUID,
    val nombre:String,
    val telefono:String
)
