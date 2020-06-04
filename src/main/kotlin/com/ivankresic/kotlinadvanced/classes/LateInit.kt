package com.ivankresic.kotlinadvanced.classes

/**
 * Created by ivan on 04/06/2020
 */
interface Repository{
    fun getAll(): List<Customer>
}

class CustomerController(){
    lateinit var repository: Repository

    fun index(): String {
        return repository.getAll().toString()
    }
}

/**
 * Running this will end with:
 *
 * Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property repository has not been initialized
 * at com.ivankresic.kotlinadvanced.classes.CustomerController.index(LateInit.kt:14)
 * at com.ivankresic.kotlinadvanced.classes.LateInitKt.main(LateInit.kt:20)
 * */

/*
* Its not saving us from fact that we forgot to initialize something, but it is giving us a hint,
* not just throwing a null pointer exception
* */
fun main(args: Array<String>) {
    var customerController = CustomerController()
    customerController.index()
}