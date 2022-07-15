package com.example.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.adapter.ItemAdapter
import com.example.recipes.data.Datasource
import com.example.recipes.model.Recipe

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadRecipes()
        val list = Datasource().loadRecipes()
        val sortedList = list.sortedWith(compareBy(Recipe::stringResourcedId))

        val recyclerView = findViewById<RecyclerView>(R.id.recipes_recycle_view)
        recyclerView.adapter = ItemAdapter(applicationContext, myDataset)
        recyclerView.setHasFixedSize(true)

    }
}