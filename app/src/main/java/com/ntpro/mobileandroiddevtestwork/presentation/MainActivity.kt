package com.ntpro.mobileandroiddevtestwork.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.ntpro.mobileandroiddevtestwork.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    private var scope: CoroutineScope? = CoroutineScope(Dispatchers.Main) + SupervisorJob()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: MainActivityViewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        scope?.launch {
            viewModel.getDealsFromServerFlow().collectLatest { data ->
                Log.d("data_from_server", data.toString())
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        scope = null
    }
}