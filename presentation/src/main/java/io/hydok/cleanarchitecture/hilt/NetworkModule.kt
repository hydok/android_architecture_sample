package io.hydok.cleanarchitecture.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.hydok.data.api.ApiService
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


    // TODO: Retrofit 객체 생성
    @Singleton
    @Provides
    fun provideApiService(): ApiService = ApiService()

}