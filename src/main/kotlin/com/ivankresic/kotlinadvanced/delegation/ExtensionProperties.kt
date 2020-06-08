package com.ivankresic.kotlinadvanced.delegation

/**
 * Created by ivan on 08/06/2020
 */
//This is extension property
val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main(args: Array<String>) {
    println("Hello".hasAmpersand)
    println("Hello&".hasAmpersand)
}