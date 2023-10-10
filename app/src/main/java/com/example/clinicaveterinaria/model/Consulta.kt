package com.example.clinicaveterinaria.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Consulta(
    var codigo: Int,
    var data: String,
    var horario: String,
    var cod_pet: Int,
    var cod_vet: Int
) : Parcelable
