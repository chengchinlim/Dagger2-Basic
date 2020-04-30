package com.cheng.dagger2basic.models

import javax.inject.Inject

class Wheel @Inject constructor() {
    var material = "rubber"
    var size = 20
}