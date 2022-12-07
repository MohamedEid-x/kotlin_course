package nullSafety

fun main() {

    //Elvis Operator ?:
    var lastName:String?="Mohamed Eid"

    //first try with normal if condition
    val length1=if(lastName!=null)lastName.length else 0
    println(length1)

    //with elvis operator
    val length2= lastName?.substring(0,3) ?: 0
    println(length2)

    // ?. for safe call
    // ?: for elvis Operator means if not do this code after
}