package com.example.largedata

import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.example.largedata.data.source.local.AppDatabase
import com.example.largedata.data.source.local.dao.CityDAO
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class MainViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private lateinit var cityDAO: CityDAO
    private lateinit var appDatabase: AppDatabase

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        appDatabase = Room.databaseBuilder(context, AppDatabase::class.java, "TestDB")
            .allowMainThreadQueries()
            .createFromAsset("databases/utopia_cities.db")
            .build()
        cityDAO = appDatabase.getCityDAO()
    }

    @After
    fun closeDb() {
        if (::appDatabase.isInitialized) {
            appDatabase.close()
        }
    }

    @Test
    @Throws(Exception::class)
    fun getCities() {
        val allCity = LiveDataTestUtil.getValue(cityDAO.countCities())
        assertEquals(272128, allCity)
    }
}