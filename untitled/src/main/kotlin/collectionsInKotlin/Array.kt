package collectionsInKotlin

fun main() {

    //create array
    val data= arrayOf(1,2,3,"mohamed") // array that accept any type of data
    //you can use tha array of specific type like intArrayOf() This array that accept only intgars
    data.forEach { println(it) }
println("_______________________________________________________________________________________")
val users= arrayOf(
    user("Mohamed","Eid"),
    user("Ahmed","Said")
)
    users.forEach { println(it) }


}


class user (firstName:String,lastName:String) //normal class that return the full name
{
    var fullName= "$firstName $lastName"

    override fun toString(): String { //override on the toString() method that return the fullName
        return fullName
    }
}