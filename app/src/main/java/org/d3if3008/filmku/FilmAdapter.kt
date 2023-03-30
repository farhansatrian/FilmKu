package org.d3if3008.filmku

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.d3if3008.filmku.databinding.ListBinding

class FilmAdapter (private val listFilm: List<Film>) : RecyclerView.Adapter<FilmAdapter.ViewHolder>(){
        // Inner class untuk ViewHolder
        class ViewHolder(private val binding: ListBinding) : RecyclerView.ViewHolder(binding.root) {

                fun bind(film: Film) = with(binding)  {
                        binding.judulFilm.text = film.judul
                        binding.sinopsisFilm.text = film.sinopsis
                        binding.logoFilm.setImageResource(film.Thumbnail)

                        root.setOnClickListener {
                                val message = root.context.getString(R.string.message, film.judul)
                                Toast.makeText(root.context, message, Toast.LENGTH_LONG).show()
                        }
                }
        }

        // Override fungsi onCreateViewHolder untuk membuat ViewHolder baru
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val binding = ListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ViewHolder(binding)
        }

        // Override fungsi onBindViewHolder untuk mengisi data pada ViewHolder
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                val film = listFilm[position]
                holder.bind(film)
        }

        // Override fungsi getItemCount untuk mengembalikan jumlah item pada list
        override fun getItemCount(): Int {
                return listFilm.size
        }
}
