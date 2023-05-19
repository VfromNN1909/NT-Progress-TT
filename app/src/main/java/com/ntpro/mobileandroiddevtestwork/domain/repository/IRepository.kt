package com.ntpro.mobileandroiddevtestwork.domain.repository

import com.ntpro.mobileandroiddevtestwork.domain.model.Deal
import kotlinx.coroutines.flow.Flow

interface IRepository {

    interface INetworkRepository {

        fun getDealsFromServerFlow(): Flow<List<Deal>>
    }
}