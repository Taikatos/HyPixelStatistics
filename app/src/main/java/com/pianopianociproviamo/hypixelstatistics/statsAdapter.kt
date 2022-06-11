package com.pianopianociproviamo.hypixelstatistics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
/*
class statsAdapter  (val statsList: List<statsModel>) : RecyclerView.Adapter<statsAdapter.ViewHolder>() {
    inner class  ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val statsImage: ImageView = view.findViewById(R.id.rc_iw_icon)
        val statsTitle: TextView = view.findViewById(R.id.statsName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_stats, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val stats = statsList[position]
        //holder.statsImage.setImageResource(stats.imageStatsItem)
        holder.statsTitle.text = stats.titleStatsItem
    }
}*/