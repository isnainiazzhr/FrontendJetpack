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
import com.isnainiazzahra.frontendjetpack.model.ModelLazyColumn
import com.isnainiazzahra.frontendjetpack.model.ModelLazyRow

class AdapterLazyColumn(
    val itemLazyColumn : List<ModelLazyColumn>
): RecyclerView.Adapter<AdapterLazyColumn.MyViewHolder>() {
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val imgKampus : ImageView = itemView.findViewById(R.id.imgKampus)
        val namaKampus : TextView = itemView.findViewById(R.id.txtNamaKampus)
        val alamatKampus : TextView = itemView.findViewById(R.id.txtAlamatKampus)
        val cardkampus : CardView = itemView.findViewById(R.id.cardKampus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_lazy_column,parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemLazyColumn.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemLazyColumn[position]
        holder.imgKampus.setImageResource(currentItem.imgKampus)
        holder.namaKampus.text = currentItem.namaKampus
        holder.alamatKampus.text = currentItem.alamatKampus

        holder.cardkampus.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }
}