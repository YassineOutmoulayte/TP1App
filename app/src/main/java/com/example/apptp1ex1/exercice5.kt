package com.example.apptp1ex1

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class exercice5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exercice5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listePersonne= arrayListOf(hashMapOf("nom" to "ALAMI","prenom" to "mohammed","age" to "38" )
        ,hashMapOf("nom" to "alaoui","prenom" to "taha","age" to "65" )
            ,hashMapOf("nom" to "iqbal","prenom" to "imane","age" to "15" )
            ,hashMapOf("nom" to "ALAMI","prenom" to "nada","age" to "24" )
            ,hashMapOf("nom" to "sellam","prenom" to "issam","age" to "12" )
        )
        val lv=findViewById<ListView>(R.id.listviewexerice5)
        val adapter=AdapterExercice5(this,listePersonne)
        lv.adapter=adapter
    }
}