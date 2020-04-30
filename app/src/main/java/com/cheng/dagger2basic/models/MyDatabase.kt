package com.cheng.dagger2basic.models

import android.content.Context
import javax.inject.Inject
import javax.inject.Named

class MyDatabase @Inject constructor(@Named("ApplicationContext") c: Context) {

}