package com.example.a1stgame

import org.junit.Assert
import org.junit.Test

class GameTest {

    @Test
    fun testPickRandomOptions() {
        val options = listOf("rock", "scissor", "paper")
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))

    }

    @Test
    fun testPickDrawable() {
        Assert.assertEquals(R.drawable.paper, Game.pickDrawable("paper"))
        Assert.assertEquals(R.drawable.rock, Game.pickDrawable("rock"))
        Assert.assertEquals(R.drawable.scissor, Game.pickDrawable("scissor"))
    }

    @Test
    fun isDraw() {
        Assert.assertTrue(Game.isDraw ("rock", "rock"))
        Assert.assertTrue(Game.isDraw ("paper", "paper"))
        Assert.assertTrue(Game.isDraw ("scissor", "scissor"))

        Assert.assertFalse(Game.isDraw ("rock", "paper"))
        Assert.assertFalse(Game.isDraw ("paper", "scissor"))
        Assert.assertFalse(Game.isDraw ("scissor", "rock"))



    }

    @Test
    fun isWin() {
        Assert.assertTrue(Game.isWin("rock", "scissor"))
        Assert.assertTrue(Game.isWin("scissor", "paper"))
        Assert.assertTrue(Game.isWin("paper", "rock"))

        Assert.assertFalse(Game.isWin("rock", "paper"))
        Assert.assertFalse(Game.isWin("scissor", "rock"))
        Assert.assertFalse(Game.isWin("paper", "scissor"))
    }
}