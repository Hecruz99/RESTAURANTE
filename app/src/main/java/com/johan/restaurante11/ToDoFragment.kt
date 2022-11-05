package com.johan.restaurante11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class ToDoFragment : Fragment() {

override fun onCreate(savedinstancestate: Bundle?) {
    super.onCreate(savedinstancestate)

}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
// Inflate the Layout for this fragment
        val fragmento: View = inflater.inflate(R.layout.fragment_to_do, container, attachToRoot: false)

        val detail1: Button = fragmento. findViewById(R.id.btn_detail_1)
        val detail2: Button = fragmento. findViewById(R.id.btn_detail_2)
        val detail3: Button = fragmento. findViewById(R.id.btn_detail_3)

        detail1.setOnClickListener(view.OnClickListener {  it: View!

            val datos = Bundle()
            datos.putString("plato", resources.getString(R. string. txt_plato1))
            datos.putString("hora", "10:30")
            datos.putString("direccion", "Bogota Restrepo call 77 # 24 - 32")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view_tag, DetailFragment::class.java, datos, tag: “detail")
                ?.addToBackStack( name: "")
                ?.commit()


        })

        detail1.setOnClickListener(view.OnClickListener { it: View!
            val datos = Bundle()
            datos.putString("plato", resources.getString(R. string. txt_plato2))
            datos.putString("hora", "11:45")
            datos.putString("direccion", "Bogota Kennedy calle 77 # 24 - 32")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view_tag, DetailFragment::class.java, datos, tag: “detail")
                ?.addToBackStack( name: "")
                ?.commit()
        })

        detail1.setOnClickListener(view.OnClickListener {  it: View!
            val datos = Bundle()
            datos.putString("plato", resources.getString(R. string. txt_plato3))
            datos.putString("hora", "13:00")
            datos.putString("direccion", "Bogota Usaquen calle 77 # 24 - 32")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view_tag, DetailFragment::class.java, datos, tag: “detail")
                ?.addToBackStack( name: "")
                ?.commit()
        })
            / val detail: Button = fragmento.findViewById(R.id.btn_detail_1) .../



        return fragmento

    }
}