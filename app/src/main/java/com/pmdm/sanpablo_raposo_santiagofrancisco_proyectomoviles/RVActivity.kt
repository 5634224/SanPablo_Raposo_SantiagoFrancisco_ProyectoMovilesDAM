package com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.databinding.ActivityMainBinding
import com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.databinding.ActivityRvactivityBinding
import com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.rvadapter.Item
import com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.rvadapter.ItemAdapter

class RVActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRvactivityBinding // Declarar una variable de vinculación
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRvactivityBinding.inflate(layoutInflater) // Inflar la vista utilizando la clase de vinculacion
        val view = binding.root // Obtener una referencia a la raiz de la vista inflada

        // Establecer la vista raiz de la actividad como la vista inflada
        setContentView(view)

        /*-- Ahora ya tenemos acceso a las vistas directamente usando la variable de vinculación --*/
        val lista = listOf(Item(R.drawable.person, "Santiago"),
            Item(R.drawable.person, "Francisco"),
            Item(R.drawable.person, "Lucas"),
            Item(R.drawable.person, "Marcos"),
            Item(R.drawable.person, "Mateo"),
            Item(R.drawable.person, "Juan"),
            Item(R.drawable.person, "Pedro"))

        // Establecer el adapter para el RecyclerView
        val adapter = ItemAdapter(lista)
        binding.rvChats.adapter = adapter
        binding.rvChats.layoutManager = LinearLayoutManager(this)
        binding.rvChats.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

    }
}