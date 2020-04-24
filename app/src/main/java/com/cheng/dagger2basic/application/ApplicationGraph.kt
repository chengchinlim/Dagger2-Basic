package com.cheng.dagger2basic.application

import com.cheng.dagger2basic.views.FieldInjectionActivity
import dagger.Component

@Component
interface ApplicationGraph {
    fun inject(app: FieldInjectionActivity)
}