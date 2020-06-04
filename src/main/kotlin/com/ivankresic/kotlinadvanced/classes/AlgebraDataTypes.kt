package com.ivankresic.kotlinadvanced.classes

/**
 * Created by ivan on 04/06/2020
 */


/**
 * sealed -> Only this classes are going to inherit from PageResult (in this case: Success, Error, KaBoom)
 * it is also ok if the classes that are inheriting PageResult in the same File
 *
 * Using classes outside it gets a little bit cleaner code like in case of KaBoom
 * */
sealed class PageResult{
    class Success(val content: String): PageResult()
    class Error(val code: Int, val message: String): PageResult()
}

class KaBoom(val kaboom: String): PageResult()

fun getURLPage(url: String): PageResult {
    //
    val wasValidCall = false
    if(wasValidCall){
        return PageResult.Success("The content")
    }
    else{
        return PageResult.Error(404, "Not found")
    }
}

fun main(args: Array<String>) {
    val pageResult = getURLPage("/")

    when(pageResult){
        is PageResult.Success -> println(pageResult.content)
        is PageResult.Error -> println(pageResult.message)

        is KaBoom -> println(pageResult.kaboom)
    }
}