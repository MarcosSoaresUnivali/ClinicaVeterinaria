package com.example.clinicaveterinaria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

lateinit var caduBtnCancelar:Button
lateinit var caduBtnCadastrar:Button
lateinit var caduTxtiNome:TextInputEditText
lateinit var caduTxtiEmail:TextInputEditText
lateinit var caduTxtiSenha:TextInputEditText
lateinit var caduTxtiTelefone:TextInputEditText


class CadastroUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_user)

        caduBtnCancelar = findViewById(R.id.cadu_btn_cancelar)
        caduBtnCadastrar = findViewById(R.id.cadu_btn_cadastrar)
        caduTxtiNome = findViewById(R.id.cadu_itxt_nome)
        caduTxtiEmail = findViewById(R.id.cadu_itxt_email)
        caduTxtiSenha = findViewById(R.id.cadu_itxt_senha)
        caduTxtiTelefone = findViewById(R.id.cadu_itxt_fone)

        caduBtnCadastrar.setOnClickListener {
            //criando intent e instanciando
            val intent = Intent(this, TelaUsuarioActivity::class.java)
            //criando usuario java
            val user1 = UsuarioKotlin(caduTxtiNome.text.toString(), caduTxtiEmail.text.toString(),
                caduTxtiSenha.text.toString(), caduTxtiTelefone.text.toString())

            //enviado usuário
            intent.putExtra("user1", user1)
            //iniciando activity
            startActivity(intent)
        }

        caduBtnCancelar.setOnClickListener {
            finish()
        }

    }

    override fun onRestart() {
        super.onRestart()
        caduTxtiNome = findViewById(R.id.cadu_itxt_nome)
        caduTxtiEmail = findViewById(R.id.cadu_itxt_email)
        caduTxtiSenha = findViewById(R.id.cadu_itxt_senha)
        caduTxtiTelefone = findViewById(R.id.cadu_itxt_fone)
        caduTxtiNome.setText("")
        caduTxtiEmail.setText("")
        caduTxtiSenha.setText("")
        caduTxtiTelefone.setText("")
    }
}