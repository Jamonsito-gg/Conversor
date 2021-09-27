package com.example.primeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var contador = 0 // creamos una variable que inicializamos en 0

    fun contar( view : View){ //creando un metodo o funcion
        this.contador++ //llamando a la variable contador y le estamos añadiendo un +1 a su valor
        val textView = findViewById<TextView>(R.id.mensaje) //creando una variable local llamada textview donde le asignamos el componente textview con id textview
        textView.text = this.contador.toString() //a textview (variable local) acceder al atributo TEXT y le asignaremos el valor de contador pero como es INT lo convertiremos a string
    }
    fun reiniciar( view : View){
        this.contador = 0 //llamando a la variable contador y le estamos asignando 0 a su valor
        val textView = findViewById<TextView>(R.id.mensaje) //creando una variable local llamada textview donde le asignamos el componente textview con id textview
        textView.text = this.contador.toString() //a textview (variable local) acceder al atributo TEXT y le asignaremos el valor de contador pero como es INT lo convertiremos a string
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}