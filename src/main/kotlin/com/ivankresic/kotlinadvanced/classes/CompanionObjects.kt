package com.ivankresic.kotlinadvanced.classes

/**
 * Created by ivan on 04/06/2020
 */


//In order to hide constructor we add private constructor
class Log private constructor(){

    /**
     * Each class can have only single companion object!!!
     *
     * Companion is somewhat replacement for "static"
     * */

    companion object Factory{
        @JvmStatic fun createFileLog(filename: String): Log = Log(filename)
    }

    constructor(filename: String): this(){

    }


}

fun main(args: Array<String>) {

    val log = Log.createFileLog("some_file")

    //Here we can instatiate Log with constructor, but we want to enable instationating only with companion
    //We can do that by hiding constructor
    //Because using private constructor this is no longer available
    //val log1 = Log()
}