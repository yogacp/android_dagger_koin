package koin.dagger2.com.external.scheduler

import io.reactivex.Scheduler

/**
 * Created by Yoga C. Pranata on 11/01/2019.
 * Android Engineer
 */
interface SchedulerProvider{
    fun ui(): Scheduler
    fun computation(): Scheduler
    fun io(): Scheduler
    fun mainThread() : Scheduler
}