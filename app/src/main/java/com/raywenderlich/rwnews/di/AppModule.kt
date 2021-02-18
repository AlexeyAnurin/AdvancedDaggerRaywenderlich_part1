package com.raywenderlich.rwnews.di

import com.raywenderlich.rwnews.presenter.NewsDetailPresenter
import com.raywenderlich.rwnews.presenter.NewsListPresenter
import com.raywenderlich.rwnews.presenter.impl.NewsDetailPresenterImpl
import com.raywenderlich.rwnews.presenter.impl.NewsListPresenterImpl
import com.raywenderlich.rwnews.repository.NewsRepository
import com.raywenderlich.rwnews.repository.impl.MemoryNewsRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    abstract fun provideNewsListPresenter(newsRepository: NewsListPresenterImpl): NewsListPresenter

    @Binds
    abstract fun provideNewsDetailPresenter(newsRepository: NewsDetailPresenterImpl): NewsDetailPresenter


    /*
    // @Component.Builder. similar to 2. step
    @Provides
    fun provideNewsListPresenter(newsRepository: NewsRepository): NewsListPresenter =
        NewsListPresenterImpl(newsRepository)

    @Provides
    fun provideNewsDetailPresenter(newsRepository: NewsRepository): NewsDetailPresenter =
        NewsDetailPresenterImpl(newsRepository)*/


// 4. step
/*
@Module
class AppModule (private val newsRepository: NewsRepository) {


    @Provides
    fun provideNewsListPresenter(): NewsListPresenter = NewsListPresenterImpl(newsRepository)


    @Provides
    fun provideNewsDetailPresenter(): NewsDetailPresenter = NewsDetailPresenterImpl(newsRepository)
*/

/*
    // 2nd step.
    @Provides
    fun provideNewsListPresenter(repo: NewsRepository): NewsListPresenter =
        NewsListPresenterImpl(repo)

    @Provides
    fun provideNewsDetailPresenter(repo: NewsRepository): NewsDetailPresenter =
        NewsDetailPresenterImpl(repo)

*/
    // 1st step.
    /*@Provides
    @Singleton
    fun provideRepository(): NewsRepository {
        return MemoryNewsRepository()
    }*/
}