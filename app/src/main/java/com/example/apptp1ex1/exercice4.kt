package com.example.apptp1ex1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class exercice4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exercice4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val lv = findViewById<ListView>(R.id.listviewexerice4)
        val btn = findViewById<Button>(R.id.buttonexercice5)
        val btnRoutour=findViewById<Button>(R.id.exercice4)
        val listPays = listOf(
            mapOf("Pays" to "Palestin", "Capitale" to "Al-qods", "Continent" to "Asie"),
            mapOf("Pays" to "Albanie", "Capitale" to "Tirana", "Continent" to "Europe"),
            mapOf("Pays" to "Algerie", "Capitale" to "alger", "Continent" to "Afrique"),
            mapOf("Pays" to "Afghanistan", "Capitale" to "Kaboul", "Continent" to "Asie"),
            mapOf("Pays" to "Andorre", "Capitale" to "Andorre-la-vielle", "Continent" to "Europe"),
            mapOf("Pays" to "Angola", "Capitale" to "Luanda", "Contient" to "Afrique"),
            mapOf("Pays" to "Argentine", "Capitale" to "Buenos Aires ", "Continent" to "Afrique"),
            mapOf("Pays" to "Maroc", "Capitale" to "Rabat", "Continent" to "Afrique")
        )
        val adapter = SimpleAdapter(
            this, listPays, R.layout.form_exercice4, arrayOf("Pays", "Capitale", "Continent"),
            intArrayOf(R.id.pays, R.id.capitale, R.id.continent)
        )
        lv.adapter = adapter
        btn.setOnClickListener {
            val intent = Intent(this, exercice5::class.java).also {
                startActivity(it)
            }
        }
        btnRoutour.setOnClickListener {
            val intent = Intent(this, exercice4::class.java).also {
                startActivity(it)
            }
        }
    }
}