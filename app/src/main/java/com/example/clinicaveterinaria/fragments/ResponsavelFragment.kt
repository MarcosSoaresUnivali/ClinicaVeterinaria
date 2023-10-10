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
import com.example.clinicaveterinaria.adapter.RespAdapter
import com.example.clinicaveterinaria.model.Responsavel

private lateinit var fconsTxtvVeterinario: TextView

class ResponsavelFragment : Fragment() {

    private lateinit var recyclerResp: RecyclerView
    private lateinit var frespTxtvResponsavel: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_responsavel, container, false)

        var listaResp = listOf(
            Responsavel(1, "Márcia Luna Duarte", "1111111111", "marcia.luna.duarte@deere.com","(63) 2980-8765"),
            Responsavel(2, "Benício Meyer Azevedo","23101771056", "beniciomeyer@gmail.com.br","(63) 99931-8289"),
            Responsavel(3, "Ana Beatriz Albergaria Bochimpani Trindade","61426227400","anabeatriz@ohms.com.br", "(87) 2743-5198"),
            Responsavel(4, "Thiago Edson das Neves","31716341124","thiago_edson_dasneves@paulistadovale.org.br","(85) 3635-5560"),
            Responsavel(5, "Luna Cecília Alves","79107398","luna_alves@orthoi.com.br","(67) 2738-7166")
        )

        recyclerResp = view.findViewById(R.id.recycler_resp)
        recyclerResp.adapter = RespAdapter(listaResp)
        recyclerResp.layoutManager = LinearLayoutManager(view.context)

        return view
    }


    /*
    override fun onAttach(context: Context) {
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