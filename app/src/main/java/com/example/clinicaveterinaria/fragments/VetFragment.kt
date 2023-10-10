package com.example.clinicaveterinaria.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clinicaveterinaria.R
import com.example.clinicaveterinaria.adapter.VetAdapter
import com.example.clinicaveterinaria.model.Vet

class VetFragment : Fragment() {

    private lateinit var recyclerVet:RecyclerView
    private lateinit var fvetTxtvVeterinario: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_vet, container, false)
        //Log.i("ciclo","FRAGMENT VET OnCreateView")

        var listaVets = listOf(
            Vet(1, "Renan Bruno Diego Oliveira","35062","clinico geral","renanbrunooliveira@edu.uniso.br","(67) 99203-9967"),
            Vet(2, "Clara Bárbara da Cruz","64121","dermatologista","clarabarbaradacruz@band.com.br","(63) 3973-7873"),
            Vet(3, "Heloise Cristiane Emilly Moreira","80079","clinico geral","heloisemoreira@igoralcantara.com.br","(69) 2799-7715"),
            Vet(4, "Laís Elaine Catarina Costa","62025","animais selvagens","lais-costa84@campanati.com.br","(79) 98607-4656"),
            Vet(5, "Juliana Andrea Cardoso","00491","dermatologista","juliana_cardoso@br.ibn.com","(87) 98439-9604")
        )

        recyclerVet = view.findViewById(R.id.recycler_vet)
        recyclerVet.adapter = VetAdapter(listaVets)
        recyclerVet.layoutManager = LinearLayoutManager(view.context)

        return view
    }

/*    override fun onAttach(context: Context) {
        Log.i("ciclo","FRAGMENT VET OnAttach")
        super.onAttach(context)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ciclo","FRAGMENT VET OnCreate")
        super.onCreate(savedInstanceState)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("ciclo","FRAGMENT VET OnViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.i("ciclo","FRAGMENT VET OnViewStateRestore")
        super.onViewStateRestored(savedInstanceState)
    }
    override fun onStart() {
        Log.i("ciclo","FRAGMENT VET OnStart")
        super.onStart()
    }
    override fun onResume() {
        Log.i("ciclo","FRAGMENT VET OnResume")
        super.onResume()
    }
    override fun onPause() {
        Log.i("ciclo","FRAGMENT VET OnPause")
        super.onPause()
    }
    override fun onStop() {
        Log.i("ciclo","FRAGMENT VET OnStop")
        super.onStop()
    }
    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("ciclo","FRAGMENT VET OnSaveInstanceState")
        super.onSaveInstanceState(outState)
    }
    override fun onDestroyView() {
        Log.i("ciclo","FRAGMENT VET OnDestroyView")
        super.onDestroyView()
    }
    override fun onDestroy() {
        Log.i("ciclo","FRAGMENT VET OnDestroyh")
        super.onDestroy()
    }
    override fun onDetach() {
        Log.i("ciclo","FRAGMENT VET OnDetach")
        super.onDetach()
    }*/

}