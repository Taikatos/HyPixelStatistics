package com.pianopianociproviamo.hypixelstatistics

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class statsAdapter (val listStats:List<statsViewModel>, var context:Context) : RecyclerView.Adapter<statsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_stats, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val statsViewModel = listStats[position]
        holder.imgView.setImageResource(R.drawable.ic_arena)
    }

    override fun getItemCount(): Int {
        return listStats.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imgView: ImageView = itemView.findViewById(R.id.rc_iw_icon)
        val textView: TextView = itemView.findViewById(R.id.rc_tv_title)
    }

}