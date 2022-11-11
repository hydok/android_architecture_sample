package io.hydok.cleanarchitecture.hilt


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.hydok.data.datasource.LocalDataSource
import io.hydok.data.datasource.RemoteDataSource
import io.hydok.data.repositoryImpl.RepositoryImpl
import io.hydok.domain.repository.Repository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {


    @Singleton
    @Provides
    fun provideRepository(
        remoteDataSource: RemoteDataSource,
        localDataSource: LocalDataSource
    ): Repository = RepositoryImpl(remoteDataSource, localDataSource)


}