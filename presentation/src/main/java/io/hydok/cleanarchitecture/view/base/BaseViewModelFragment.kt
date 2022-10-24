package io.hydok.cleanarchitecture.view.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 *
 */

abstract class BaseViewModelFragment<VB : ViewDataBinding, VM : BaseViewModel>(private val layoutRes: Int) :
    Fragment() {

    lateinit var binding: VB
    abstract val viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setUI()
        setObserver()
        setListener()
        initData()
        super.onViewCreated(view, savedInstanceState)
    }
    protected abstract fun initData()
    protected abstract fun setUI()
    protected abstract fun setObserver()
    protected abstract fun setListener()
}