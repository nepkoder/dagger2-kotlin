package com.ims.daggermvvmrxjavatest.di

import com.ims.daggermvvmrxjavatest.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector()
    abstract fun contributeMainActivity(): MainActivity
}