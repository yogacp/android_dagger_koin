package koin.dagger2.com.koin.component

import koin.dagger2.com.koin.module.appModule
import koin.dagger2.com.koin.module.networkModule
import koin.dagger2.com.presentation.detailpage.module.detailPageModule
import koin.dagger2.com.presentation.homepage.module.homePageModule
import org.koin.dsl.module.Module

/**
 * Created by Yoga C. Pranata on 14/01/2019.
 * Android Engineer
 */
val appComponent: List<Module> = listOf(appModule, networkModule, homePageModule, detailPageModule)