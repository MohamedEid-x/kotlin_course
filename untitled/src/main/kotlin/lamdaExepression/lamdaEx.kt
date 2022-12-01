package lamdaExepression



fun main() {
    val testFun = username("Mohamed")
    println(testFun)

    val testLambda = userName("Mohamed")
    println(testLambda)


    val testLambda2 = userInfo("Mohamed","Eid")
    println(testLambda)
}
    //lambda syntax
    //val lambdaName: (InputType) ->ReturnType = { Arguments:inputType ->Body}

    //lambda
    val userName:(String) ->String={name:String->"Hello $name" }

//also you can delete the input type and the return type

val userInfo={name:String, lastname:String->"Hello $name $lastname" }


// normal fun
    fun username(name:String):String{
        return "hello $name"
    }

