package koin.dagger2.com.data.network.services

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