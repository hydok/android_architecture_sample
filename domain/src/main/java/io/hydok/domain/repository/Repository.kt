package io.hydok.domain.repository

import io.hydok.domain.model.SampleModel

interface Repository {

    fun getSampleData() :List<SampleModel>

}