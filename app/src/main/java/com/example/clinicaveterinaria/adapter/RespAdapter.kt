package com.example.clinicaveterinaria.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.clinicaveterinaria.R
import com.example.clinicaveterinaria.model.Responsavel

class RespAdapter(
    private val listaResp: List<Responsavel>
) : RecyclerView.Adapter<RespAdapter.RespViewHolder>() {

    inner class RespViewHolder(
        val itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val textNome: TextView = itemView.findViewById(R.id.ilresp_txtv_nome)
        val textCod: TextView = itemView.findViewById(R.id.ilresp_txtv_cod)
        val textCpf: TextView = itemView.findViewById(R.id.ilresp_txtv_cpf)
        val textFone: TextView = itemView.findViewById(R.id.ilresp_txtv_fone)
        val textEmail: TextView = itemView.findViewById(R.id.ilresp_txtv_email)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RespViewHolder {
        val layoutInflater = LayoutInflater.from(
            parent.context
        )
        val itemView = layoutInflater.inflate(
            R.layout.item_lista_resp,
            parent,
            false
        )
        return RespViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RespViewHolder, position: Int) {

        var vet = listaResp[position]
        holder.textNome.text = vet.nome
        holder.textCod.text = "Cod.: "+ vet.codigo
        holder.textCpf.text = vet.cpf
        holder.textFone.text = "Fone: "+ vet.fone
        holder.textEmail.text = vet.email
    }

    override fun getItemCount(): Int {
        return listaResp.size
    }

}