package com.example.myscrollapp_kt.activity.activity

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myscrollapp_kt.R
import com.example.myscrollapp_kt.activity.adapter.RecyclerAdapter
import com.example.myscrollapp_kt.activity.model.Member

class RecyclerActivity : AppCompatActivity() {
    var context: Context? = null
    var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        initViews()
    }

    fun initViews() {
        context = this
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView?.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false))
        val members: ArrayList<Member> = ArrayList<Member>()
        members.add(Member(R.drawable.alisher_davlatov, "Akmal Davlatov"))
        members.add(Member(R.drawable.akmal_paiziyev, "Akmal Paiziyev"))
        members.add(Member(R.drawable.davronbek_turdiyev, "Davronbek Turdiyev"))
        members.add(Member(R.drawable.alisher_davlatov, "Akmal Davlatov"))
        members.add(Member(R.drawable.akmal_paiziyev, "Akmal Paiziyev"))
        members.add(Member(R.drawable.davronbek_turdiyev, "Davronbek Turdiyev"))




        refreshAdapter(members)
    }

    fun refreshAdapter(members: ArrayList<Member>?) {
        val adapter = RecyclerAdapter(context, members)
        recyclerView!!.adapter = adapter
        recyclerView!!.isNestedScrollingEnabled = false
    }
}