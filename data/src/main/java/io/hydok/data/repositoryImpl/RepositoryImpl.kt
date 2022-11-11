package io.hydok.data.repositoryImpl

import io.hydok.data.datasource.LocalDataSource
import io.hydok.data.datasource.RemoteDataSource
import io.hydok.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val remoteDataSource: RemoteDataSource,
    val localDataSource: LocalDataSource
) : Repository {
    override fun getSampleData() = remoteDataSource.getSampleRemoteData()
}