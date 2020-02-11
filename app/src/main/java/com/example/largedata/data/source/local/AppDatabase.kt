package com.example.largedata.data.source.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.largedata.data.source.local.dao.CityDAO
import com.example.largedata.data.source.local.entity.City

@Database(entities = [City::class], version = 1, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getCityDAO(): CityDAO

    companion object{
        fun getAppDataBase(context: Context) = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "ExampleDB")
            .fallbackToDestructiveMigration()
            .build()
    }
}