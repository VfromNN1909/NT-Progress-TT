package com.ntpro.mobileandroiddevtestwork.presentation

import androidx.lifecycle.ViewModel
import com.ntpro.mobileandroiddevtestwork.data.repository.NetworkRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val repository: NetworkRepository
) : ViewModel() {

}