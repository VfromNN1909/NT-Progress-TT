package com.ntpro.mobileandroiddevtestwork.di

import com.ntpro.mobileandroiddevtestwork.data.network.Server
import com.ntpro.mobileandroiddevtestwork.data.repository.NetworkRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {

    @Provides
    @Singleton
    fun providesServer() = Server()

    @Provides
    fun providesNetworkRepository(server: Server) = NetworkRepository(server)
}