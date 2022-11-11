package io.hydok.data.datasource

import io.hydok.domain.model.SampleModel

interface LocalDataSource {
    fun getSampleLocalData():List<SampleModel>
}