package collectionsInKotlin

fun main() {
    val data= mutableListOf(1,3,3,4,5,4,3)
        data.forEach{println(it)}
    println("================================")
    data.add(30) //add item to list
    data.forEach{println(it)}
    data.add(2,30) //add item with specific index
    data.forEach{println(it)}
    data.remove(30)//remove mention item
    data.forEach{println(it)}
    data.removeAt(2)// remove mention index






}