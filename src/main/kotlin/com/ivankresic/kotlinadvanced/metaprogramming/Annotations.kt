package com.ivankresic.kotlinadvanced.metaprogramming

/**
 * Created by ivan on 08/06/2020
 */

/**
 * We can provide custom annotations
 * */

@Target(AnnotationTarget.CLASS)
annotation class Table(val name: String)

@Target(AnnotationTarget.PROPERTY)
annotation class Field(val name: String)

@Table(name = "Contact table")
data class Contact(val id: Int, @Field( name= "NAME") val name: String, val email: String){

}

fun main(args: Array<String>) {
    val annotation = Contact::class.annotations.find { it.annotationClass.simpleName == "Table" }

    println(annotation)
}