package com.example.lab4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch

class PlaceListFragment : Fragment() {

    private val viewModel: CityViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_place_list, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.places_recycler)
        recyclerView.layoutManager = LinearLayoutManager(context)


        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.selectedCategoryId.collect { categoryId ->

                val filteredPlaces = LocalDataProvider.places.filter { it.categoryId == categoryId }

                recyclerView.adapter = PlaceAdapter(filteredPlaces) { place ->

                    viewModel.selectPlace(place.id)
                    findNavController().navigate(R.id.action_list_to_detail)
                }
            }
        }

        return view
    }
}