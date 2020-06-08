package com.ivankresic.kotlinadvanced.metaprogramming

import java.lang.reflect.Type

/**
 * Created by ivan on 08/06/2020
 */
class Transaction(val id: Int, val amount: Double, val description: String){
    fun validate(){
        if(amount > 10000){
            println("com.ivankresic.kotlinadvanced.metaprogramming -> Transaction is too large")
        }
    }
}

fun introspectInstance(obj: Any){
    println("Class ${obj.javaClass.simpleName}")
    println("Properties:\n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} is type ${it.type}")
    }
    println("Functions:\n")
    obj.javaClass.declaredMethods.forEach {
        println("${it.name}")
    }
}

fun getType(obj: Type){
    println(obj.typeName)
}

fun main(args: Array<String>) {
    //introspectInstance(Transaction(1, 200.0, "Simple transaction"))


    //Passing a type in Kotlin
    getType(Transaction::class.java)
}