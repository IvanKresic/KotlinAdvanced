package com.ivankresic.kotlinadvanced.functions

/**
 * Created by ivan on 04/06/2020
 */

fun containingNumbers(){
    val numbers = 1..100
    numbers.forEach{
        if(it % 5 == 0){
            //allowed only on inline functions (forEach is inline function)
            return //This will return from containing function, and not from lambda expression, so it will never access and execute "Hello"
        }
    }
    println("Hello")
}

fun containingNumbers2(){
    val numbers = 1..100
    numbers.forEach{
        if(it % 5 == 0){
            return@forEach //This is local return, so it will return from "forEach", and not from containing function
        }
    }
    println("Hello")
}

fun containingNumbers3(){
    val numbers = 1..100
    numbers.forEach myLabel@{
        if(it % 5 == 0){
            return@myLabel //also we can explicitly define our labels and use them as return point
        }
    }
    println("Hello")
}

fun containingNumbersAnonymous(){
    val numbers = 1..100
    numbers.forEach (fun(element){
        if(element % 5 == 0)
            return //Because using anonymous function, here return is local return
    })
    println("Hello")
}
/**
 * Easy to remember, return will return to the closest 'fun'
 * */


fun main(args: Array<String>) {
    containingNumbers()
    containingNumbers2()
    containingNumbers3()
    containingNumbersAnonymous()
}