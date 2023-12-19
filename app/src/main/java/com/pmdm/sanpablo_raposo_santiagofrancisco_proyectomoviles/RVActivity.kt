package com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.databinding.ActivityMainBinding
import com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.databinding.ActivityRvactivityBinding

class RVActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRvactivityBinding // Declarar una variable de vinculación
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRvactivityBinding.inflate(layoutInflater) // Inflar la vista utilizando la clase de vinculacion
        val view = binding.root // Obtener una referencia a la raiz de la vista inflada

        // Establecer la vista raiz de la actividad como la vista inflada
        setContentView(view)

        /*-- Ahora ya tenemos acceso a las vistas directamente usando la variable de vinculación --*/

    }
}