package koin.dagger2.com.data.network.services

import io.reactivex.Observable
import koin.dagger2.com.data.responses.events.Events
import koin.dagger2.com.data.responses.leagues.Leagues
import koin.dagger2.com.data.responses.teams.Teams
import koin.dagger2.com.external.constant.RestConstant
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Yoga C. Pranata on 11/01/2019.
 * Android Engineer
 */
interface SportDbServices {
    @GET(RestConstant.SPORTDB.searchAllTeams)
    fun searchAllTeams(@Query("l") l: String): Observable<Teams.Response>

    @GET(RestConstant.SPORTDB.getImageTeams)
    fun getImageTeams(@Query("t") t: String): Observable<Teams.Response>

    @GET(RestConstant.SPORTDB.searchNextEvents)
    fun searchNextEvents(@Query("id") id: String): Observable<Events.Response>

    @GET(RestConstant.SPORTDB.searchPrevEvents)
    fun searchPastEvents(@Query("id") id: String): Observable<Events.Response>

    @GET(RestConstant.SPORTDB.getDetailEvents)
    fun getDetailEvents(@Query("id") id: String): Observable<Events.Response>

    @GET(RestConstant.SPORTDB.getAllLeagues)
    fun getAllLeagues(): Observable<Leagues.Response>
}