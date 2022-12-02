package Infix

fun main() {

    //calling infix
    val sum = 3 add 4
    println(sum)
}

//  create infix
infix fun Int.add(value:Int):Int= this + value
// infix fun  keyword + type you will use with . name of the infix(must be one parameter):return type= do this code