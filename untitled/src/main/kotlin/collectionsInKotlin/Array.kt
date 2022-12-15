package collectionsInKotlin
/*  Array
1.How to create an array
2.How to use class with constructor inside the array
3.How to add a new items to the array
4.How to update any item with its index
 */

fun main() {

    //1.How to create an array
    val data= arrayOf(1,2,3,"mohamed") // array that accept any type of data
    data.forEach { println(it) }

    //you can use tha array of specific type like intArrayOf() This array that accept only integers
    val data2= intArrayOf(1,2,3,4,5,6) // array that contains Integers only you can use also double or long etc.
println("_______________________________________________________________________________________")
   // 2.How to use class with constructor inside the array

    val users= arrayOf(
        user("Mohamed","Eid"),
        user("Ahmed","Said"))
    users.forEach { println(it) }
    println("_______________________________________________________________________________________")

    // 3.How to add a new items to the array

// also you can add any data to this array with plus() method
    val updateUsers= users.plus(user("may","Mohamed"))
        updateUsers.forEach { println(it) }// to print data with updates
    println("_______________________________________________________________________________________")

    //4.How to update any item with its index
// edit item with its index
    users[0]=user("Ali","Samir")
    val Edit=users[0]
        println(Edit) //print update
        users.forEach { println(it) } //print all data in the array with last update


}


class user (firstName:String,lastName:String) //normal class that return the full name
{
    var fullName= "$firstName $lastName"

    override fun toString(): String { //override on the toString() method that return the fullName
        return fullName
    }
}