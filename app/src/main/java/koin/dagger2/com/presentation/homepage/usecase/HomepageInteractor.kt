package koin.dagger2.com.presentation.homepage.usecase

import io.reactivex.Observable
import koin.dagger2.com.data.network.repository.SportDbRepository
import koin.dagger2.com.data.responses.leagues.Leagues
import koin.dagger2.com.data.responses.teams.Teams

/**
 * Created by Yoga C. Pranata on 14/01/2019.
 * Android Engineer
 */
class HomepageInteractor (val mRepository: SportDbRepository) : HomepageUseCase {

    override fun searchAllTeams(league: String): Observable<Teams.Response> {
        return mRepository.searchAllTeams(league).flatMap {
            Observable.just(it)
        }
    }

    override fun getAllLeagues(): Observable<Leagues.Response> {
        return mRepository.getAllLeagues().flatMap {
            Observable.just(it)
        }
    }
}