package io.hydok.cleanarchitecture.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.hydok.data.api.ApiService
import io.hydok.data.datasource.LocalDataSource
import io.hydok.data.datasource.LocalDataSourceImpl
import io.hydok.data.datasource.RemoteDataSource
import io.hydok.data.datasource.RemoteDataSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {


    @Singleton
    @Provides
    fun provideRemoteDataSource(apiService: ApiService): RemoteDataSource =
        RemoteDataSourceImpl(apiService)

    @Singleton
    @Provides
    fun provideLocalDataSource(): LocalDataSource =
        LocalDataSourceImpl()



}