package com.example.myscrollapp_kt.activity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myscrollapp_kt.R
import com.example.myscrollapp_kt.activity.model.Member


class RecyclerAdapter(var context: Context?, members: ArrayList<Member>?) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var members: ArrayList<Member>
    override fun getItemCount(): Int {
        return members.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_member_list, parent, false)
        return MemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member: Member = members[position]
        if (holder is MemberViewHolder) {
            val iv_profile = holder.iv_profile
            val tv_fullname = holder.tv_fullname
            iv_profile.setImageResource(member.profile)
            tv_fullname.setText(member.fullname)
        }
    }

     class MemberViewHolder(var view: View) : RecyclerView.ViewHolder  (view) {
        var iv_profile: ImageView
        var tv_fullname: TextView

        init {
            iv_profile = view.findViewById(R.id.img_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
        }
    }

    init {
        this.members = members!!
    }
}