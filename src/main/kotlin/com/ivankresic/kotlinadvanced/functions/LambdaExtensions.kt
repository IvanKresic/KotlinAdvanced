package com.ivankresic.kotlinadvanced.functions

/**
 * Created by ivan on 04/06/2020
 */


/**
 * For a better explanation of DSL -> domain - specific-language go here:
 * https://www.raywenderlich.com/2780058-domain-specific-languages-in-kotlin-getting-started
 * */

class Request(val method: String, val query: String, val contentType: String)
class Response(var contents: String, var status: Status){
    fun status(status: Status.() -> Unit){
        // ....
    }

    operator fun invoke(status: Status.() -> Unit){

    }
}

class Status(var code: Int, var description: String)

class RouteHandler(val request: Request, val response: Response){
    var executeNext = false
    fun next(){
        executeNext = true
    }
}

/*
* Function routeHandler is taking an extension function on RouteHandler, and return is also extension function
* that is then equal to the function beeing passed in
* */
fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun response(response: Response.() -> Unit) {}



/**
 * !!! THIS IS IMPORTANT !!!
 * Using lambda and extension functions we can access members of a class we are extending !!!!
 * */

fun main(args: Array<String>) {

    /*
    * We gain access to 'request' because 'request' is a property of a RouteHandler. Giving that this lambda is supposed to be
    * extension function to route handler, we already know that all extension functions have access to members of class
    * they are extending
    * */
    routeHandler("/index.html") {
        if(request.query.isNotBlank()){
            //process
        }

        /*
        response{ //this is function
            status { //this is member function
                code = 404 //this are properties
                description = "Not Found"
            }
        }
        */


        /**
         * Invoking Status extension we removed need for status member function, clearer code
         * */
        response{ //this is function
                code = 404 //this are properties
                description = "Not Found"
        }

        val manager = Manager()
        manager("Do something!")
    }
}

class Manager{
    operator fun invoke(value: String) {

    }

}