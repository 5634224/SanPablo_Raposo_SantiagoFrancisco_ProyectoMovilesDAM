package com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding // Declarar una variable de vinculación

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) // Inflar la vista utilizando la clase de vinculacion
        val view = binding.root // Obtener una referencia a la raiz de la vista inflada

        // Establecer la vista raiz de la actividad como la vista inflada
        setContentView(view)

        /*-- Ahora ya tenemos acceso a las vistas directamente usando la variable de vinculación --*/
        // Establecer el listener para el boton de login
        binding.btnSignIn.setOnClickListener { handleSingInClick(it) }

        // Establecer el listener para el boton de registro
        binding.btnRegistro.setOnClickListener { handleRegistroClick(it) }

        // Establecer el listener para el boton de "Olvidaste tu contraseña?"
        binding.tvOlvidasteContrasena.setOnClickListener { handleTvOlvidasteContrasenaClick(it) }

        // Establecer el listener para el boton de login Facebook
        binding.btnLoginFacebook.setOnClickListener { handleLoginFacebookClick(it) }

        // Establecer el listener para el boton de login Google
        binding.btnLoginGoogle.setOnClickListener { handleLoginGoogleClick(it) }
    }
    private fun handleSingInClick(it: View) {
        // Comprobar que el campo de usuario no este vacio

        if (binding.txtUsuario.text.toString().isEmpty()) {
            binding.txtUsuario.error = "El campo usuario no puede estar vacio"
        }
        // Comprobar que el campo de contraseña no este vacio
        if (binding.txtContrasena.text.toString().isEmpty()) {
            binding.txtContrasena.error = "El campo contraseña no puede estar vacio"
        }

        Snackbar.make(binding.root, "Usuario: " + binding.txtUsuario.text.toString() + " Contraseña: " + binding.txtContrasena.text.toString(), Snackbar.LENGTH_LONG).show()

        // Comprobar que el campo de usuario no este vacio
        if (binding.txtUsuario.text.toString().isNotEmpty() && binding.txtContrasena.text.toString().isNotEmpty()) {
            val intent: Intent = Intent(this, RVActivity::class.java)
            startActivity(intent)
        }
    }

    private fun handleRegistroClick(it: View?) {
        val intent: Intent = Intent(this, FormularioActivity::class.java)
        startActivity(intent)
    }

    private fun handleTvOlvidasteContrasenaClick(it: View?) {
        val intent: Intent = Intent(this, ContactoActivity::class.java)
        startActivity(intent)
    }

    private fun handleLoginFacebookClick(it: View) {
        var snack = Snackbar.make(binding.root, "Facebook", Snackbar.LENGTH_LONG)

        snack.setAction("Cerrar") {
            snack.dismiss()
        }

        snack.show()
    }

    private fun handleLoginGoogleClick(it: View) {
        var snack = Snackbar.make(binding.root, "Google", Snackbar.LENGTH_LONG)

        snack.setAction("Cerrar") {
            snack.dismiss()
        }

        snack.show()
    }
}