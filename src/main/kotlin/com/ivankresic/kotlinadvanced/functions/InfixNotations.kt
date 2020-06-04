package com.ivankresic.kotlinadvanced.functions

/**
 * Created by ivan on 04/06/2020
 */

fun String.shouldBeEqualTo(value: String) = this == value //instance should be equal to passed parameter

infix fun String.shouldBeEqualTo2(value: String) = this == value //instance should be equal to passed parameter

fun main(args: Array<String>) {

    "Hello".shouldBeEqualTo("Hello")

    /**
     * In case of extension function or member function that have single parameters
     * in Kotlin it is possible to call it using infix notation
     * */
    "Hello" shouldBeEqualTo2 "Hello" //using infix notation

    val output = "Hello"
    output shouldBeEqualTo2 "Hello"

}