package com.example.largedata.ui

import androidx.recyclerview.widget.RecyclerView
import com.example.largedata.data.source.local.entity.City
import com.example.largedata.databinding.ItemRecordBinding

class CityViewHolder(private val binding: ItemRecordBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bindTo(city: City?) {
        binding.city = city?.city
        binding.country = city?.country
        binding.population = city?.population?.toString()
    }
}