package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val nome = findViewById<TextView>(R.id.nome)
//        nome.setText("Cesta de frutas")
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.setText("Laranja, manga, maçã")
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.setText("R$ 19.99")
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "teste",
                    descricao = "test desc",
                    valor = BigDecimal("19.99")
                ), Produto(
                    nome = "teste 1",
                    descricao = "test desc1",
                    valor = BigDecimal("29.99")
                ), Produto(
                    nome = "teste 2",
                    descricao = "test desc2",
                    valor = BigDecimal("39.99")
                )
            )
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}