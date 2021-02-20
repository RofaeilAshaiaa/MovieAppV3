package com.example.movieappv3.moviedetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.movieappv3.databinding.MovieDetailsFragmentBinding

class MovieDetailsFragment : Fragment() {

    private lateinit var viewModel: MovieDetailsViewModel
    private val args: MovieDetailsFragmentArgs by navArgs()
    private lateinit var binding: MovieDetailsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = MovieDetailsFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(MovieDetailsViewModel::class.java)
        Toast.makeText(
            requireContext(),
            "Movie Number ${args.movieId} Clicked",
            Toast.LENGTH_SHORT
        ).show()
        return binding.root
    }

}