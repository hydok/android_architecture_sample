package io.hydok.data.usecaseImpl

import io.hydok.data.datasource.LocalDataSource
import io.hydok.domain.model.SampleModel
import io.hydok.domain.usecase.GetSampleDataUseCase
import javax.inject.Inject

class GetSampleDataUseCaseImpl @Inject constructor(private val localDataSource: LocalDataSource) :
    GetSampleDataUseCase {
    override fun invoke(query: String): List<SampleModel> {
        return localDataSource.getSampleLocalData()
    }
}