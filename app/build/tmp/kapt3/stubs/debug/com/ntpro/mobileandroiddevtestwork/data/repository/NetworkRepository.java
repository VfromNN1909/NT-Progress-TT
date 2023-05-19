package com.ntpro.mobileandroiddevtestwork.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ntpro/mobileandroiddevtestwork/data/repository/NetworkRepository;", "Lcom/ntpro/mobileandroiddevtestwork/domain/repository/IRepository$INetworkRepository;", "server", "Lcom/ntpro/mobileandroiddevtestwork/data/network/Server;", "(Lcom/ntpro/mobileandroiddevtestwork/data/network/Server;)V", "getDealsFromServerFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ntpro/mobileandroiddevtestwork/domain/model/Deal;", "app_debug"})
public final class NetworkRepository implements com.ntpro.mobileandroiddevtestwork.domain.repository.IRepository.INetworkRepository {
    @org.jetbrains.annotations.Nullable
    private com.ntpro.mobileandroiddevtestwork.data.network.Server server;
    
    @javax.inject.Inject
    public NetworkRepository(@org.jetbrains.annotations.Nullable
    com.ntpro.mobileandroiddevtestwork.data.network.Server server) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.ntpro.mobileandroiddevtestwork.domain.model.Deal>> getDealsFromServerFlow() {
        return null;
    }
}