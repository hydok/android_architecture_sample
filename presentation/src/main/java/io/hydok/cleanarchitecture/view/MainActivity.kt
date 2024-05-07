package io.hydok.cleanarchitecture.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import io.hydok.cleanarchitecture.R
import io.hydok.domain.repository.Repository
import io.hydok.domain.usecase.GetSampleDataUseCase
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    //UseCase 호출
    @Inject lateinit var useCase :GetSampleDataUseCase

    //Repository 호출
    @Inject lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = useCase.invoke("sample")
        Log.d("MainActivity", data.toString())



    }
}