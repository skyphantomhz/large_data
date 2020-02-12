package com.example.largedata.data.source.local.dao

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Query
import com.example.largedata.data.source.local.entity.City

@Dao
interface CityDAO {

    @Query("SELECT * FROM cities")
    fun getCities(): DataSource.Factory<Int, City>

    @Query("SELECT count(id) FROM cities")
    fun countCities(): LiveData<Long>
}