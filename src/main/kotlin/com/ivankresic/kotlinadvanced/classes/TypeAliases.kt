package com.ivankresic.kotlinadvanced.classes

import kotlin.properties.Delegates

/**
 * Created by ivan on 04/06/2020
 */
//It is not new type, it just replaces the name
typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email){

    /**
     * Returns a property delegate for a read/write property that calls a specified callback function when changed.
     * @param initialValue the initial value of the property.
     * @param onChange the callback which is called after the change of the property is made. The value of the property
     *  has already been changed when this callback is invoked.
     *
     *  @sample samples.properties.Delegates.observableDelegate
     */
    var department: String by Delegates.observable("") { property, oldValue, newValue ->
        println("Property: ${property.name} has changed from: $oldValue to: $newValue")
    }

    fun printName(string: String){

    }
}

fun main(args: Array<String>) {
    val employee = Employee("Ivan", "ivan@mail.com")
    employee.printName("A string")

    employee.department = "IT"
}