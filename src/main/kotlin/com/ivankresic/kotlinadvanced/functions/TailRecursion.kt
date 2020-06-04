package com.ivankresic.kotlinadvanced.functions

import java.util.concurrent.atomic.DoubleAccumulator

/**
 * Created by ivan on 04/06/2020
 */
/**
 * Tail recursion means last call should be call to the function itself
 * */



fun factorial(number: Int): Int{
    when(number){
        0, 1 -> return 1
        else -> return number * factorial(number - 1)
    }
}

/**
 * Factorial tail recursive --> last action of this function is call to itself
 *
 * By calling 'tailrec' the bytecode instead of calling itself  has basically replaced the call with GOTO!!
 *
 * Effectively  what tailrec optimization does is take a tailrecursive function  and optimize it,
 * and instead of having a function call itself with different input values, what it does is replace the call
 * with a for loop
 * */
tailrec fun factorialTR(number: Int, accumulator: Int = 1): Int {
    when(number){
        0 -> return accumulator
        else -> return factorialTR(number - 1, accumulator = number)
    }
}


fun main(args: Array<String>) {
    print(factorial(5))
    print(factorialTR(5))
}