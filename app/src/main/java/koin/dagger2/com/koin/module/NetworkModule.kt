package koin.dagger2.com.koin.module

import koin.dagger2.com.data.network.httpclient.httpClient
import koin.dagger2.com.data.network.httpclient.restClient
import koin.dagger2.com.data.network.httpclient.sportDbServices
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.module

/**
 * Created by Yoga C. Pranata on 14/01/2019.
 * Android Engineer
 */
val networkModule = module {
    factory { httpClient(androidApplication()) }
    single { restClient(get()) }
    single { sportDbServices(get()) }
}