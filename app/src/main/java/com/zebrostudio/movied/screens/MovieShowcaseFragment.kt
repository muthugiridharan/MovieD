package com.zebrostudio.movied.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.movied.R
import com.zebrostudio.movied.viewmodels.MovieViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class MovieShowcaseFragment : Fragment() {

    private val movieViewModel: MovieViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_showcase, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println(movieViewModel.moviesLiveData.value)
    }

}
