package com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles

import android.content.Intent
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

        // Establecer el listener para el boton de login Facebook
        binding.btnLoginFacebook.setOnClickListener {
            val intent: Intent = Intent(this, ContactoActivity::class.java)
            startActivity(intent)
        }

        // Establecer el listener para el boton de login Google
        binding.btnLoginGoogle.setOnClickListener {
            val intent: Intent = Intent(this, RVActivity::class.java)
            startActivity(intent)
        }

        // Gestiona validacion de errores del formulario de login
        binding.btnSignIn.setOnClickListener { handleSingInClick() }
    }

    private fun handleSingInClick() {
        // Comprobar que el campo de usuario no este vacio
        if (binding.txtUsuario.text.toString().isEmpty()) {
            binding.txtUsuario.error = "El campo usuario no puede estar vacio"
        }
        // Comprobar que el campo de contraseña no este vacio
        if (binding.txtContrasena.text.toString().isEmpty()) {
            binding.txtContrasena.error = "El campo contraseña no puede estar vacio"
        }
        // Comprobar que el campo de usuario no este vacio
        if (binding.txtUsuario.text.toString().isNotEmpty() && binding.txtContrasena.text.toString().isNotEmpty()) {
            val intent: Intent = Intent(this, RVActivity::class.java)
            startActivity(intent)
        }
    }
}