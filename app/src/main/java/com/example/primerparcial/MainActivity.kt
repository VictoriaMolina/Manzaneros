package com.example.primerparcial

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    internal lateinit var btnCinco: Button
    internal lateinit var btnQuince: Button
    internal lateinit var btnTreinta: Button
    internal lateinit var btnCincuenta: Button
    internal lateinit var txtActual: TextView
    internal lateinit var txtTotal: TextView
    internal lateinit var man1: ImageView
    internal lateinit var man2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCinco = findViewById(R.id.btnCinco)
        btnQuince = findViewById(R.id.btnQuince)
        btnTreinta = findViewById(R.id.btnTreinta)
        btnCincuenta = findViewById(R.id.btnCincuenta)
        txtActual = findViewById(R.id.txtActual)
        txtTotal = findViewById(R.id.txtTotal)
        man1 = findViewById(R.id.man1)
        man2 = findViewById(R.id.man2)

        btnCinco.setOnClickListener() {
            sumarCinco()
        }

        btnQuince.setOnClickListener() {
            sumarQuince()
        }

        btnTreinta.setOnClickListener() {
            sumarTreinta()
        }

        btnCincuenta.setOnClickListener() {
            sumarCincuenta()
        }

        man1.setOnClickListener {
            cantManzanas()
        }

        man2.setOnClickListener {
            cantManzanasActual()
        }

        btnCalcular.setOnClickListener {
            if(txtPorcentaje.text.toString() >= "70"){
                it.setBackgroundColor(Color.RED)
            }
            porcentaje()
        }

    }

    fun sumarCinco(){
        var pActual = txtActual.text.toString().toInt()
        pActual+= 5
        txtActual.setText(pActual.toString())
    }

    fun sumarQuince(){
        var pActual = txtActual.text.toString().toInt()
        pActual+= 15
        txtActual.setText(pActual.toString())
    }

    fun sumarTreinta(){
        var pActual = txtActual.text.toString().toInt()
        pActual+= 30
        txtActual.setText(pActual.toString())
    }

    fun sumarCincuenta(){
        var pActual = txtActual.text.toString().toInt()
        pActual+= 50
        txtActual.setText(pActual.toString())
    }

    fun cantManzanas(){
        var pTotal = txtTotal.text.toString().toInt()
        pTotal *= 80
        Toast.makeText(this, ("La cantidad de manzanas son: $pTotal"), Toast.LENGTH_LONG).show()
    }

    fun cantManzanasActual(){
        var pActual = txtActual.text.toString().toInt()
        pActual *= 80
        Toast.makeText(this, ("La cantidad de manzanas son: $pActual"), Toast.LENGTH_LONG).show()
    }

    fun porcentaje(){
        var pActual = txtActual.text.toString().toInt()
        var pTotal = txtTotal.text.toString().toInt()
        var porciento = (pActual * 100) / pTotal
        txtPorcentaje.setText("$porciento %")
    }

}



