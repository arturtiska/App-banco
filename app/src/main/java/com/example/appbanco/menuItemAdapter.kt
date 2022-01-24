package com.example.appbanco

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class menuItemAdapter : RecyclerView.Adapter<menuItemAdapter.MenuItemAdapterViewHolder>() {

    private val list = mutableListOf<MenuItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return MenuItemAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MenuItemAdapterViewHolder, position: Int) {
        holder.iniciaViews(list[position])
    }

    fun setItensList(list: List<MenuItemModel>) {
        this.list.clear()
        this.list.addAll(list)
    }


    class MenuItemAdapterViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        private val tvTiltle by lazy {
            itemView.findViewById<TextView>(R.id.tv_title)
        }

        fun iniciaViews(item: MenuItemModel) {
            tvTiltle.text = item.titulo

        }
    }
}
