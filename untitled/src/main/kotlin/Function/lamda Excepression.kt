package Function

 // val lambdaName: (InputType) ->ReturnType = { Arguments:inputType ->Body}

fun main() {
    val testFun = username("Mohamed")
    println(testFun)

    val testLambda = userName("Mohamed")
    println(testLambda)
}
//lambda syntax
//val lambdaName: (InputType) ->ReturnType = { Arguments:inputType ->Body}

//lambda
val userName:(String) ->String={name:String->"Hello $name" }

// normal fun
fun username(name:String):String{
    return "hello $name"
}
//How to use lambda fun as a fun paremeter

fun greeting2(block:()->Unit){
    repeat(5){println("-----")}
    block()
    repeat(5){println("-----")}
}

//function withn normal parameter
fun greeting(message:String)
{
    repeat(5){println("-----")}
    //Executes the given function action specified number of times.
    println(message)
    repeat(5){println("-----")}
}
