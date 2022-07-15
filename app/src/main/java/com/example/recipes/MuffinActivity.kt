package com.example.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MuffinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muffin)

        val ingredients : Array<String> = resources.getStringArray(R.array.muffinIngredients)
        var ingTxt : TextView = findViewById(R.id.muffinIngredientsText)
        var concating : String = ""
        for (i in 0..ingredients.size-1) {
            concating += ingredients[i]+"\n"
        }
        ingTxt.text = concating
    }
}