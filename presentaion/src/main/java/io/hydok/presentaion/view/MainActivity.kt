package io.hydok.presentaion.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import io.hydok.presentation.R
import dagger.hilt.android.AndroidEntryPoint
import io.hydok.domain.repository.Repository
import io.hydok.domain.usecase.GetSampleDataUseCase
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //UseCase 주입
    @Inject lateinit var useCase : GetSampleDataUseCase

    //Repository 주입
    @Inject lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val data = useCase.invoke("sample")
       Log.d("MainActivity", data.toString())



    }
}