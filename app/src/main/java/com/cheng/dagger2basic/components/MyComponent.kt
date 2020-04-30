package com.cheng.dagger2basic.components

import com.cheng.dagger2basic.modules.ContextModule
import com.cheng.dagger2basic.presenters.MyPresenter
import com.cheng.dagger2basic.views.MainActivity
import dagger.Component

@Component (modules = [ContextModule::class])
interface MyComponent {
    fun inject(app: MainActivity)
    fun inject(presenter: MyPresenter)
}