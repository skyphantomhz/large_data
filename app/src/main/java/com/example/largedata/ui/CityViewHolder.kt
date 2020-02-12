package com.example.largedata.ui

import androidx.recyclerview.widget.RecyclerView
import com.example.largedata.data.source.local.entity.City
import com.example.largedata.databinding.ItemCityBinding

class CityViewHolder(private val binding: ItemCityBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bindTo(city: City?) {
        binding.name = city?.name
        binding.country = city?.country
        binding.population = city?.population?.toString()
    }
}