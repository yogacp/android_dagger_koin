package koin.dagger2.com.presentation.homepage.presenter

import io.reactivex.disposables.CompositeDisposable
import koin.dagger2.com.data.responses.teams.Teams
import koin.dagger2.com.presentation.homepage.contract.HomePageContract
import koin.dagger2.com.presentation.homepage.usecase.HomepageUseCase

/**
 * Created by Yoga C. Pranata on 14/01/2019.
 * Android Engineer
 */
class HomePagePresenter (val mUseCase: HomepageUseCase) : HomePageContract.UserActionListener {

    private var view: HomePageContract.View? = null
    private var mCompositeDisposable = CompositeDisposable()

    override fun onAttachedView(activity: HomePageContract.View) {
        view = activity
        view?.initData()
    }

    override fun getListFootballClub(league: String) {
        view?.showProgressBar()
        view?.hideEmptyView()
        mCompositeDisposable.add(
            mUseCase.searchAllTeams(league).subscribe({ response ->
                view?.hideProgressBar()
                if (response.teams != null) {
                    val teamList = ArrayList<Teams.TeamsData>()
                    response.teams?.forEach {
                        teamList.add(it)
                    }
                    view?.setupAdapter(teamList)
                } else {
                    view?.showEmptyView()
                    view?.clearTeamList()
                }
            }, { error ->
                view?.hideProgressBar()
                view?.showEmptyView()
                view?.clearTeamList()
                view?.showError("Error while fetching club list")
            })
        )
    }

    override fun getAllLeagues() {
        view?.showProgressBar()
        view?.hideEmptyView()
        mCompositeDisposable.add(
            mUseCase.getAllLeagues().subscribe({ response ->
                val leaguesName = ArrayList<String>()
                response.leagues?.forEach {
                    leaguesName.add(it.strLeague!!)
                }
                view?.hideProgressBar()
                view?.setupLeaguesAdapter(leaguesName)
            }, { error ->
                view?.hideProgressBar()
                view?.showEmptyView()
                view?.showError("Error while fetching all leagues")
            })
        )
    }

}