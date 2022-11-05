package com.johan.restaurante11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment : Fragment () {

    override fun onCreate(savedinstanceState: Bundle?) {
        super.onCreate(savedinstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        sevedInstancestate: Bundle?
    ): View? {
// Inflate the Layout for this fragment

        val fragmento = inflater.inflate(R.layout.fragment_detail, container, attachToRoot:false)

        var plato = requireArguments().getString("plato")
        var hora = requireArguments().getString("hora")
        var direccion = requireArguments().getString("direccion")

        var textViewPlato:TextView = fragmento.findViewById(R.id.textViewPlato)
        var textViewHora:TextView = fragmento.findViewById(R.id.textViewHora)
        var textViewDireccion:TextView = fragmento.findViewById(R.id.textViewDireccion)


        textViewPlato.text = plato
        textViewHora.text = hora
        textViewDireccion.text = direccion



        // var tarea = requireArguments().getString("tarea") .../

        return fragmento

    }
}