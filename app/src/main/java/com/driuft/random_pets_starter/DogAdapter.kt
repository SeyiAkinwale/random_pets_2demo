package com.driuft.random_pets_starter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

// http://dogphoto1.jpg
class DogAdapter(private val dogList: MutableList<String>): RecyclerView.Adapter<DogAdapter.DogViewHolder>(){
    class DogViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val dogImage:ImageView

        init{
            //Find our RecyclerView item's ImageView for future use
            dogImage = view.findViewById(R.id.dog_image)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogAdapter.DogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dog_item, parent, false)
        return DogViewHolder(view)
    }

    override fun onBindViewHolder(holder: DogAdapter.DogViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int{
        return dogList.size  //like Paulina
    }

}