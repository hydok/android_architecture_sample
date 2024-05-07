package io.hydok.domain.usecase

import io.hydok.domain.model.SampleModel

interface GetSampleDataUseCase {

    operator fun invoke(query: String):List<SampleModel>

}