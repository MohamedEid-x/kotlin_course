package Function

fun main() {

    val x= double(3)
    println(x)
    val age= checkAge(16)
    println(age)

    val age2= checkAge2(15)
    println(age2)
}
//When a function returns a single expression, the curly braces can be omitted and the body is specified after a = symbol:
fun double(x:Int):Int=x*2


fun checkAge(age:Int)
{
      if (age<=18) println("your are not allowed to enter this site")else println("welcome to our site")
}
// checkAge with the single expression function

fun checkAge2(age:Int)=if (age<=18) println("your are not allowed to enter this site")else println("welcome to our site")