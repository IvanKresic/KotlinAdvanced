package com.ivankresic.kotlinadvanced.delegation

import com.ivankresic.kotlinadvanced.classes.Customer

/**
 * Created by ivan on 08/06/2020
 */

interface Repository{
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger{
    fun logAll()
}


/**
 * We can delegate in this way --> Repository by repository
 * In this way we can remove val in parameters, because now the dependency is passed in, and it's no longer a property
 * */
/*
* Delegate the functionality of Repository to the parameter passed in to Controller
* */
//This is delegation of first class member functions
class Controller(repository: Repository, logger: Logger): Repository by repository, Logger by logger{

    fun index(): String{

        /*
        * Because repository is no longer a property, we cannot access it that way,
        * but we can access it's members directly
        * */
        getAll()
        logAll()
        return "This is the end, my only friend, the end!"
    }
}

/*
* The advice is not to use too many delegates in addition to avoid members with same name,
* because in that case we don't know witch one we are calling
*/