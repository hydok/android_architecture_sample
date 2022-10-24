package io.hydok.cleanarchitecture.view.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.hydok.cleanarchitecture.utils.FetchState
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.net.SocketException
import java.net.UnknownHostException

abstract class BaseViewModel : ViewModel() {
    private val _fetchState = MutableLiveData<FetchState>()
    val fetchState : LiveData<FetchState>
        get() = _fetchState



    open fun launchViewModelScope(doWork: suspend () -> Unit) =
        viewModelScope.launch(viewModelScope.coroutineContext + Dispatchers.IO + exceptionHandler) {
            doWork()
        }

    private val exceptionHandler = CoroutineExceptionHandler{ _, throwable ->
        throwable.printStackTrace()

        when(throwable){
            is SocketException -> _fetchState.postValue(FetchState.INTERNET_ERROR)
            //is HttpException -> _fetchState.postValue(FetchState.PARSE_ERROR)
            is UnknownHostException -> _fetchState.postValue(FetchState.WRONG_CONNECTION)
            else -> _fetchState.postValue(FetchState.FAIL)
        }
    }
}