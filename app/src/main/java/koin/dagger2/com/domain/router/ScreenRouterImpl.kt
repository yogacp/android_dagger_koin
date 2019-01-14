package koin.dagger2.com.domain.router

import android.content.Context
import android.content.Intent

/**
 * Created by Yoga C. Pranata on 11/01/2019.
 * Android Engineer
 */
class ScreenRouterImpl : ScreenRouter {

    override fun getScreenIntent(context: Context, screen: ScreenRouter.ActivityScreen): Intent? {
        val c: Class<*>? = when (screen) {
            ScreenRouter.ActivityScreen.DetailFootballClub -> null
        }
        return if (c == null) null else Intent(context, c)
    }

}