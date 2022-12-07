package nullSafety

fun main() {


    val name="Mohamed"
    //name=null  >>>> an error here because  if you possibly found null in  any variable you must add ? to its type
    println(name)

    var name2:String?="Mohamed"
    name2= null
    println(name2)


 // safe calls ?.
    var firstName:String?="Mohamed"
    val length=firstName?.length// possible found null or not so must add ?. after var name to safe it from null
    println(length)
    firstName=null
    println(length)



  // checking for null in condition (using if condition)

    var secondName:String?="Mohamed"
    if (secondName != null){
        println(secondName)
        }
    else{
        println("The first name is empty")}

    val length2=secondName?.substring(0,2)?.length
    println(length2)
}