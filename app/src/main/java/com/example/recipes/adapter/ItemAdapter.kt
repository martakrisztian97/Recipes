package com.example.recipes.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.MuffinActivity
import com.example.recipes.PizzaActivity
import com.example.recipes.R
import com.example.recipes.model.Recipe

class ItemAdapter(private val context: Context, private val dataset: List<Recipe>)
: RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourcedId)
        holder.imageView.setImageResource(item.imageResourcedId)

        // image click event
        holder.imageView.setOnClickListener {
            var intent : Intent
            if ( holder.textView.text == "Muffin") {
                intent = Intent(context, MuffinActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
            }

            if ( holder.textView.text == "Kelt pizzatészta") {
                intent = Intent(context, PizzaActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
            }
        }

        // text click event
        holder.textView.setOnClickListener {
            var intent : Intent
            if ( holder.textView.text == "Muffin") {
                intent = Intent(context, MuffinActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
            }

            if ( holder.textView.text == "Kelt pizzatészta") {
                intent = Intent(context, PizzaActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}