package Function

fun main() {

    greeting()
    println("------------------------")
    val x=greeting2()
    println(x)
    println("------------------------")
   val test= isPositive(-1)
    println(test)

}
// function without returned type

fun greeting(){
    println("Hello1")
}
// function with returned type must contain return keyword

fun greeting2():String //returned type
{
    return "Hello2"
}

// function with Parameter
fun isPositive(ref:Int):Boolean{
    return ref>=0

}


