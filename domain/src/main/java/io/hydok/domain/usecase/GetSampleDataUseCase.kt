package io.hydok.domain.usecase

import android.util.Log
import io.hydok.domain.repository.Repository
import javax.inject.Inject

class GetSampleDataUseCase @Inject constructor(private val repository: Repository) {
    operator fun invoke(query: String) {
        repository.getSampleData()
        Log.d("UseCase Invoke","Sample")
    }
}