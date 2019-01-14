package koin.dagger2.com.presentation.homepage.usecase

import io.reactivex.Observable
import koin.dagger2.com.data.responses.leagues.Leagues
import koin.dagger2.com.data.responses.teams.Teams

/**
 * Created by Yoga C. Pranata on 14/01/2019.
 * Android Engineer
 */
interface HomepageUseCase {
    fun searchAllTeams(league: String) : Observable<Teams.Response>
    fun getAllLeagues() : Observable<Leagues.Response>
}