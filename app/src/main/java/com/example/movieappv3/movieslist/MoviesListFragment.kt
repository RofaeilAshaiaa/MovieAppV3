package com.example.movieappv3.movieslist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movieappv3.R

class MoviesListFragment : Fragment() {

    private lateinit var viewModel: MoviesListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(MoviesListViewModel::class.java)
        return inflater.inflate(R.layout.movies_list_fragment, container, false)
    }

}