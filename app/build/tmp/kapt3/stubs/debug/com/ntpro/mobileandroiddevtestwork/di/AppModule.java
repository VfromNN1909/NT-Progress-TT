package com.ntpro.mobileandroiddevtestwork.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ntpro/mobileandroiddevtestwork/di/AppModule;", "", "()V", "providesNetworkRepository", "Lcom/ntpro/mobileandroiddevtestwork/data/repository/NetworkRepository;", "server", "Lcom/ntpro/mobileandroiddevtestwork/data/network/Server;", "providesServer", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.ntpro.mobileandroiddevtestwork.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.ntpro.mobileandroiddevtestwork.data.network.Server providesServer() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.ntpro.mobileandroiddevtestwork.data.repository.NetworkRepository providesNetworkRepository(@org.jetbrains.annotations.NotNull
    com.ntpro.mobileandroiddevtestwork.data.network.Server server) {
        return null;
    }
}