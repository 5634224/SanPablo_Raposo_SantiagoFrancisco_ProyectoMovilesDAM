package com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.databinding.ActivityContactoBinding
import com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.databinding.ActivityFormularioBinding

class ContactoActivity : AppCompatActivity() {

    private lateinit var binding : ActivityContactoBinding // Declarar una variable de vinculación
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContactoBinding.inflate(layoutInflater) // Inflar la vista utilizando la clase de vinculacion
        val view = binding.root // Obtener una referencia a la raiz de la vista inflada

        // Establecer la vista raiz de la actividad como la vista inflada
        setContentView(view)

        /*-- Ahora ya tenemos acceso a las vistas directamente usando la variable de vinculación --*/

    }
}