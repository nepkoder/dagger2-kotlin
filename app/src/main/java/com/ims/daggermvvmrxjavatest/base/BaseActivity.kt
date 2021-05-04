package com.ims.daggermvvmrxjavatest.base

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

abstract class BaseActivity<T : ViewDataBinding, V : ViewModel> : AppCompatActivity() {

    val viewDataBinding: T
        get() {
            return viewDataBinding
        }
    val viewModel: V
        get() {
            return viewModel
        }


}