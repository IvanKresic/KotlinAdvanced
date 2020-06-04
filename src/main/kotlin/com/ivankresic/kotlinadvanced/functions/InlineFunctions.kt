package com.ivankresic.kotlinadvanced.functions

/**
 * Created by ivan on 04/06/2020
 *
 * I don't get what this is for -> this is something on bytecode level --> TODO: examine inline more!!
 */

inline fun operation(op: () -> Unit){
    println("Before calling op")
    op()
    println("After calling op")
}

fun main(args: Array<String>) {
    operation { println("This is the actual op function") }
}