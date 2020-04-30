package com.cheng.dagger2basic.models

import timber.log.Timber
import javax.inject.Inject

class Vehicle @Inject constructor(private val engine: Engine, private val wheel: Wheel) {
    private val vehicleNoOfWheels = 4

    fun printVehicleAttributes() {
        Timber.i("Vehicle with V${engine.noOfShafts} engine ${engine.horsePower} HP ")
        Timber.i("Has $vehicleNoOfWheels wheels size ${wheel.size} mm made of ${wheel.material}")
    }
}