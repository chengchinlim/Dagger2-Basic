package com.cheng.dagger2basic.applications

import android.app.Application
import com.cheng.dagger2basic.components.DaggerMyComponent
import com.cheng.dagger2basic.components.MyComponent
import com.cheng.dagger2basic.modules.ContextModule

class MyApplication: Application() {
    companion object {
        private lateinit var component: MyComponent
    }

    override fun onCreate() {
        super.onCreate()
        component = DaggerMyComponent.builder()
            .contextModule(ContextModule(applicationContext)).build()
    }

    fun getMyComponent(): MyComponent {
        return component
    }
}