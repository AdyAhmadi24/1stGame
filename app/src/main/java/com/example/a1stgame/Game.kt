package com.example.a1stgame

import kotlin.random.Random

object Game {

    private val rules = mapOf(
        "rock-scissor" to true,
        "rock-paper" to false,
        "scissor-paper" to true,
        "scissor-rock" to false,
        "paper-rock" to true,
        "paper-scissor" to false,
    )

    private val options = listOf("rock","paper","scissor")

    private val optionDrawable = mapOf(
        "rock" to R.drawable.rock,
        "scissor" to R.drawable.scissor,
        "paper" to R.drawable.paper,
    )

    fun pickRandomOption(): String = options[Random.nextInt(0, 3)]

    fun pickDrawable(option: String): Int = optionDrawable[option]!!

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!

}