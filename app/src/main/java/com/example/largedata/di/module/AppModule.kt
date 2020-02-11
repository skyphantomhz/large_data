package com.example.largedata.di.module

import android.app.Application
import android.content.Context
import com.example.largedata.data.source.local.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    fun provideDataBase(context: Context): AppDatabase = AppDatabase.getAppDataBase(context = context)
}