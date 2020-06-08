package com.ivankresic.kotlinadvanced.delegation

import kotlin.reflect.KProperty

/**
 * Created by ivan on 08/06/2020
 */
class Service{
    var someProperty: String by ExternalFunctionality()
}

/**
 * What happens here, we externalized getter and setter, and they can be reused by using delegates
 * */
class ExternalFunctionality  {

    var backingField = "Default"

    operator fun getValue(service: Service, property: KProperty<*>): String {
        println("getValue() called with params:\n"
                + "Service-$service\n"
                + "Property-${property.name}")
        return backingField
    }

    operator fun setValue(service: Service, property: KProperty<*>, value: String) {
        backingField = value
    }
}

fun main(args: Array<String>) {
    val service = Service()

    println(service.someProperty)
    service.someProperty = "New value"
    println(service.someProperty)

}
