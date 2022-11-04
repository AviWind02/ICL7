package com.example.icl7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val FavTvShows = arrayOf<TvShow> (
            TvShow("Tom and jerry", " Metro-Goldwyn-Mayer"),
            TvShow("Family guy", "Not found.....not even wiki"),
            TvShow("The Simpsons", "Gracie Films"),
            TvShow("Futurama", "The Curiosity Company and 20th Century Fox Television"),
            TvShow("Loki", "Marvel Studios"))

        val firstAdaptor: FirstAdaptor = FirstAdaptor(FavTvShows)
        val recyclerView: RecyclerView = findViewById(R.id.firstRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = firstAdaptor;
    }



}