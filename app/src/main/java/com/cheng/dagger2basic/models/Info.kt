package com.cheng.dagger2basic.models

import javax.inject.Inject

class Info @Inject constructor(){
    val text = "Hello Dagger 2"
}