package com.example.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.Psalm23

class ItemAdapter (private val context : Context, private val dataSet : List<Psalm23>) :
RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){ //this code overrides some adapter methods.

    class ItemViewHolder(private  val view : View) : RecyclerView.ViewHolder(view) {
        val text : TextView = view.findViewById(R.id.item_title)
    }
//these are the methods that we need to override
    //the onCreateViewHolder method is called by the layout manger to create new view holders for your recycler view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent,false)
        return ItemViewHolder(adapterLayout)
    }
//this is where taking the data and putting in the view takes place.
    //it is called to replace the content of a list item view
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.text.text = context.resources.getString(item.stringId)
    }
// this fun needs to return the size of our data set
    override fun getItemCount(): Int {
        return dataSet.size
    }
}