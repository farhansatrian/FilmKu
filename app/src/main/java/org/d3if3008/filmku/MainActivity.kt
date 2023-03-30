package org.d3if3008.filmku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.d3if3008.filmku.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object {
        var listFilm = ArrayList<Film>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        tambahFilm("Supernatural","Two brothers follow their father's footsteps as hunters, fighting evil supernatural beings of many kinds, including monsters, demons and gods that roam the earth.")
        tambahFilm("The Dark Knight","When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.")
        tambahFilm("The Expanse","In the 24th century, a group of humans untangle a vast plot which threatens the Solar System's fragile state of detente")
        tambahFilm("Joker","In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.")
        tambahFilm("Spider-Man : No Way Home","With Spider-Man's identity now revealed, Peter asks Doctor Strange for help. When a spell goes wrong, dangerous foes from other worlds start to appear, forcing Peter to discover what it truly means to be Spider-Man.")
        tambahFilm("Fight Club","An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.")
        tambahFilm("The Godfather","The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.")

        binding.btnList.setOnClickListener{
            val intent = Intent(this, ListFilm::class.java)
            startActivity(intent)
        }

        binding.btnTambah.setOnClickListener{
            val inputJudul = binding.inputJudul.text.toString()
            val inputSinopsis = binding.inputSinopsis.text.toString()

            if (inputJudul.isEmpty() || inputSinopsis.isEmpty()){
                Toast.makeText(this,"Silahkan Input terlebih dahulu!",Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this,"Film ditambahkan!",Toast.LENGTH_SHORT).show()
                tambahFilm(inputJudul,inputSinopsis)
                val intent = Intent(this, ListFilm::class.java)
                startActivity(intent)
                binding.inputJudul.text.clear()
                binding.inputSinopsis.text.clear()
            }

        }
    }
    private fun tambahFilm(judul:String, sinopsis:String){
        val filmBaru = Film(judul,sinopsis,R.drawable.logofilm)
        listFilm.add(filmBaru)
    }
}