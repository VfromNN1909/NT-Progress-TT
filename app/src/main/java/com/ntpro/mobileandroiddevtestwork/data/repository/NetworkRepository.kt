package com.ntpro.mobileandroiddevtestwork.data.repository

import com.ntpro.mobileandroiddevtestwork.data.network.Server
import com.ntpro.mobileandroiddevtestwork.domain.model.Deal
import com.ntpro.mobileandroiddevtestwork.domain.repository.IRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NetworkRepository @Inject constructor(
    private var server: Server?
) : IRepository.INetworkRepository {

    override fun getDealsFromServerFlow(): Flow<List<Deal>> = callbackFlow {
        server?.subscribeToDeals { deals ->
            trySend(deals)
        }
        awaitClose {
            server = null
        }
    }.flowOn(Dispatchers.IO)
}