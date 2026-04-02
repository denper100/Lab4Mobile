package com.example.lab4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class PlaceDetailFragment : Fragment() {

    private val viewModel: CityViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_place_detail, container, false)

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.selectedPlaceId.collect { placeId ->
                val place = LocalDataProvider.places.find { it.id == placeId }
                place?.let {
                    view.findViewById<ImageView>(R.id.detail_image).contentDescription = getString(it.nameRes)
                    view.findViewById<ImageView>(R.id.detail_image).setImageResource(it.imageRes)
                    view.findViewById<TextView>(R.id.detail_title).setText(it.nameRes)
                    view.findViewById<TextView>(R.id.detail_desc).setText(it.descriptionRes)
                }
            }
        }
        return view
    }
}