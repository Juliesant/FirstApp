package com.julia.firstapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.julia.firstapp.databinding.ActivityMainBinding
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(binding.fragmentContainerView.id) as NavHostFragment
         navController = navHostFragment.navController
         appBarConfiguration = AppBarConfiguration(navController.graph)
        binding.toolbar.setupWithNavController(navController, appBarConfiguration)

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