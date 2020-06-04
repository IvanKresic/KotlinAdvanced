package com.ivankresic.kotlinadvanced.functions

/**
 * Created by ivan on 04/06/2020
 */

                //function that takes integer and returns integer
fun op(x: Int, op: (Int) -> Int): Int{
    return op(x)
}

/*
* Anonymous function is way of defining function with full body and code without giving her a name
* */
fun main(args: Array<String>) {


    op(3, {it * it}) // can't define return type

    op(3, fun(x): Int{
        if(x > 10){
            return 0
        }
        else{
            return x * x
        }
        //enableing multiple return points
    })//anonymous function -> no name, but can define return type
}