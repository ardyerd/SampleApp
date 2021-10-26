package com.mws.sampleapp

import Users
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListData : AppCompatActivity() {

    val list = ArrayList<Users>()
    val listUser = arrayOf(
        "Budi",
        "Andi",
        "Nina",
        "Agus",
        "Eko",
        "Toni"
    )

    private lateinit var userAdapter: UsersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_data)

        val recyclerView : RecyclerView = findViewById(R.id.recycleView)
        val layoutManager  = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager

        for (i in 0 until listUser.size){
            list.add(Users(listUser.get(i)))
            if (listUser.size - 1 == i) {
                userAdapter = UsersAdapter(list)
                userAdapter.notifyDataSetChanged()
                recyclerView.adapter = userAdapter
            }
        }

    }

}