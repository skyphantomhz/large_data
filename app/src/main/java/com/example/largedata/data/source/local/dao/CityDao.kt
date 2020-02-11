package com.example.largedata.data.source.local.dao

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Query
import com.example.largedata.data.source.local.entity.City

@Dao
interface CityDAO {

    @Query("SELECT * from cities")
    fun getCities(): DataSource.Factory<Int, City>
}