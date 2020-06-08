package com.ivankresic.kotlinadvanced.generics

import java.io.Serializable


/**
 * Created by ivan on 08/06/2020
 */

//T can be Any?

open class Entity(val id: Int)


class CustomerEntity : Entity(1) {
}


/**
 * Whenever you instatiate class Repository, you can pass in only classes that inherit class Entity
 *
 * So type parameter 'T' can be restricted
 * */

//single restriction
class Repository<T: Entity>{
    fun save(entity: T){
        if(entity.id != 0){
            //...
        }
    }
}


class Repository2<T> where T: Entity, T:Serializable {
    fun save(entity: T){
        if(entity.id != 0){
            //...
        }
    }
}


//Similar for functions
fun <T: Serializable> streamObject(obj: T){

}


fun main(args: Array<String>) {
    val repo = Repository<CustomerEntity>()
}


