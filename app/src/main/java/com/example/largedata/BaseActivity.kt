package com.example.largedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.largedata.di.module.ViewModelFactory
import dagger.android.AndroidInjection
import javax.inject.Inject
import kotlin.reflect.KClass

abstract class BaseActivity: AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    protected fun <T : ViewModel> getViewModel(value: KClass<T>): T {
        return ViewModelProvider(this, viewModelFactory).get(value.java)
    }
}