package com.JMiranda.convertidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selectedTemp = findViewById<Spinner>(R.id.Convert_Options)
        var temp = findViewById<EditText>(R.id.Temperature)
        var Button = findViewById<Button>(R.id.Convert_Button)
        var result = findViewById<TextView>(R.id.Temperature_Final)

        if(selectedTemp != null){
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                resources.getStringArray(R.array.Convert_Options)
            )
        }

        Button.setOnClickListener {
            temp.text
        }

    }
    fun convert(){
        //Crear las conersiones
        //tarea: Traer las formulas de conversion

    }
}