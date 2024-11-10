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

class exercice2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.exercice2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val lv = findViewById<ListView>(R.id.listViewExercice2)
        val btn = findViewById<Button>(R.id.buttonexercice3)
        val btnRoutour=findViewById<Button>(R.id.exercice1)

        val langProgramming = hashMapOf(
            R.drawable.java to Pair("java", 1995),
            R.drawable.html to Pair("html", 1975),
            R.drawable.kotlin to Pair("kotlin", 1995),
            R.drawable.php to Pair("php", 1998)
        )
        val test: Map<Int, Pair<String, Int>> = langProgramming
        val langueProgrammation = langProgramming.map { e ->
            mapOf(
                "icon" to e.key,
                "nom" to e.value.first,
                "annee" to e.value.second
            )
        }
        val adapter = SimpleAdapter(
            this, langueProgrammation, R.layout.form_exercice2, arrayOf("icon", "nom", "annee"),
            intArrayOf(R.id.icon, R.id.nomLange, R.id.annee)
        )
        lv.adapter = adapter
        btnRoutour.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
        btn.setOnClickListener {
            val intent = Intent(this, exercice3::class.java).also {
                startActivity(it)
            }
        }
    }
}