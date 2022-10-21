package io.hydok.data.repositoryImpl

import io.hydok.data.datasource.RemoteDataSource
import io.hydok.domain.repository.Repository

class RepositoryImpl(val remoteDataSource: RemoteDataSource) : Repository {
}