package collectionsInKotlin

fun main() {
    val data= mutableListOf(1,3,3,4,5,4,3)
        data.forEach{println(it)}
    println("================================")
    data.add(30)
    data.forEach{println(it)}
    data.add(2,30)
    data.forEach{println(it)}
    data.remove(30)
    data.forEach{println(it)}
    data.removeAt(2)





}