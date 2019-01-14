package koin.dagger2.com.presentation.detailpage.module

import koin.dagger2.com.presentation.detailpage.contract.DetailPageContract
import koin.dagger2.com.presentation.detailpage.presenter.DetailPagePresenter
import koin.dagger2.com.presentation.detailpage.view.DetailPageActivity
import org.koin.dsl.module.module

/**
 * Created by Yoga C. Pranata on 11/01/2019.
 * Android Engineer
 */
val detailPageModule = module {
    single { DetailPagePresenter() }
}