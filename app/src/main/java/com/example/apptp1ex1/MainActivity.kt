package com.example.apptp1ex1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listView=findViewById<ListView>(R.id.listView)
        var names= listOf("HTML","CSS","PHP","JS","java")
                    //list view simple_list_item_1 simple
//       val Adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
                     // listView simple_list_item_single_choice avec single chocie
//        val adp=ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,names)
        val adp=ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,names)
        listView.adapter=adp
    }
}