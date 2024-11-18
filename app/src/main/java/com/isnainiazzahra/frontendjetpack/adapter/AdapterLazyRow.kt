package com.isnainiazzahra.frontendjetpack.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.isnainiazzahra.frontendjetpack.DetailActivity
import com.isnainiazzahra.frontendjetpack.R
import com.isnainiazzahra.frontendjetpack.model.ModelLazyRow

class AdapterLazyRow(
    val itemLazyRow : List<ModelLazyRow>
):RecyclerView.Adapter<AdapterLazyRow.MyViewHolder>() {
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val imgKampus : ImageView = itemView.findViewById(R.id.gambarKampus)
        val namaKampus : TextView = itemView.findViewById(R.id.NamaKampus)
        val cardKampus1 : CardView =itemView.findViewById(R.id.cardKampus1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_lazy_row,parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemLazyRow.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemLazyRow[position]
        holder.imgKampus.setImageResource(currentItem.imgKampus)
        holder.namaKampus.text = currentItem.namaKampus

        holder.cardKampus1.setOnClickListener{
            val intent = Intent(holder.itemView.context,DetailActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }
}