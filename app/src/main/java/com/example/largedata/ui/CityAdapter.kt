package com.example.largedata.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.example.largedata.data.source.local.entity.City
import com.example.largedata.databinding.ItemRecordBinding


class CityAdapter : PagedListAdapter<City, CityViewHolder>(DIFF_CALLBACK) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemRecordBinding.inflate(layoutInflater, parent, false)
        return CityViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.bindTo(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object :
            DiffUtil.ItemCallback<City>() {
            override fun areItemsTheSame(
                oldConcert: City,
                newConcert: City
            ) = oldConcert.id == newConcert.id

            override fun areContentsTheSame(
                oldConcert: City,
                newConcert: City
            ) = oldConcert == newConcert
        }
    }
}

