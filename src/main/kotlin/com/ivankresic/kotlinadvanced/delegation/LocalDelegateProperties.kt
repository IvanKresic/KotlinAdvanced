package com.ivankresic.kotlinadvanced.delegation

/**
 * Created by ivan on 08/06/2020
 */
fun localDelegateProperties(){
    val lazy by lazy { initLate() }
}

fun initLate(): String {
    throw UnsupportedOperationException("not implemented")
}
