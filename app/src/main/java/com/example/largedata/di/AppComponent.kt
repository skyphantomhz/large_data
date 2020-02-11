package com.example.largedata.di

import android.app.Application
import com.example.largedata.MainApplication
import com.example.largedata.di.module.ActivityModule
import com.example.largedata.di.module.AppModule
import com.example.largedata.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class, AppModule::class, ActivityModule::class,
        ViewModelModule::class]
)
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(boostApplication: MainApplication)
}