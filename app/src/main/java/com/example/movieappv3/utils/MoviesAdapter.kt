package com.example.movieappv3.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieappv3.R
import com.example.movieappv3.data.models.Movie
import com.example.movieappv3.databinding.MovieItemBinding

/**
 * @author Rofaeil Ashaiaa
 * Created on 2/19/21.
 */
class MoviesAdapter(
    private val movies: List<Movie>,
    private val listener: MovieItemListener
) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.movie_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        with(holder.binding) {
            root.setOnClickListener {
                listener.onMovieClicked(movie.id)
            }
        }
    }

    override fun getItemCount(): Int {
        return movies.size
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val binding = MovieItemBinding.bind(itemView)

    }

    interface MovieItemListener {

        fun onMovieClicked(movieId: String)

    }
}