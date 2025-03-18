package com.example.flippers

import kotlin.math.abs
import kotlin.random.Random

class Coin {
    /**
     * Returns a 0 or 1 for either heads or tails
     * 0 - heads
     * 1 - tails
     */
    fun flip(): Int {
        return abs(Random.nextInt() % 2)
    }
}