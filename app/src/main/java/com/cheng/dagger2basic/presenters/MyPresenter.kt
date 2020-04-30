package com.cheng.dagger2basic.presenters

import com.cheng.dagger2basic.applications.MyApplication
import com.cheng.dagger2basic.models.MyDatabase
import javax.inject.Inject

class MyPresenter {
    @Inject
    lateinit var db: MyDatabase

    init {
        MyApplication().getMyComponent().inject(this)
    }
}