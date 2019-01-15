package koin.dagger2.com.koin.module

import com.google.gson.Gson
import koin.dagger2.com.domain.router.ScreenRouter
import koin.dagger2.com.domain.router.ScreenRouterImpl
import koin.dagger2.com.external.scheduler.AppSchedulerProvider
import koin.dagger2.com.external.scheduler.SchedulerProvider
import org.koin.dsl.module.module

/**
 * Created by Yoga C. Pranata on 14/01/2019.
 * Android Engineer
 */
val appModule = module {
    factory<ScreenRouter> { ScreenRouterImpl() }
    factory<SchedulerProvider> { AppSchedulerProvider() }
    factory { Gson() }
}