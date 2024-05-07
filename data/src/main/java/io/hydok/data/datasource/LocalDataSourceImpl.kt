package io.hydok.data.datasource

import io.hydok.domain.model.SampleModel
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor() : LocalDataSource {
    override fun getSampleLocalData(): List<SampleModel> {
        // TODO: get Data from Room
        return listOf(
            SampleModel(1, "name1"),
            SampleModel(2, "name2"),
            SampleModel(3, "name3")
        )
    }
}