package koin.dagger2.com.data.network.repository

import io.reactivex.Observable
import koin.dagger2.com.data.responses.events.Events
import koin.dagger2.com.data.responses.leagues.Leagues
import koin.dagger2.com.data.responses.teams.Teams

/**
 * Created by Yoga C. Pranata on 11/01/2019.
 * Android Engineer
 */
interface SportDbRepository {
    fun searchAllTeams(league: String): Observable<Teams.Response>
    fun getAllLeagues(): Observable<Leagues.Response>
    fun searchNextEvents(id: String): Observable<Events.Response>
    fun searchPastEvents(id: String): Observable<Events.Response>
    fun getEventDetails(id: String) : Observable<Events.Response>
    fun getImageTeam(team: String)  : Observable<Teams.Response>
}