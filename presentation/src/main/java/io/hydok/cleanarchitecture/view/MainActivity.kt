package io.hydok.cleanarchitecture.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import io.hydok.cleanarchitecture.R
import io.hydok.domain.usecase.GetSampleDataUseCase

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}