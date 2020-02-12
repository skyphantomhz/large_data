package com.example.largedata.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import androidx.paging.toLiveData
import com.example.largedata.Data
import com.example.largedata.data.source.local.AppDatabase
import com.example.largedata.data.source.local.entity.City
import javax.inject.Inject

class MainViewModel @Inject constructor(appDatabase: AppDatabase) : ViewModel() {

    private val cityDao = appDatabase.getCityDAO()

    val cities: LiveData<PagedList<City>> =
        cityDao.getCities().toLiveData(pageSize = Data.COMMON_PAGE_SIZE)

}