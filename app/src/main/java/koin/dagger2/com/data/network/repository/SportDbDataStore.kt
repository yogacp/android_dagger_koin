package koin.dagger2.com.data.network.repository

import io.reactivex.Observable
import koin.dagger2.com.data.network.services.SportDbServices
import koin.dagger2.com.data.responses.events.Events
import koin.dagger2.com.data.responses.leagues.Leagues
import koin.dagger2.com.data.responses.teams.Teams
import koin.dagger2.com.external.scheduler.SchedulerProvider

/**
 * Created by Yoga C. Pranata on 11/01/2019.
 * Android Engineer
 */
class SportDbDataStore constructor(
    val mService: SportDbServices,
    val mScheduler: SchedulerProvider
) : SportDbRepository {

    override fun searchAllTeams(league: String): Observable<Teams.Response> {
        return mService.searchAllTeams(league)
            .subscribeOn(mScheduler.io())
            .observeOn(mScheduler.mainThread())
    }

    override fun getAllLeagues(): Observable<Leagues.Response> {
        return mService.getAllLeagues()
            .subscribeOn(mScheduler.io())
            .observeOn(mScheduler.mainThread())
    }

    override fun searchNextEvents(id: String): Observable<Events.Response> {
        return mService.searchNextEvents(id)
            .subscribeOn(mScheduler.io())
            .observeOn(mScheduler.mainThread())
    }

    override fun searchPastEvents(id: String): Observable<Events.Response> {
        return mService.searchPastEvents(id)
            .subscribeOn(mScheduler.io())
            .observeOn(mScheduler.mainThread())
    }

    override fun getEventDetails(id: String): Observable<Events.Response> {
        return mService.getDetailEvents(id)
            .subscribeOn(mScheduler.io())
            .observeOn(mScheduler.mainThread())
    }

    override fun getImageTeam(team: String): Observable<Teams.Response> {
        return mService.getImageTeams(team)
            .subscribeOn(mScheduler.io())
            .observeOn(mScheduler.mainThread())
    }

}