package com.example.largedata.di.module

import com.example.largedata.di.ActivityScope
import com.example.largedata.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    @ActivityScope
    abstract fun provideMainActivity(): MainActivity
}