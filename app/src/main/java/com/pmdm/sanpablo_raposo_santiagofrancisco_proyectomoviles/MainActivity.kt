package com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding // Declarar una variable de vinculación

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) // Inflar la vista utilizando la clase de vinculacion
        val view = binding.root // Obtener una referencia a la raiz de la vista inflada

        // Establecer la vista raiz de la actividad como la vista inflada
        setContentView(view)

        //Ahora podemos acceder a las vistas directamente usando la variable de vinculación
        //binding.textView6.text = resources.getText(R.string.hello)
    }
}