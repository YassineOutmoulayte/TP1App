package com.example.apptp1ex1

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class AdapterExercice5(val context: Context,val liste:ArrayList<HashMap<String,String>>):BaseAdapter() {
    override fun getCount(): Int {
        return liste.size
    }

    override fun getItem(position: Int): Any {
        return liste[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view=convertView?: LayoutInflater.from(context).inflate(R.layout.form_exercice5,parent,false)
        var textNom=view.findViewById<TextView>(R.id.nom)
        var textAge=view.findViewById<TextView>(R.id.age)
        var textPrenom=view.findViewById<TextView>(R.id.prenom)
        var personne=liste[position]
         textNom.text=personne["nom"]
        textPrenom.text=personne["prenom"]
        textAge.text=personne["age"]
        if(personne["age"]!!.toInt()<18){
          textNom.setTextColor(Color.parseColor("#ff0000"))
        }else{
            textNom.setTextColor(Color.parseColor("#6495ed"))
        }
        return view
    }
}
