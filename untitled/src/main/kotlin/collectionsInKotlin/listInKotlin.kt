package collectionsInKotlin

fun main() {
// Returns a new read-only list of given elements
    val usersList= listOf(1,3,3,4,4,4) // Read-only list
    usersList.forEach { println(it) }

    val users= listOf(
        user("Mohamed","Eid"),  //its class created in the array.kt file
        user("Ahmed","Said")
    )
    val first= users[0]
    val first2= users.first() //Returns the first element matching the given predicate.
    println(first)
    println("_________________________")
    println(first2)
    println("_________________________")
    println("Enter your name")
    val name:String?= readLine()
    val stuff= if (name==null) emptyList() else listOf(name)
    println(stuff)









}