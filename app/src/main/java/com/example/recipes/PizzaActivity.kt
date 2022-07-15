package com.example.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PizzaActivity : AppCompatActivity() {

    var dose = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        doseTextToSet()

        val doseMinusBtn : Button = findViewById(R.id.doseMinusButton)
        val dosePlusBtn : Button = findViewById(R.id.dosePlusButton)
        val doseText : TextView = findViewById(R.id.doseText)

        doseMinusBtn.setOnClickListener {
            if (dose > 1) {
                dose--
                doseText.text = dose.toString()+" Adag"
            }
            doseTextToSet()
        }

        dosePlusBtn.setOnClickListener {
            if (dose < 6) {
                dose++
                doseText.text = dose.toString()+" Adag"
            }
            doseTextToSet()
        }
    }


    fun doseTextToSet() {
        var ingredients : Array<String> = resources.getStringArray(R.array.pizzaIngredientsDose3)
        var ingTxt : TextView = findViewById(R.id.pizzaIngredientsText)
        when (dose) {
            1 -> ingredients = resources.getStringArray(R.array.pizzaIngredientsDose1)
            2 -> ingredients = resources.getStringArray(R.array.pizzaIngredientsDose2)
            3 -> ingredients = resources.getStringArray(R.array.pizzaIngredientsDose3)
            4 -> ingredients = resources.getStringArray(R.array.pizzaIngredientsDose4)
            5 -> ingredients = resources.getStringArray(R.array.pizzaIngredientsDose5)
            6 -> ingredients = resources.getStringArray(R.array.pizzaIngredientsDose6)
        }
        var concating : String = ""
        for (i in 0..ingredients.size-1) {
            concating += ingredients[i]+"\n"
        }
        ingTxt.text = concating
    }
}