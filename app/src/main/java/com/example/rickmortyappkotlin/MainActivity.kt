package com.example.rickmortyappkotlin

import android.app.Application
import com.example.rickmortyappkotlin.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import kotlin.text.Typography.dagger

@HiltAndroidApp
class MainActivity : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}