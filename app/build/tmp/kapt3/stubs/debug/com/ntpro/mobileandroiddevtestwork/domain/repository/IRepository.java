package com.ntpro.mobileandroiddevtestwork.domain.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ntpro/mobileandroiddevtestwork/domain/repository/IRepository;", "", "INetworkRepository", "app_debug"})
public abstract interface IRepository {
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ntpro/mobileandroiddevtestwork/domain/repository/IRepository$INetworkRepository;", "", "getDealsFromServerFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ntpro/mobileandroiddevtestwork/domain/model/Deal;", "app_debug"})
    public static abstract interface INetworkRepository {
        
        @org.jetbrains.annotations.NotNull
        public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.ntpro.mobileandroiddevtestwork.domain.model.Deal>> getDealsFromServerFlow();
    }
}