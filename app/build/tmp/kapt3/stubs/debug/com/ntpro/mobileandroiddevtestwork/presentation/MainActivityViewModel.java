package com.ntpro.mobileandroiddevtestwork.presentation;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ntpro/mobileandroiddevtestwork/presentation/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ntpro/mobileandroiddevtestwork/data/repository/NetworkRepository;", "(Lcom/ntpro/mobileandroiddevtestwork/data/repository/NetworkRepository;)V", "getDealsFromServerFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ntpro/mobileandroiddevtestwork/domain/model/Deal;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.ntpro.mobileandroiddevtestwork.data.repository.NetworkRepository repository = null;
    
    @javax.inject.Inject
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull
    com.ntpro.mobileandroiddevtestwork.data.repository.NetworkRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.ntpro.mobileandroiddevtestwork.domain.model.Deal>> getDealsFromServerFlow() {
        return null;
    }
}