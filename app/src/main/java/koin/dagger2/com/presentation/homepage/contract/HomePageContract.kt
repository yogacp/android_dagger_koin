package koin.dagger2.com.presentation.homepage.contract

import android.widget.ImageView
import android.widget.ProgressBar
import koin.dagger2.com.data.responses.teams.Teams

/**
 * Created by Yoga C. Pranata on 14/01/2019.
 * Android Engineer
 */
class HomePageContract {
    interface View {
        fun initData()
        fun loadImageToImageView(imageSource: String, imgView: ImageView, progressBar: ProgressBar)
        fun setupAdapter(fcList: ArrayList<Teams.TeamsData>?)
        fun setupLeaguesAdapter(leagues: ArrayList<String>)
        fun setupToolbar(title: String?)
        fun setupUiSpinner()
        fun showError(message: String)
        fun showProgressBar()
        fun hideProgressBar()
        fun showEmptyView()
        fun hideEmptyView()
        fun clearTeamList()
    }

    interface UserActionListener {
        fun onAttachedView(activity: View)
        fun getListFootballClub(league: String)
        fun getAllLeagues()
    }

    interface Router {
        fun goToDetailPage(fcName: String?, fcDesc: String?, fcImage: String?)
    }
}