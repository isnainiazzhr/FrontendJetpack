package com.isnainiazzahra.frontendjetpack.model

import com.isnainiazzahra.frontendjetpack.R

class ModelLazyColumn (
    val imgKampus : Int,
    val namaKampus : String,
    val alamatKampus : String
)

object listLazyColumn{
    fun getModel() : List<ModelLazyColumn>{
        val item1 = ModelLazyColumn(
            R.drawable.img_1,
            "Universitas Indonesia",
            "Depok"
        )
        val item2 = ModelLazyColumn(
            R.drawable.um_malang,
            "Universitas Negeri Malang",
            "Malang"
        )
        val item3 = ModelLazyColumn(
            R.drawable.itb,
            "Institut Teknologi Bandung",
            "Bandung"
        )
        val item4 = ModelLazyColumn(
            R.drawable.ipb,
            "Institut Pertanian Bogor",
            "Bogor"
        )
        val item5 = ModelLazyColumn(
            R.drawable.unj,
            "Universitas Negeri Jakarta",
            "Jakarta"
        )
        val item6 = ModelLazyColumn(
            R.drawable.unand,
            "Universitas Andalas",
            "Padang"
        )
        val item7 = ModelLazyColumn(
            R.drawable.umj,
            "Universitas Muhammadiyah Jakarta",
            "Jakarta"
        )
        val item8 = ModelLazyColumn(
            R.drawable.ub,
            "Universitas Brawijaya",
            "Malang"
        )
        val item9 = ModelLazyColumn(
            R.drawable.umm,
            "Universitas Muhammadiyah Malang",
            "Jawa Timur"
        )
        val item10 = ModelLazyColumn(
            R.drawable.kanjuruhan,
            "Universitas PGRI Kanjuruhan",
            "Malang"
        )


        val itemList : ArrayList<ModelLazyColumn> = ArrayList()
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