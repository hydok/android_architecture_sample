package io.hydok.data.datasource

import io.hydok.data.api.ApiService
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(val apiService: ApiService) : RemoteDataSource {
    override fun getSampleRemoteData() {

    }
}