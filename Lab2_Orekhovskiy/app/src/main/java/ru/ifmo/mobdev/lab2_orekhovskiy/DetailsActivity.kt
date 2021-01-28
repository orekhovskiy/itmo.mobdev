package ru.ifmo.mobdev.lab2_orekhovskiy

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val data = Data.getVersionsList()
        val pos = intent.getIntExtra("position", 0)
        val android = data[pos]

        val poster = findViewById<ImageView>(R.id.poster)
        poster.setImageResource(android.poster)

        val logo = findViewById<ImageView>(R.id.logo)
        logo.setImageResource(android.imageAndroid)

        val title = findViewById<TextView>(R.id.title)
        title.text = android.title

        val date = findViewById<TextView>(R.id.date)
        date.text = android.releaseDate

        val overviewText = findViewById<TextView>(R.id.overview_text)
        overviewText.text = android.description
        
        val button = findViewById<Button>(R.id.click_btn)
        button.setOnClickListener {
            val url = android.versionTrailerUrl
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

    }
}