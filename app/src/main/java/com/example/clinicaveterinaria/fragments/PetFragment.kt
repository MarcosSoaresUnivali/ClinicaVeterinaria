package com.example.clinicaveterinaria.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clinicaveterinaria.R
import com.example.clinicaveterinaria.adapter.PetAdapter
import com.example.clinicaveterinaria.model.Pet

class PetFragment : Fragment() {

    private lateinit var recyclerPet:RecyclerView
    private lateinit var fpetTxtvPet:TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_pet, container, false)
        //Log.i("ciclo","FRAGMENT PET OnCreateView")

        var listaPets = listOf(
            Pet(10,"Bombom","Shitzu",5f,"2015-03-05",1),
            Pet(1, "Mike","pincher",12f, "2010-12-20",1),
            Pet(2, "Nike","pincher",20f, "2010-12-20",1),
            Pet(3, "Bombom","shitzu",10f, "2022-07-15",2),
            Pet(4, "Niro","pastor alemao",70f,"2018-10-12",3),
            Pet(5, "Milorde","doberman",30f,"2019-11-16",4),
            Pet(6, "Laide","coker spaniel",40f,"2018-02-27",4),
            Pet(7, "Lorde","dogue alemão", 80f,"2019-05-15",4),
            Pet(8, "Joe","indefinido", 50f,"2020-01-01",5),
            Pet(9, "Felicia","indefinido",5f,"2017-06-07",5)
        )

        recyclerPet = view.findViewById(R.id.recycler_pet)
        recyclerPet.adapter = PetAdapter(listaPets)
        recyclerPet.layoutManager = LinearLayoutManager(view.context)

        return view
    }

 /*   override fun onAttach(context: Context) {
        Log.i("ciclo","FRAGMENT PET OnAttach")
        super.onAttach(context)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ciclo","FRAGMENT PET OnCreate")
        super.onCreate(savedInstanceState)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("ciclo","FRAGMENT PET OnViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.i("ciclo","FRAGMENT PET OnViewStateRestore")
        super.onViewStateRestored(savedInstanceState)
    }
    override fun onStart() {
        Log.i("ciclo","FRAGMENT PET OnStart")
        super.onStart()
    }
    override fun onResume() {
        Log.i("ciclo","FRAGMENT PET OnResume")
        super.onResume()
    }
    override fun onPause() {
        Log.i("ciclo","FRAGMENT PET OnPause")
        super.onPause()
    }
    override fun onStop() {
        Log.i("ciclo","FRAGMENT PET OnStop")
        super.onStop()
    }
    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("ciclo","FRAGMENT PET OnSaveInstanceState")
        super.onSaveInstanceState(outState)
    }
    override fun onDestroyView() {
        Log.i("ciclo","FRAGMENT PET OnDestroyView")
        super.onDestroyView()
    }
    override fun onDestroy() {
        Log.i("ciclo","FRAGMENT PET OnDestroyh")
        super.onDestroy()
    }
    override fun onDetach() {
        Log.i("ciclo","FRAGMENT PET OnDetach")
        super.onDetach()
    }*/

}