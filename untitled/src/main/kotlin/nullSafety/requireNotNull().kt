package nullSafety

fun main() {


    // requireNotNull()

    var Name:String?=null
    //Throws an IllegalArgumentException if the value is null. Otherwise returns the not null value.
    val length= requireNotNull(Name).length //method used to safe the var from null
    println(length)
    //can change the exception message
    val length2= requireNotNull(Name,{"you must add value to the name"}).length
    println(length2)

}