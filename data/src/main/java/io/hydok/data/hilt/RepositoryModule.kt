package io.hydok.data.hilt


import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.hydok.data.datasource.LocalDataSource
import io.hydok.data.datasource.LocalDataSourceImpl
import io.hydok.data.datasource.RemoteDataSource
import io.hydok.data.datasource.RemoteDataSourceImpl
import io.hydok.data.repositoryImpl.RepositoryImpl
import io.hydok.domain.repository.Repository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(impl: RepositoryImpl): Repository

}