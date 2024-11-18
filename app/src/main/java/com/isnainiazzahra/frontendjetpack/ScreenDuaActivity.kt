package com.isnainiazzahra.frontendjetpack

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.isnainiazzahra.frontendjetpack.adapter.AdapterLazyGrid
import com.isnainiazzahra.frontendjetpack.model.ModelLazyRow
import com.isnainiazzahra.frontendjetpack.model.listlazyRow

class ScreenDuaActivity : AppCompatActivity() {

    private lateinit var rvlazyGrid : RecyclerView
    private lateinit var nav1 : ImageView
    private lateinit var profil : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen_dua)

        rvlazyGrid = findViewById(R.id.rvLazyGrid)
        nav1 = findViewById(R.id.nav1)
        profil = findViewById(R.id.profil)

        rvlazyGrid.layoutManager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)

        val adapter = AdapterLazyGrid(listlazyRow.getModel() as ArrayList<ModelLazyRow>)

        rvlazyGrid.adapter = adapter

        nav1.setOnClickListener{
            val intent = Intent(this,NavigationActivity::class.java)
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