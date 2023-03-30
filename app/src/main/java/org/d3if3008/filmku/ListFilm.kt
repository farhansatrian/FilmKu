package org.d3if3008.filmku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if3008.filmku.databinding.ActivityListFilmBinding

class ListFilm : AppCompatActivity() {
    private lateinit var binding: ActivityListFilmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListFilmBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}