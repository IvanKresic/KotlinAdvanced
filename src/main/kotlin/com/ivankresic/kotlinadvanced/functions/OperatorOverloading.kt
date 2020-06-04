package com.ivankresic.kotlinadvanced.functions

/**
 * Created by ivan on 04/06/2020
 */

data class Time(val hours: Int, val mins: Int){

    //now that we overloaded plus, there is no more error in main fun with operator '+'
    operator fun plus(time: Time): Time{
        val minutes = this.mins + time.mins
        val hoursInMinutes = minutes/60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}

operator fun StringBuilder.plus(stringBuilder: StringBuilder){
    stringBuilder.forEach { this.append(it) }
}


fun main(args: Array<String>) {

    //What we want is add hours with the hours and minutes with the minutes
    //But initial this will not work
    val newTime = Time(10, 40) + Time(3, 20)

    println(newTime)


    val sb = StringBuilder()
    for (str in sb){
        str + "value"
    }
}