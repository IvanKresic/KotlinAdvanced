package com.ivankresic.kotlinadvanced.functions

/**
 * Created by ivan on 04/06/2020
 */

/*
* Local function or function inside function
* */
fun foo(fooParam: String){

    val outerFunction = "Value"

    fun bar(barParam: String){
        println(barParam)

        /*
        * Inner function can have access to the outer function parameter  and variables
        * */
        println(fooParam)
        println(outerFunction)
    }
}

fun main(args: Array<String>) {
    /*
    * function foo is accessible from here
    * */
    foo("Some value")

    /*
    * function bar() is inner function so it is not accessible from here, so it is not possible to access it from outside
    * */



}