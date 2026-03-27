package com.example.lab4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlaceAdapter(
    private val places: List<Place>,
    private val onPlaceClick: (Place) -> Unit
) : RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>() {

    class PlaceViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.place_title)
        val desc: TextView = view.findViewById(R.id.place_short_desc)
        val image: ImageView = view.findViewById(R.id.place_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        return PlaceViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        val place = places[position]


        val context = holder.itemView.context

        holder.title.setText(place.nameRes)
        holder.desc.setText(place.descriptionRes)
        holder.image.setImageResource(place.imageRes)


        holder.image.contentDescription = context.getString(place.nameRes)

        holder.itemView.setOnClickListener { onPlaceClick(place) }
    }

    override fun getItemCount() = places.size
}