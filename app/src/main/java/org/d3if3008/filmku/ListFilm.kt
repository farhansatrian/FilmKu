package org.d3if3008.filmku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.d3if3008.filmku.databinding.ActivityListFilmBinding

class ListFilm : AppCompatActivity() {
    private lateinit var binding: ActivityListFilmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListFilmBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = FilmAdapter(MainActivity.listFilm)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}