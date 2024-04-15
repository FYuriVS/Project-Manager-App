package com.yurivital.projectmanager.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.yurivital.projectmanager.Domain.OngoingDomain
import com.yurivital.projectmanager.R

class OngoingAdapter(private val items: List<OngoingDomain>) :
    RecyclerView.Adapter<OngoingAdapter.Viewholder>() {
     inner class Viewholder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val title : TextView = itemView.findViewById(R.id.titleTxt)
        val data : TextView = itemView.findViewById(R.id.dateTxt)
        val progressBarPercent : TextView = itemView.findViewById(R.id.percentTxt)
        val progressTxt : TextView = itemView.findViewById(R.id.progressTxt)
        val progressBar : ProgressBar = itemView.findViewById(R.id.progressBar)
        val pic : TextView = itemView.findViewById(R.id.titleTxt)
        val layout : ConstraintLayout = itemView.findViewById(R.id.layout)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_ongoing, parent, false)
        return  Viewholder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        TODO("Not yet implemented")
    }
}