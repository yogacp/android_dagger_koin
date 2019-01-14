package koin.dagger2.com.presentation.detailpage.presenter

import android.os.Bundle
import koin.dagger2.com.external.constant.AppConstant
import koin.dagger2.com.presentation.detailpage.contract.DetailPageContract

/**
 * Created by Yoga C. Pranata on 11/01/2019.
 * Android Engineer
 */
class DetailPagePresenter : DetailPageContract.UserActionListener {

    private var view: DetailPageContract.View? = null

    override fun onAttachedView(activity: DetailPageContract.View) {
        view = activity
    }

    override fun getFootballClub(bundle: Bundle) {
        bundle.let {
            val teamId = it.getString(AppConstant.INTENT_BUNDLE.TAG_FCID)
            val title = it.getString(AppConstant.INTENT_BUNDLE.TAG_FCNAME)
            val desc = it.getString(AppConstant.INTENT_BUNDLE.TAG_FCDESC)
            val image = it.getString(AppConstant.INTENT_BUNDLE.TAG_FCIMAGE)

            view?.setupToolbar(title)
            view?.setContentDetail(title, desc, image)
        }
    }

}