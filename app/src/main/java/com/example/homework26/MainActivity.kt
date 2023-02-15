package com.example.homework26

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import com.example.homework26.domain.CatViewModel
import androidx.activity.viewModels
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<CatViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val image = findViewById<ImageView>(R.id.ivPicture)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            viewModel.getCatImage()
            viewModel.catLiveData.observe(this) {
                Glide
                    .with(this)
                    .load(it[0].imageUrl)
                    .into(image)
            }
        }
    }
}
