package com.example.movieappv3.movieslist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movieappv3.databinding.MoviesListFragmentBinding
import com.example.movieappv3.utils.MoviesAdapter

class MoviesListFragment : Fragment() {

    private lateinit var viewModel: MoviesListViewModel
    private lateinit var binding: MoviesListFragmentBinding
    private lateinit var adapter: MoviesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = MoviesListFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(MoviesListViewModel::class.java)
        with(binding.recyclerView) {
            setHasFixedSize(true)
        }

        viewModel.movies.observe(viewLifecycleOwner, {
            adapter = MoviesAdapter(it)
            binding.recyclerView.adapter = adapter
            binding.recyclerView.layoutManager = GridLayoutManager(
                requireContext(), 1, RecyclerView.HORIZONTAL, false
            )
        })

        return binding.root
    }

}