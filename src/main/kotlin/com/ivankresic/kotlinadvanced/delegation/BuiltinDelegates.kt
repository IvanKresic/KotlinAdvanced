package com.ivankresic.kotlinadvanced.delegation

import kotlin.properties.Delegates

/**
 * Created by ivan on 08/06/2020
 */
//Check TypeAliases


class Veto{
    //This means if the newly assigned value does not start with 'S', does not assign the value
    var value: String by Delegates.vetoable("String") {property, oldValue, newValue -> newValue.startsWith("S")}
}

fun main(args: Array<String>) {
    val veto = Veto()

    println(veto.value)
    veto.value = "London"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)
}
