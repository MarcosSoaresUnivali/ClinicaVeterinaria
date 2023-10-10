package com.example.clinicaveterinaria.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.clinicaveterinaria.R
import com.example.clinicaveterinaria.model.Vet

class VetAdapter(
    private val listaVet: List<Vet>
) : RecyclerView.Adapter<VetAdapter.VetViewHolder>() {

    inner class VetViewHolder(
        val itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val textNome: TextView = itemView.findViewById(R.id.ilvet_txtv_nome)
        val textCod: TextView = itemView.findViewById(R.id.ilvet_txtv_cod)
        val textCrmv: TextView = itemView.findViewById(R.id.ilvet_txtv_crmv)
        val textEsp: TextView = itemView.findViewById(R.id.ilvet_txtv_esp)
        val textFone: TextView = itemView.findViewById(R.id.ilvet_txtv_fone)
        val textEmail: TextView = itemView.findViewById(R.id.ilvet_txtv_email)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VetViewHolder {
        val layoutInflater = LayoutInflater.from(
            parent.context
        )
        val itemView = layoutInflater.inflate(
            R.layout.item_lista_vet,
            parent,
            false
        )
        return VetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: VetViewHolder, position: Int) {

        var vet = listaVet[position]
        holder.textNome.text = vet.nome
        holder.textCod.text = "Cod.: "+ vet.codigo
        holder.textCrmv.text = vet.crmv
        holder.textEsp.text = vet.especialidade
        holder.textFone.text = "Fone: "+ vet.fone
        holder.textEmail.text = vet.email
    }

    override fun getItemCount(): Int {
        return listaVet.size
    }

}