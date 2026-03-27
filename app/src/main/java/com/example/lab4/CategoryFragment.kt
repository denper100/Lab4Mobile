package com.example.lab4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab4.CategoryAdapter
import com.example.lab4.LocalDataProvider

class CategoryFragment : Fragment() {


    private val viewModel: CityViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_category, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.category_recycler)
        recyclerView.layoutManager = LinearLayoutManager(context)


        recyclerView.adapter = CategoryAdapter(LocalDataProvider.categories) { category ->

            viewModel.selectCategory(category.id)


            findNavController().navigate(R.id.action_categories_to_list)
        }

        return view
    }
}