package com.ivankresic.kotlinadvanced.classes

/**
 * Created by ivan on 04/06/2020
 */
//It is not new type, it just replaces the name
typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email){
    fun printName(string: String){

    }
}

fun main(args: Array<String>) {
    val employee = Employee("Ivan", "ivan@mail.com")
    employee.printName("A string")
}