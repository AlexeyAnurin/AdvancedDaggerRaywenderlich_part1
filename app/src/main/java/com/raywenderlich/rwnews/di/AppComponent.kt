package com.raywenderlich.rwnews.di

import com.raywenderlich.news.android.ui.list.NewsListFragment
import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.ui.detail.NewsDetailFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
interface AppComponent {

  fun inject(frag: NewsListFragment)

  fun inject(frag: NewsDetailFragment)

/*  // 5. step
  @Component.Builder
  interface Builder {

    // собственный метод, вызываемый позже в InitApp
    @BindsInstance
    fun repository(repo: NewsRepository): Builder

    fun build(): AppComponent
  }*/

  @Component.Factory
  interface Factory {
    fun repository(@BindsInstance repo: NewsRepository): AppComponent
  }

}