package avila.gonzalez.tiendas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import avila.gonzalez.tiendas.databinding.FragmentTiendaBinding
import java.util.*

class TiendaFragment : Fragment() {

    private lateinit var tienda: Tienda
    private var _binding:FragmentTiendaBinding?=null
    private val binding
    get()= checkNotNull(_binding){
        "No puedo acceder al binding porque es nulo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tienda = Tienda(
            UUID.randomUUID(),
            "",
            ""
        )
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTiendaBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            nombreTienda.doOnTextChanged { text, _, _, _ ->
                tienda = tienda.copy(nombre = text.toString())
            }
            telefonoTienda.doOnTextChanged { text, _, _, _ ->
                tienda = tienda.copy(telefono = text.toString())
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}