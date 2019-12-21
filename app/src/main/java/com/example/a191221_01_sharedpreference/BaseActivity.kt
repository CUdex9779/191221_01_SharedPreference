package com.example.a191221_01_sharedpreference

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    abstract fun setEvents()
    abstract fun setValues()
}