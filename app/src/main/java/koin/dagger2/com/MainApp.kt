package koin.dagger2.com

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex
import koin.dagger2.com.koin.component.appComponent
import org.koin.android.ext.android.startKoin

/**
 * Created by Yoga C. Pranata on 14/01/2019.
 * Android Engineer
 */
class MainApp : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        startKoin(this, appComponent)
    }
}