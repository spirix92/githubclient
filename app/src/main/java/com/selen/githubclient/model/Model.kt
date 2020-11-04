package com.selen.githubclient.model

/**
 * @author Pyaterko Aleksey
 */
class Model {
    private val counters: MutableList<Int> = mutableListOf(0, 0, 0)

    fun next(number: ButtonNumber): Int {
        return ++counters[number.index]
    }
}