package com.example.recycleviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyRecyclerViewAdapter: RecyclerView.Adapter<MyViewHolder>() {
    private val fruitsList = listOf("Mohammed",
        "Mohammed",
        "Ouassama",
        "Berila", "Ennami",
        "Omari", "Mouloudi", "Khadija")
    private val dis = listOf("Mohammed Berila Berila",
        "Mohammed Berila Berila", "Mohammed Berila Berila",
        "Mohammed Berila Berila", "Mohammed Berila Berila",
        "Mohammed Berila Berila", "Mohammed Berila Berila", "Mohammed Berila Berila")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = fruitsList[position]
        val disc = dis[position]
        holder.myTextView.text = fruit
        holder.myDisView.text = disc
        holder.image
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }
}

class MyViewHolder(private val view: View): ViewHolder(view) {
    val myTextView: TextView = view.findViewById(R.id.tvName)
    val myDisView: TextView = view.findViewById(R.id.tvDis)
    val image: ImageView = view.findViewById(R.id.imageView)
}