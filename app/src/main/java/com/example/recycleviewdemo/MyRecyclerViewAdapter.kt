package com.example.recycleviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyRecyclerViewAdapter: RecyclerView.Adapter<MyViewHolder>() {
    private val fruitsList = listOf("Banana", "Mongo", "Apple", "Guava", "Pear", "Orange", "Lemon", "Watermelon")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = fruitsList[position]
        holder.myTextView.text = fruit
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }
}

class MyViewHolder(private val view: View): ViewHolder(view) {
    val myTextView: TextView = view.findViewById(R.id.tvName)
}