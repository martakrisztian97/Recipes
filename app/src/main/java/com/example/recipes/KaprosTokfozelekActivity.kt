package com.example.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class KaprosTokfozelekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kapros_tokfozelek)

        val ingredients : Array<String> = resources.getStringArray(R.array.kaprosTokfozelekIngredients)
        var ingTxt : TextView = findViewById(R.id.kaprosTokfozelekIngredientsText)
        var concating : String = ""
        for (i in 0..ingredients.size-1) {
            concating += ingredients[i]+"\n"
        }
        ingTxt.text = concating

        val preparation : Array<String> = resources.getStringArray(R.array.kaprosTokfozelekPreparation)
        var preTxt : TextView = findViewById(R.id.kaprosTokfozelekPreparationText)
        var concating2 : String = ""
        for (i in 0..preparation.size-1) {
            concating2 += preparation[i]+"\n"
        }
        preTxt.text = concating2
    }
}