package io.hydok.data.mapper

import io.hydok.data.entity.SampleEntity
import io.hydok.domain.model.SampleModel

fun mapperToUserData(entitys: List<SampleEntity>): List<SampleModel> {
    return entitys.map {
        SampleModel(
            it.id.toInt(),
            it.name
        )
    }
}