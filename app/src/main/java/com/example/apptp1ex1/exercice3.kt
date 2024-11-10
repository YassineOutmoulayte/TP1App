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

class exercice3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exercice3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val lv = findViewById<ListView>(R.id.affichage)
        val btn = findViewById<Button>(R.id.buttonexercice4)
        val btnRoutour = findViewById<Button>(R.id.exercice2)
        val listPays = listOf(
            mapOf("pays" to "palestin", "monnaie" to "pound", "codeIso" to "PP"),
            mapOf("pays" to "algerie", "monnaie" to "dinar", "codeIso" to "DZD"),
            mapOf("pays" to "afghanistan", "monnaie" to "afghan", "codeIso" to "AFN"),
            mapOf("pays" to "arabieSaoudite", "monnaie" to "ryal saoudien", "codeIso" to "SAR"),
            mapOf("pays" to "belqique", "monnaie" to "euro", "codeIso" to "eur"),
            mapOf("pays" to "benin", "monnaie" to "france CFA", "codeIso" to "XOF"),
            mapOf("pays" to "bresin", "monnaie" to "real bresilien ", "codeIso" to "BRL"),
            mapOf("pays" to "Cote d'lvoire", "monnaie" to "franca CFA", "codeIso" to "XOF")
        )
        val adapter = SimpleAdapter(
            this, listPays, R.layout.form_exercice3, arrayOf("pays", "monnaie", "codeIso"),
            intArrayOf(R.id.pays, R.id.Monnaie, R.id.codeIso)
        )
        lv.adapter = adapter
        btn.setOnClickListener {
            Intent(this, exercice4::class.java).also {
                    startActivity(it)
            }
        }
        btnRoutour.setOnClickListener {
            Intent(this, exercice2::class.java).also {
                startActivity(it)
            }
        }
    }
}
