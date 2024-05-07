package io.hydok.data.hilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.hydok.data.usecaseImpl.GetSampleDataUseCaseImpl
import io.hydok.domain.usecase.GetSampleDataUseCase

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {
    @Binds
    abstract fun bindGetSampleDataUseCase(impl: GetSampleDataUseCaseImpl): GetSampleDataUseCase
}