package com.julia.firstapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.julia.firstapp.databinding.ActivityMainBinding
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnEnviar.setOnClickListener {
//            var nome = binding.edtNome.editableText.toString()
//            binding.tvNome.text = "Nome: " + nome
//
//            var anoNascimento = binding.edtIdade.editableText.toString()
//            val anoAtual = LocalDateTime.now().year
//            var idade = anoAtual - anoNascimento.toInt()
//
//            binding.tvIdade.text="Idade: +{idade}"
//
//        }
}
}