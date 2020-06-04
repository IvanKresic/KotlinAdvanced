package com.ivankresic.kotlinadvanced.classes

/**
 * Created by ivan on 04/06/2020
 */
class DirectoryExplorer(val user:String){

    //we can use private to hide it from upper usage

    /**
     * Defining class as inner class, we can access properties of outer class
     * */
    inner class PermissionCheck(){
        fun validatePassword() {
            if(user == "Ivan")
                println("Welcome $user")
        }

    }

    fun listFolder(folfer: String, user: String){
        val permissionCheck = PermissionCheck()

        permissionCheck.validatePassword()
    }
}

fun main(args: Array<String>) {
    val de = DirectoryExplorer("Ivan")
    //val pc = DirectoryExplorer.PermissionCheck()  ->  before inner

    //now it is accessible as instance of a class
    val pc = DirectoryExplorer("Ivan").PermissionCheck() // ->  after inner
}