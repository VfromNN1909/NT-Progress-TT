package com.ntpro.mobileandroiddevtestwork.data.repository

import com.ntpro.mobileandroiddevtestwork.data.network.Server
import com.ntpro.mobileandroiddevtestwork.domain.repository.IRepository
import javax.inject.Inject

class NetworkRepository @Inject constructor(
    private val server: Server
) : IRepository.INetworkRepository {


}