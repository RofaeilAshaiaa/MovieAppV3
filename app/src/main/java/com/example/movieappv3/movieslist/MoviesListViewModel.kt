package com.example.movieappv3.movieslist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movieappv3.data.models.Movie

class MoviesListViewModel : ViewModel() {

    val movies = MutableLiveData<List<Movie>>()

    init {
        val movie = Movie()
        movies.value = listOf(movie, movie, movie, movie, movie, movie, movie, movie, movie)
    }

}