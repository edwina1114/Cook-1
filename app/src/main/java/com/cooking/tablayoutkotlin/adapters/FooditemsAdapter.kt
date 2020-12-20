package com.cooking.tablayoutkotlin.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.cooking.tablayoutkotlin.R
import com.cooking.tablayoutkotlin.model.Fooditems

class FooditemsAdapter(var context: Context, var arrayList: ArrayList<Fooditems>) :
        RecyclerView.Adapter<FooditemsAdapter.ItemHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val itemHolder = LayoutInflater.from(parent.context).
        inflate(R.layout.cardview_layout, parent, false)

        return ItemHolder(itemHolder)

    }


    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        var fooditems: Fooditems = arrayList.get(position)

        holder.icons.setImageResource(fooditems.iconsChar!!)
        holder.title.text = fooditems.alphaChar

        holder.title.setOnClickListener {
            Toast.makeText(context, fooditems.alphaChar, Toast.LENGTH_LONG).show()
        }

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ItemHolder(itemView: View) :RecyclerView.ViewHolder(itemView)  {

        var icons = itemView.findViewById(R.id.icons_image) as ImageView
        var title = itemView.findViewById (R.id.title) as TextView

    }

}

