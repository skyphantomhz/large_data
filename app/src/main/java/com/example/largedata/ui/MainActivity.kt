package com.example.largedata.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.largedata.BaseActivity
import com.example.largedata.R
import com.example.largedata.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var dataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
    }
}
