package com.ivankresic.kotlinadvanced.metaprogramming

/**
 * Created by ivan on 08/06/2020
 */

fun main(args: Array<String>) {
    //This is KClass-> Kotlin class
    println(Transaction::class)

    val classInfo = Transaction::class
    classInfo.members.forEach {
        println("${it.name} of type ${it.returnType}")
    }
}