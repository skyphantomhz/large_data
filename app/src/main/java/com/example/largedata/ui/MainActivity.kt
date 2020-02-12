package com.example.largedata.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.largedata.BaseActivity
import com.example.largedata.R
import com.example.largedata.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var dataBinding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: CityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        viewModel = getViewModel(MainViewModel::class)
        initCitiesView()
    }

    private fun initCitiesView() {
        adapter = CityAdapter()
        viewModel.cities.observe(this, Observer { cities ->
            adapter.submitList(cities)
        })
        dataBinding.rvCity.adapter = adapter
    }
}
