package koin.dagger2.com.presentation.homepage.module

import koin.dagger2.com.data.network.repository.SportDbDataStore
import koin.dagger2.com.data.network.repository.SportDbRepository
import koin.dagger2.com.presentation.homepage.presenter.HomePagePresenter
import koin.dagger2.com.presentation.homepage.router.HomepageRouter
import koin.dagger2.com.presentation.homepage.usecase.HomepageInteractor
import koin.dagger2.com.presentation.homepage.usecase.HomepageUseCase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

/**
 * Created by Yoga C. Pranata on 14/01/2019.
 * Android Engineer
 */
val homePageModule = module {
    single<SportDbRepository> { SportDbDataStore(get(), get()) }
    single<HomepageUseCase> { HomepageInteractor(get()) }
    single { HomepageRouter(get(), androidContext()) }
    single { HomePagePresenter(get()) }
}