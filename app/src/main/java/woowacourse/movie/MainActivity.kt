package woowacourse.movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import woowacourse.movie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListView()
    }

    private fun setListView() {
        val listView = binding.lvMovieList
        val movies = MovieDummyData.values
        val adapter = MovieListAdapter(movies)
        listView.adapter = adapter
    }
}
