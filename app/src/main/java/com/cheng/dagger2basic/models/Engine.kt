package com.cheng.dagger2basic.models

import javax.inject.Inject

class Engine @Inject constructor() {
    var horsePower = 300
    var noOfShafts = 8
}