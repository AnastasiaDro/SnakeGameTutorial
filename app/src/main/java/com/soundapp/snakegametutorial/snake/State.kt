package com.soundapp.snakegametutorial.snake

data class State(
    val food: Pair<Int, Int>,           /** x and y coordinates of the food **/
    val snake: List<Pair<Int, Int>>,    /** x and y coordinates of the snake body **/
    val currentDirection: Int           /** will hold the direction in which the snake is moving **/
)
