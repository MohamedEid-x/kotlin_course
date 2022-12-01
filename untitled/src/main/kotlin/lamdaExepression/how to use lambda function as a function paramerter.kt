package lamdaExepression

fun main() {
    //normal fun
greeting("hello Mohamed")
    println("__________________________________________________________________")

// calling function that you used lambda fun as a parameter
    greeting2 {  // if you used  lambda as  a parameter you should use  the curly braces with fun instead of the parentheses

        println("message 1")
        println("message 1")
        println("message 1")
        println("message 1")
    }
    println("__________________________________________________________________")
// pass argument to lambda fun
reapeter(5){index-> //do this code
    if (index<3){
        println("Hello")
    }else{
        println("Bye")
    }
}


}
fun greeting(message:String)
{
    repeat(5){println("-----")}
    //Executes the given function action specified number of times.
    println(message)
    repeat(5){println("-----")}
}

// instead of using more than one parameter you can use the lambda fun as a parameter
//val lambdaName: (InputType) ->ReturnType = { Arguments:inputType ->Body}
/*
block = lambdaName
() = inputType
Unit = return type
 */

fun greeting2(block:()->Unit){
    repeat(5){println("-----")}
    block()
    repeat(5){println("-----")}
}



fun reapeter(times:Int,message:(Int)->Unit){
    repeat(times){xx->message(xx)}
}