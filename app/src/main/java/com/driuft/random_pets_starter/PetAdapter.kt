package com.driuft.random_pets_starter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val petImage: ImageView

    init {
        // Find our RecyclerView item's ImageView for future use
        petImage = view.findViewById(R.id.pet_image)
    }
}

class PetAdapter (private val petList: List<String>) : RecyclerView.Adapter<PetAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val petImage: ImageView

        init {
            // Find our RecyclerView item's ImageView for future use
            petImage = view.findViewById(R.id.pet_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pet_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = petList.size
}