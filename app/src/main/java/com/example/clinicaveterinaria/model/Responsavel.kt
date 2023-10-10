package com.example.clinicaveterinaria.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Responsavel(
    var codigo: Int,
    var nome: String,
    var cpf: String,
    var email: String,
    var fone: String
) : Parcelable
