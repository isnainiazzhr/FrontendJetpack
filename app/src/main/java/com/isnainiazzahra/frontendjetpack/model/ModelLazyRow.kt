package com.isnainiazzahra.frontendjetpack.model

import com.isnainiazzahra.frontendjetpack.R

data class ModelLazyRow(
    val imgKampus : Int,
    val namaKampus : String
)

object listlazyRow{
    fun getModel() : List<ModelLazyRow>{
        val item1 = ModelLazyRow(
            R.drawable.img_1,
            "Universitas Indonesia"
        )
        val item2 = ModelLazyRow(
            R.drawable.um_malang,
            "Universitas Negeri Malang"
        )
        val item3 = ModelLazyRow(
            R.drawable.itb,
            "Institut Teknologi Bandung"
        )
        val item4 = ModelLazyRow(
            R.drawable.ipb,
            "Institut Pertanian Bogor"
        )
        val item5 = ModelLazyRow(
            R.drawable.unj,
            "Universitas Negeri Jakarta"
        )
        val item6 = ModelLazyRow(
            R.drawable.unand,
            "Universitas Andalas"
        )
        val item7 = ModelLazyRow(
            R.drawable.umj,
            "Universitas Muhammadiyah"
        )
        val item8 = ModelLazyRow(
            R.drawable.ub,
            "Universitas Brawijaya"
        )
        val item9 = ModelLazyRow(
            R.drawable.umm,
            "Universitas Muhammadiyah Malang"
        )
        val item10 = ModelLazyRow(
            R.drawable.kanjuruhan,
            "Universitas PGRI Kanjuruhan"
        )


        val itemList : ArrayList<ModelLazyRow> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        itemList.add(item7)
        itemList.add(item8)
        itemList.add(item9)
        itemList.add(item10)


        return itemList
    }
}