package com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.rvadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pmdm.sanpablo_raposo_santiagofrancisco_proyectomoviles.R

class ItemAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView2)
        val textView: TextView = itemView.findViewById(R.id.textView3)

        fun bind(item: Item) {
            imageView.setImageResource(item.imagen)
            textView.text = item.titulo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_rv, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.imageView.setImageResource(currentItem.imagen)
        holder.textView.text = currentItem.titulo
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}