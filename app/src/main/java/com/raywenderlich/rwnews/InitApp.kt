package com.raywenderlich.rwnews

import android.app.Application
import com.raywenderlich.rwnews.di.AppComponent
import com.raywenderlich.rwnews.di.DaggerAppComponent

class InitApp : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

    fun appComp() = appComponent

}