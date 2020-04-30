package com.cheng.dagger2basic.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ContextModule(c: Context) {
    private val requiredContext = c

    @Provides
    @Named("ApplicationContext")
    fun getContext(): Context {
        return requiredContext
    }
}