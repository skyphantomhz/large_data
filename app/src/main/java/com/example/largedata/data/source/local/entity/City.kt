package com.example.largedata.data.source.local.entity

import androidx.annotation.Nullable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cities")
data class City(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "country")
    @Nullable
    val country: String? = null,
    @ColumnInfo(name = "city")
    @Nullable
    val city: String? = null,
    @ColumnInfo(name = "population")
    @Nullable
    val population: Long? = null
)