package com.example.myscrollapp_kt.activity.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myscrollapp_kt.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        val bit = findViewById<Button>(R.id.b_push)
        bit.setOnClickListener({
            openRecyclerActivity()
        })
    }

    fun openRecyclerActivity(){
        val intent = Intent(this, RecyclerActivity::class.java)
        startActivity(intent)
    }
}