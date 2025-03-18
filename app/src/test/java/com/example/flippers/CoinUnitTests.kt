package com.example.flippers

import org.junit.Test

import org.junit.Assert.*

class CoinUnitTests {
    /**
     * Ensures that the flip only returns 0 or 1
     */
    @Test
    fun twoFaces() {
        val flipCount = 10000
        val coin = Coin()

        var flipResult = -1

        //Performs many flips
        for (i in 1..flipCount) {
            flipResult = coin.flip()

            //Fails if the result is not a 0 or 1
            if (flipResult != 0 or 1)
                throw Exception("Coin flip was $flipResult not 0 or 1")
        }
    }

    /**
     * Checks that coin flips are close to a 50/50 chance
     */
    @Test
    fun fairCoinFlips() {
        val flipCount = 10000 //Number of flips to be performed
        val coin = Coin() //Instance of a coin
        val delta = 0.005f //Provides wiggle room for result

        var total = 0.0f

        //Performs many flips
        for (i in 1..flipCount)
            total += coin.flip()

        assertEquals(0.5f, total / flipCount, delta)
    }
}