package com.ivankresic.kotlinadvanced.generics

import com.ivankresic.kotlinadvanced.classes.Customer

/**
 * Created by ivan on 08/06/2020
 */

open class Person()
class Employee: Person()

fun operate(person: List<Person>){

}

//because we are only reading we use out
interface ReadOnlyRepo<out T>{
    fun getById(id: Int): T
    fun getAll(): List<T>
}

//because we are only writing we use in
interface WriteRepo<in T> {
    fun save(obj: T)
    fun saveAll(list: List<T>)
}

fun main(args: Array<String>) {
    operate(listOf<Employee>())
    operate(listOf<Person>())

    val ro= ReadOnlyRepoImpl<Customer>()

    ro.getAll()
}