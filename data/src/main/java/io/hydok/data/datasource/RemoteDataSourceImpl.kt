package io.hydok.data.datasource

import android.util.Log
import io.hydok.data.api.ApiService
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(val apiService: ApiService) : RemoteDataSource {
    override fun getSampleRemoteData() {
        // TODO: get Data from apiService
        Log.d("RemoteDataSource","Sample")
    }
}