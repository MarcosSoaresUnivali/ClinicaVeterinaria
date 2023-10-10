package com.example.clinicaveterinaria.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.clinicaveterinaria.R
import com.example.clinicaveterinaria.model.Pet

class PetAdapter(
    private val listaPet: List<Pet>
) : RecyclerView.Adapter<PetAdapter.PetViewHolder>() {

    inner class PetViewHolder(
        val itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val textNome: TextView = itemView.findViewById(R.id.ilpet_txtv_nome)
        val textRaca: TextView = itemView.findViewById(R.id.ilpet_txtv_raca)
        val textDtnasc: TextView = itemView.findViewById(R.id.ilpet_txtv_dtnasc)
        val textPeso: TextView = itemView.findViewById(R.id.ilpet_txtv_peso)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetViewHolder {
        val layoutInflater = LayoutInflater.from(
            parent.context
        )
        val itemView = layoutInflater.inflate(
            R.layout.item_lista_pet,
            parent,
            false
        )
        return PetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PetViewHolder, position: Int) {

        var pet = listaPet[position]
        holder.textNome.text = pet.nome
        holder.textRaca.text = "Raça: "+ pet.raca
        holder.textDtnasc.text = pet.dt_nasc
        holder.textPeso.text = "Peso: "+ pet.peso
    }

    override fun getItemCount(): Int {
        return listaPet.size
    }

}