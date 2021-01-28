package ru.ifmo.mobdev.lab2_orekhovskiy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), AndroidAdapter.OnAndroidListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val android = Data.getVersionsList()
        val adapter = AndroidAdapter(this, android, this)

        val list = findViewById<RecyclerView>(R.id.androidList)
        list.adapter = adapter

        val decoration = DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL)
        decoration.setDrawable(ContextCompat.getDrawable(this, R.color.black)!!)
        list.addItemDecoration(decoration)
    }

    override fun onAndroidClick(position: Int) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("position", position)
        startActivity(intent)
    }
}