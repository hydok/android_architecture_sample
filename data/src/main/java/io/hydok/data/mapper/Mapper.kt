package io.hydok.data.mapper

import io.hydok.data.entity.SampleEntity
import io.hydok.domain.model.SampleModel


/**
 * Data Layer에서 타 계층으로 Data전달 시 해당 Layer에 사용되도록 변환
 */
fun mapperToUserData(entitys: List<SampleEntity>): List<SampleModel> {
    //아하하하
    return entitys.map {
        SampleModel(
            it.id.toInt(),
            it.name
        )
    }
}