package com.hfad.myapplication

object Creator {
    fun getRepository(): TracksRepositoryImpl {
        TracksRepositoryImpl(NetworkClientImpl())
    }

    fun provideTracksInteractor(): TrackInteractor {
        return TracksInteractorImpl(getRepository())
    }
}