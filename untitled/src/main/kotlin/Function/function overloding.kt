package Function

fun main() {
    //to overload a function you must these functions have the same name and not the same parameter

    userInfo("mohamed") //the first fun
    userInfo("Mohamed",22)//the second fun
}
fun userInfo(name:String){
    println("My name is $name")
}
//overload this function
fun userInfo(name:String,age:Int){
    println("My name is $name and i'm $age years old" )
}