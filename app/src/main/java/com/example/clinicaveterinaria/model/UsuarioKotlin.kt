package com.example.clinicaveterinaria

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UsuarioKotlin(
    var nome: String,
    var email: String,
    var senha: String,
    var telefone: String
) : Parcelable