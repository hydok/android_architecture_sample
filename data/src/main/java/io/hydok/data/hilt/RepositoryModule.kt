package io.hydok.data.hilt


import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.hydok.data.repositoryImpl.RepositoryImpl
import io.hydok.domain.repository.Repository

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(impl: RepositoryImpl): Repository

}