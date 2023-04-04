package com.hfad.myapplication

import android.app.Application

class MyApplication: Application() {
    fun getRepository(): TracksRepositoryImpl {
        TracksRepositoryImpl(NetworkClientImpl())
    }

    fun provideTracksInteractor(): TrackInteractor {
        return TracksInteractorImpl(getRepository())
    }
}