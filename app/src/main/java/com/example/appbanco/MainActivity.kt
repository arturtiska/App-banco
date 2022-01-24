package com.example.appbanco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
     private lateinit var rvList: RecyclerView
     private lateinit var adapter: menuItemAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItemLista()
    }

    private fun iniciaViews(){
        rvList = findViewById(R.id.rv_List)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }

    private fun setItemLista(){
        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                    "Cartões"
                ),
                MenuItemModel(
                    "Meus Comprovantes"
                ),
                MenuItemModel(
                    "Investimentos"
                ),
                MenuItemModel(
                    "Portabilidade de Salarios"
                ),
                MenuItemModel(
                    "Cartões"
                ),
                MenuItemModel(
                    "Meus Comprovantes"
                ),
                MenuItemModel(
                    "Investimentos"
                ),
                MenuItemModel(
                    "Portabilidade de Salarios"
                )
            )
        )

    }
}
