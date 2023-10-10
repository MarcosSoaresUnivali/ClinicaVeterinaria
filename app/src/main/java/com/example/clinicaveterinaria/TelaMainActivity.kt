package com.example.clinicaveterinaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.clinicaveterinaria.fragments.ResponsavelFragment
import com.example.clinicaveterinaria.fragments.PetFragment
import com.example.clinicaveterinaria.fragments.VetFragment

lateinit var tmBtnConsultas:Button
lateinit var tmBtnClientes:Button
lateinit var tmBtnVeterinarios:Button

class TelaMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_main)

        Log.i("ciclo","ACTIVITY OnCreate")

        tmBtnConsultas = findViewById(R.id.tm_consultas)
        tmBtnClientes = findViewById(R.id.tm_clientes)
        tmBtnVeterinarios = findViewById(R.id.tm_veterinarios)

        val consultasFragment = PetFragment()
        tmBtnConsultas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentMain, consultasFragment)
                .commit()
        }
        val clientesFragment = ResponsavelFragment()
        tmBtnClientes.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentMain, clientesFragment)
                .commit()
        }
        val veterinariosFragment = VetFragment()
        tmBtnVeterinarios.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentMain, veterinariosFragment)
                .commit()
        }

    }

    override fun onStart() {
        Log.i("ciclo","ACTIVITY OnStart")
        super.onStart()
    }
    override fun onResume() {
        Log.i("ciclo","ACTIVITY OnResume")
        super.onResume()
    }
    override fun onPause() {
        Log.i("ciclo","ACTIVITY OnPause")
        super.onPause()
    }
    override fun onStop() {
        Log.i("ciclo","ACTIVITY OnStop")
        super.onStop()
    }
    override fun onDestroy() {
        Log.i("ciclo","ACTIVITY OnDestroy")
        super.onDestroy()
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("ciclo","ACTIVITY OnRestart")
    }


}

/*
//objeto para manipulação de fragments
val fragmentManager = supportFragmentManager.beginTransaction()
//codigo
fragmentManager.add(R.id.fragmentMain,ConsultasFragment())
//aplica as configurações efetuadas
fragmentManager.commit()*/
