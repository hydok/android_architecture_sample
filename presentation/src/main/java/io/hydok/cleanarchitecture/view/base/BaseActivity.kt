package io.hydok.cleanarchitecture.view.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
* 공통 기능 작성
* @author hydok
* @version 1.0.0
* @since 2022/10/21 3:26 오후
**/
abstract class BaseActivity<VB : ViewDataBinding>(@LayoutRes private val layoutRes: Int) : AppCompatActivity() {
    lateinit var binding : VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutRes)

        setUI()
        setListener()
        setObserver()
        initData()
    }

    protected abstract fun initData()
    protected abstract fun setUI()
    protected abstract fun setObserver()
    protected abstract fun setListener()
}