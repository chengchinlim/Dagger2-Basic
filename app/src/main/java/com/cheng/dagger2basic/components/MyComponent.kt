package com.cheng.dagger2basic.components

import com.cheng.dagger2basic.modules.ContextModule
import com.cheng.dagger2basic.modules.NetworkModule
import com.cheng.dagger2basic.presenters.MyPresenter
import com.cheng.dagger2basic.views.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [ContextModule::class, NetworkModule::class])
interface MyComponent {
    fun inject(app: MainActivity)
    fun inject(presenter: MyPresenter)
}