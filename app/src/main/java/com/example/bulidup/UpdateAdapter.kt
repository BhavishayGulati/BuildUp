package com.example.bulidup

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class UpdateAdapter(private val context: Context, private val list: ArrayList<UpdateModel>) :
    RecyclerView.Adapter<UpdateAdapter.UpdateViewHodler>() {

     class UpdateViewHodler(view: View) : RecyclerView.ViewHolder(view) {

        fun bindView(updateModel: UpdateModel) {

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpdateViewHodler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_updates,parent,false)
        return UpdateViewHodler(view)
    }

    override fun onBindViewHolder(holder: UpdateViewHodler, position: Int) {
        holder.bindView(list[position])

    }

    override fun getItemCount(): Int {
        return list.size
    }

}