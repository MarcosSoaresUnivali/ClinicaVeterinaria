package com.example.clinicaveterinaria.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Vet(
    var codigo: Int,
    var nome: String,
    var crmv: String,
    var especialidade: String,
    var email: String,
    var fone: String
) : Parcelable
