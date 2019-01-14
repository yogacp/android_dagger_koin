package koin.dagger2.com.external.extention

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Yoga C. Pranata on 11/01/2019.
 * Android Engineer
 */
infix fun ViewGroup.inflate(layoutResId: Int): View =
    LayoutInflater.from(context).inflate(layoutResId, this, false)