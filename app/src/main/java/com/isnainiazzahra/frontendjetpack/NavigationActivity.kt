package com.isnainiazzahra.frontendjetpack

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.isnainiazzahra.frontendjetpack.adapter.AdapterLazyColumn
import com.isnainiazzahra.frontendjetpack.adapter.AdapterLazyRow
import com.isnainiazzahra.frontendjetpack.model.ModelLazyColumn
import com.isnainiazzahra.frontendjetpack.model.ModelLazyRow
import com.isnainiazzahra.frontendjetpack.model.listLazyColumn
import com.isnainiazzahra.frontendjetpack.model.listlazyRow

class NavigationActivity : AppCompatActivity() {

    private lateinit var nav2 : ImageView
    private lateinit var profil : ImageView
    private lateinit var rvlazyRow : RecyclerView
    private lateinit var rvlazyColum : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_navigation)

        rvlazyRow = findViewById(R.id.rvlazyRow)
        rvlazyColum = findViewById(R.id.rvlazyColum)
        nav2 = findViewById(R.id.nav2)
        profil = findViewById(R.id.imgProfil1)

        rvlazyRow.layoutManager = GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)
        rvlazyColum.layoutManager = GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false)

        val adapter = AdapterLazyRow(listlazyRow.getModel() as ArrayList<ModelLazyRow>)
        val adapter1 =  AdapterLazyColumn(listLazyColumn.getModel() as ArrayList<ModelLazyColumn>)

        rvlazyRow.adapter =adapter
        rvlazyColum.adapter = adapter1

        nav2.setOnClickListener{
            val intent = Intent(this,ScreenDuaActivity::class.java)
            startActivity(intent)
        }
        profil.setOnClickListener{
            val intent = Intent(this,ProfilActivity::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}