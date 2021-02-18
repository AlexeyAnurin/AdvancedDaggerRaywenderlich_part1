package com.raywenderlich.rwnews

import android.app.Application
import com.raywenderlich.rwnews.di.AppComponent
import com.raywenderlich.rwnews.di.AppModule
import com.raywenderlich.rwnews.di.DaggerAppComponent
import com.raywenderlich.rwnews.repository.impl.MemoryNewsRepository

class InitApp : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        /* // 1st step
         appComponent = DaggerAppComponent.create()*/

        /*
        // 3. step
        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(MemoryNewsRepository()))
            .build()*/

        /*
        //  @Component.Builder
        appComponent = DaggerAppComponent.builder().repository(MemoryNewsRepository()).build()
        */

        //  @Component.Factory
        appComponent = DaggerAppComponent
            .factory()
            .repository(MemoryNewsRepository())
    }

    fun appComp() = appComponent

}