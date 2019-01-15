package koin.dagger2.com.presentation.homepage.router

import android.content.Context
import koin.dagger2.com.domain.router.ScreenRouter
import koin.dagger2.com.external.constant.AppConstant
import koin.dagger2.com.presentation.homepage.contract.HomePageContract

/**
 * Created by Yoga C. Pranata on 14/01/2019.
 * Android Engineer
 */
class HomepageRouter(
    val mScreenRouter: ScreenRouter,
    val mContext: Context
) : HomePageContract.Router {

    override fun goToDetailPage(fcName: String?, fcDesc: String?, fcImage: String?) {
        val mScreen = mScreenRouter.getScreenIntent(mContext, ScreenRouter.ActivityScreen.DetailFootballClub)
        mScreen.apply {
            this?.putExtra(AppConstant.INTENT_BUNDLE.TAG_FCNAME, fcName)
            this?.putExtra(AppConstant.INTENT_BUNDLE.TAG_FCDESC, fcDesc)
            this?.putExtra(AppConstant.INTENT_BUNDLE.TAG_FCIMAGE, fcImage)
        }
        mScreen?.run { mContext.startActivity(this) }
    }

}