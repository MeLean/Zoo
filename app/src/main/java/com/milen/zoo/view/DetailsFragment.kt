package com.milen.zoo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.milen.zoo.R
import kotlinx.android.synthetic.main.fragment_details.*
import java.util.stream.Collectors.toList

class DetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        details_fab.setOnClickListener{
            Navigation.findNavController(it).navigate(DetailsFragmentDirections.toList())
        }
    }
}