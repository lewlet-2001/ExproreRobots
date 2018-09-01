package com.a2001.lewlet.explorerobots

data class Rocket(val distance: Double,
                  val temperature: Double,
                  val spin: Double,
                  val energy: Double) {
    fun distanceString() = distance.toString() + UnitString.LY
    fun temperatureString() = temperature.toString() + UnitString.KER
    fun spinString() = spin.toString() + UnitString.DEG
    fun energyString() = energy.toString() + UnitString.WAT
}

data class Robot(val damage: Int, val plan: ((Rocket) -> Unit) -> Int) {
    fun apply(rocketUpdateFunc: (Rocket) -> Unit) = plan(rocketUpdateFunc)
}