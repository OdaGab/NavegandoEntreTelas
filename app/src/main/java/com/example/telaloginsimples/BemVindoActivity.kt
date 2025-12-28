package com.example.telaloginsimples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class BemVindoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)

        // Encontra a Toolbar pelo ID e a define como a ActionBar da tela
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Ativa a Action Bar com o botão "Up"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}