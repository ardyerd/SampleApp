package com.mws.sampleapp

import Users
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UsersAdapter(private val list: ArrayList<Users>) : RecyclerView.Adapter<UsersAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
    }

    override fun onBindViewHolder(holder: UsersAdapter.Holder, position: Int) {
        holder.nama.text = list.get(position).name
    }

    override fun getItemCount(): Int = list.size

    inner class Holder(val view: View) : RecyclerView.ViewHolder(view) {
        var nama : TextView = view.findViewById(R.id.lbList)
    }

}




